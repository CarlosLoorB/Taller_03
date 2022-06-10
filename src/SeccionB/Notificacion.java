package SeccionB;

public class Notificacion {

	private int tipoNotificacion;

	public void Notificar(Pago pago) {
		if (tipoNotificacion == 1) {
			// enviarEmail();
		} else {
//		  enviarSMS();
		}
	}

}
