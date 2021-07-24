package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaPrincipal{

    @FindBy(css = "a[class='login']")
    WebElement botonSignIn;

    public void irASignIn(){
        botonSignIn.click();
    }

    //Se crea constructor y se le pasa el driver
    public PaginaPrincipal(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
