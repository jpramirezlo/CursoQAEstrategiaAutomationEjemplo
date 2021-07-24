package pruebas;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageobjects.*;

import java.util.concurrent.TimeUnit;

public class BaseTestSuite {

    protected WebDriver chromeDriver;

    PaginaPrincipal paginaPrincipal;
    PaginaLogin paginaLogin;
    PaginaMyAccount paginaMyAccount;
    PaginaCategoria paginaCategoria;
    PaginaOrderSummary paginaOrderSummary;
    PaginaOrderAddress paginaOrderAddress;
    PaginaOrderShipping paginaOrderShipping;
    PaginaOrderPayment paginaOrderPayment;
    PaginaConfirmacionCompra paginaConfirmacionCompra;

    private void inicializarPaginas(WebDriver driver){
        paginaPrincipal = new PaginaPrincipal(driver);
        paginaLogin = new PaginaLogin(driver);
        paginaMyAccount = new PaginaMyAccount(driver);
        paginaCategoria = new PaginaCategoria(driver);
        paginaOrderSummary = new PaginaOrderSummary(driver);
        paginaOrderAddress = new PaginaOrderAddress(driver);
        paginaOrderShipping = new PaginaOrderShipping(driver);
        paginaOrderPayment = new PaginaOrderPayment(driver);
        paginaConfirmacionCompra = new PaginaConfirmacionCompra(driver);
    }

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

        inicializarPaginas(chromeDriver);

        // Abrir la URL
        chromeDriver.get("http://automationpractice.com/index.php");
    }

    @After
    public void cerrarDriver() {

        // Cerrar ventana, apagar driver
        chromeDriver.quit();
    }
}
