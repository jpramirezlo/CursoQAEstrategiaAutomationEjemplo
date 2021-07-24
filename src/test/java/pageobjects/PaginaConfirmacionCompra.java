package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaConfirmacionCompra {

    @FindBy(css = "p[class='alert alert-success']")
    WebElement bannerOrdenCompleta;

    public void confirmarCompra() throws InterruptedException {
        Assert.assertTrue(bannerOrdenCompleta.isDisplayed());
        Thread.sleep(10000);
    }

    public PaginaConfirmacionCompra(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
}
