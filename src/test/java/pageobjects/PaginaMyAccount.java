package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaMyAccount {

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]")
    WebElement pestañaTshirts;

    public void seleccionarCategoria(){
        pestañaTshirts.click();
    }

    public PaginaMyAccount(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
