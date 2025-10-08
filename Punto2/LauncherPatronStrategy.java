package Punto2;

import Punto2.behaviors.NotificacionPromocion.*;
import Punto2.behaviors.NotificacionSaldo.*;
import Punto2.behaviors.NotificacionTransacciones.*;
import Punto2.model.Usuario;

public class LauncherPatronStrategy {
    public static void main(String[] args) {
        
        NotificacionTransaccionBehavior transaccionTipo1 = new NotificacionInstantanea();
        NotificacionTransaccionBehavior transaccionTipo2 = new NotificacionReporte();
        NotificacionSaldoBehavior saldoTipo1 = new NotificacionAlerta();
        NotificacionSaldoBehavior saldoTipo2 = new NoNotificacionSaldo();
        NotificacionPromocionBehavior promocionTipo1 = new NotificacionEmail();
        NotificacionPromocionBehavior promocionTipo2 = new NotificacionSMS();

        System.out.println(">> Probamos con un usuario que tenga la configuracion de notificaciones 'predeterminada'");
        Usuario usuario1 = new Usuario("Jose", "Nequi");
        usuario1.setNotificaciones(transaccionTipo1, saldoTipo1, promocionTipo1);
        usuario1.display();

        System.out.println("\n>> Probamos con un usuario que tenga otras configuraciones de notificacion");
        Usuario usuario2 = new Usuario("Tomas", "Daviplata");
        usuario2.setNotificaciones(transaccionTipo2, saldoTipo2, promocionTipo2);
        usuario2.display();
    }
}
