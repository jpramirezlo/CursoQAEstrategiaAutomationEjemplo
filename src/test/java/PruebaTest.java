import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class PruebaTest {

  protected WebDriver chromeDriver;

  @Test
  public void hacer_una_busqueda() {
    //Encontrar archivo exe de chromedriver
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

    //Creamos opciones sobre nuestro driver
    ChromeOptions options = new ChromeOptions();
    options.setCapability("marionette", false);

    //Nueva instancia de ChromeDriver
    chromeDriver = new ChromeDriver(options);

    //Definimos tiempo de espera hasta que aceptemos un timeOut
    chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //Abrimos una URL
    chromeDriver.get("https://www.google.com");

    //Encontrar e interactuar con elementos
  }
}
