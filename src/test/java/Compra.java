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
import org.openqa.selenium.interactions.Actions;

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
  public void hacer_una_compra() throws InterruptedException {

    //Abrir la URL
    chromeDriver.get("http://automationpractice.com/index.php");

    //Boton de sign in
    WebElement botonSignIn = chromeDriver.findElement(By.cssSelector("a[class='login']"));
    botonSignIn.click();

    //Inpunt de email
    WebElement cajaEmail = chromeDriver.findElement(By.cssSelector("input[id='email']"));
    cajaEmail.sendKeys("variedadesbethel2@gmail.com");

    //Inpunt password
    WebElement cajaPassword = chromeDriver.findElement(By.cssSelector("input[id='passwd']"));
    cajaPassword.sendKeys("monocuco//");

    //Boton Sign In
    WebElement botonSign = chromeDriver.findElement(By.cssSelector("button[id='SubmitLogin']"));
    botonSign.click();

    //Opcion T-Shirts
    WebElement pestañaTshirts = chromeDriver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]"));
    pestañaTshirts.click();

    //Crear accion
    Actions accion = new Actions(chromeDriver);

    //Encontrar la imagen del producto
    WebElement imagenCompra = chromeDriver.findElement(By.cssSelector("div[class='product-image-container']"));

    accion.moveToElement(imagenCompra).moveToElement(chromeDriver.findElement(By.cssSelector("a[title='Add to cart']")))
            .click().build().perform();

    WebElement botonCompra1 = chromeDriver.findElement(By.cssSelector("a[class='btn btn-default button button-medium']"));
    botonCompra1.click();

    WebElement botonCompra2 = chromeDriver.findElement(By.cssSelector("a[class='button btn btn-default standard-checkout button-medium']"));
    botonCompra2.click();

    WebElement botonCompra3 = chromeDriver.findElement(By.cssSelector("button[class='button btn btn-default button-medium']"));
    botonCompra3.click();

    WebElement checkAccept = chromeDriver.findElement(By.cssSelector("input[type='checkbox']"));
    checkAccept.click();

    WebElement botonCompra4 = chromeDriver.findElement(By.cssSelector("button[class='button btn btn-default standard-checkout button-medium']"));
    botonCompra4.click();

    WebElement metodoPagoCheque = chromeDriver.findElement(By.cssSelector("a[title='Pay by check.']"));
    metodoPagoCheque.click();

    WebElement botonConfirmarCompra = chromeDriver.findElement(By.cssSelector("button[class='button btn btn-default button-medium']"));
    botonConfirmarCompra.click();

    WebElement bannerOrdenCompleta = chromeDriver.findElement(By.cssSelector("p[class='alert alert-success']"));

    Assert.assertTrue(bannerOrdenCompleta.isDisplayed());

    Thread.sleep(40000);

  }

  @After
  public void cerrarDriver() {

    // Cerrar ventana, apagar driver
    chromeDriver.quit();
  }
}
