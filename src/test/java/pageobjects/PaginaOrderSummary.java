package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaOrderSummary {

  @FindBy(css = "a[class='button btn btn-default standard-checkout button-medium']")
  WebElement botonCompra2;

  public void hacerClicEnBotonSummary(){
    botonCompra2.click();
  }

  //    WebElement botonCompra2 = chromeDriver.findElement(By.cssSelector("a[class='button btn
  // btn-default standard-checkout button-medium']"));
  //    botonCompra2.click();

  public PaginaOrderSummary(WebDriver driver) {
    PageFactory.initElements(driver, this);
  }
}
