package Punto2.behaviors.NotificacionTransacciones;

public class NotificacionInstantanea implements NotificacionTransaccionBehavior {

    @Override
    public void show() {
        System.out.println("Prefiero recibir notificaciones instantaneas por cada transaccion.");
    }
    
}
