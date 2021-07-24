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

public class Compra {

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
  public void hacer_una_compra() {


  }

  @After
  public void cerrarDriver() {

    // Cerrar ventana, apagar driver
    chromeDriver.quit();
  }
}
