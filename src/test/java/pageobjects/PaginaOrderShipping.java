package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaOrderShipping {

    @FindBy(css = "input[type='checkbox']")
    WebElement checkAccept;

    @FindBy(css = "button[class='button btn btn-default standard-checkout button-medium']")
    WebElement botonCompra4;

    public void continuarCompra(){
        checkAccept.click();
        botonCompra4.click();
    }

    public PaginaOrderShipping(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
