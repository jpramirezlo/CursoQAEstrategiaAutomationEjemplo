package pruebas;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class PruebaTest {

  protected WebDriver chromeDriver;

  @Before
  public void abrirDriver() {

    // Encontrar archivo exe de chromedriver
    System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");

    // Creamos opciones sobre nuestro driver
    ChromeOptions options = new ChromeOptions();
    options.setCapability("marionette", false);

    // Nueva instancia de ChromeDriver
    chromeDriver = new ChromeDriver(options);

    // Definimos tiempo de espera hasta que aceptemos un timeOut
    chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void hacer_una_busqueda() {

    // Abrimos una URL
    chromeDriver.get("https://www.google.com");

    // Encontrar e interactuar con elementos

    // Ingresar texto en el buscador
    chromeDriver
        .findElement(By.cssSelector("input[name='q']"))
        .sendKeys("Cantidad de paises en America");

    // Presionamos la tecla Enter
    chromeDriver.findElement(By.cssSelector("input[name='q']")).sendKeys(Keys.ENTER);

    // Hacer click sobre el link deseado
    chromeDriver
        .findElement(
            By.cssSelector("#rso > div:nth-child(11) > div > div.tF2Cxc > div.yuRUbf > a > h3"))
        .click();

    // Creamos un elemento web para poder hacer acciones avanzadas
    WebElement subtitulo =
        chromeDriver.findElement(By.xpath("//*[@id=\"post-7002\"]/div/p[2]/span[1]/strong"));

    // Verificar que la cantidad de paises en America sigan siendo 35
    Assert.assertTrue(subtitulo.getText().contains("35"));
  }

  @After
  public void cerrarDriver() {

    // Cerrar ventana, apagar driver
    chromeDriver.quit();
  }
}
