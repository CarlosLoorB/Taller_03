package SeccionB_Original;

public class PagoPaypal extends Pago {
	private boolean loggedin;

	@Override
	public void realizarCobro(double monto) {

		if (!loggedin) {
			return;
		} else {
			// cargar el monto de compra al medio de pago
		}

	}
}