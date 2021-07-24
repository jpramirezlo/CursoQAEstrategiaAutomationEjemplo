package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaLogin {

  @FindBy(css = "input[id='email']")
  WebElement cajaEmail;

  @FindBy(css = "input[id='passwd']")
  WebElement cajaPassword;

  @FindBy(css = "button[id='SubmitLogin']")
  WebElement botonSign;

  public void ingresarEmail(String email) {
    cajaEmail.sendKeys(email);
  }

  public void ingresarPassword(String password) {
    cajaPassword.sendKeys(password);
  }

  public void hacerClicEnIngresar() {
    botonSign.click();
  }

  public void identificarse(String email, String password){
    ingresarEmail(email);
    ingresarPassword(password);
    hacerClicEnIngresar();
  }

  public PaginaLogin(WebDriver driver) {
    PageFactory.initElements(driver, this);
  }
}
