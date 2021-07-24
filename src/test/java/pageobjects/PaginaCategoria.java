package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaCategoria {

  WebDriver driver;

  @FindBy(css = "div[class='product-image-container']")
  WebElement imagenCompra;

  @FindBy(css = "a[title='Add to cart']")
  WebElement agregarAlCarro;

  @FindBy(css = "a[class='btn btn-default button button-medium']")
  WebElement botonCompra1;

  public void seleccionarElementoCompra() {
    Actions accion = new Actions(this.driver);
    accion.moveToElement(imagenCompra).moveToElement(agregarAlCarro)
            .click().build().perform();
    botonCompra1.click();
  }

  public PaginaCategoria(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }
}
