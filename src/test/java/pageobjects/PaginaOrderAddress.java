package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaOrderAddress {

  @FindBy(css = "button[class='button btn btn-default button-medium']")
  WebElement botonCompra3;

  public void hacerClicBotonAddress(){
    botonCompra3.click();
  }

  //    WebElement botonCompra3 = chromeDriver.findElement(By.cssSelector("button[class='button btn
  // btn-default button-medium']"));
  //    botonCompra3.click();

  public PaginaOrderAddress(WebDriver driver) {
    PageFactory.initElements(driver, this);
  }
}
