package SeccionB_Corregido;

public class PagoPaypal implements Pago {
	private boolean loggedin;

	@Override
	public void realizarCobro(double monto) {

		if (!loggedin) {
			return;
		} else {
			// cargar el monto de compra al medio de pago
		}

	}

	@Override
	public void calcularImpuestosFactura() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void generarFactura() {
		// TODO Auto-generated method stub
	}
}