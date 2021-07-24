package pruebas;

import org.junit.Assert;
import org.junit.Test;

public class Compra extends BaseTestSuite {

  @Test
  public void hacer_una_compra() throws InterruptedException {
    paginaPrincipal.irASignIn();
    paginaLogin.identificarse("variedadesbethel2@gmail.com", "monocuco//");
    paginaMyAccount.seleccionarCategoria();
    paginaCategoria.seleccionarElementoCompra();
    paginaOrderSummary.hacerClicEnBotonSummary();
    paginaOrderAddress.hacerClicBotonAddress();
    paginaOrderShipping.continuarCompra();
    paginaOrderPayment.realizarPago();
    paginaConfirmacionCompra.confirmarCompra();
    Assert.assertTrue(paginaConfirmacionCompra.resultadoDeOrden("Your order on My Store is complete."));
  }
}
