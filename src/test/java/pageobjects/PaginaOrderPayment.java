package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaOrderPayment {

    @FindBy(css = "a[title='Pay by check.']")
    WebElement metodoPagoCheque;

    @FindBy(css = "button[class='button btn btn-default button-medium']")
    WebElement botonConfirmarCompra;

    public void realizarPago(){
        metodoPagoCheque.click();
        botonConfirmarCompra.click();
    }

    public PaginaOrderPayment(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
