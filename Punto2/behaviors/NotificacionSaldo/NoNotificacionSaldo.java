package Punto2.behaviors.NotificacionSaldo;

public class NoNotificacionSaldo implements NotificacionSaldoBehavior{
    
    @Override
    public void show() {
        System.out.println("Prefiero no recibir este tipo de notificaciones");
    }
}
