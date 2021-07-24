package pruebas;

import org.junit.Test;

public class Compra extends BaseTestSuite {

  @Test
  public void hacer_una_compra() throws InterruptedException {

    // Abrir la URL
    chromeDriver.get("http://automationpractice.com/index.php");

    paginaPrincipal.irASignIn();

    paginaLogin.identificarse("variedadesbethel2@gmail.com", "monocuco//");

    paginaMyAccount.seleccionarCategoria();

    paginaCategoria.seleccionarElementoCompra();

    paginaOrderSummary.hacerClicEnBotonSummary();

    paginaOrderAddress.hacerClicBotonAddress();

    paginaOrderShipping.continuarCompra();

    paginaOrderPayment.realizarPago();

    paginaConfirmacionCompra.confirmarCompra();
  }
}
