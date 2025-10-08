package Punto2.behaviors.NotificacionSaldo;

public class NotificacionAlerta implements NotificacionSaldoBehavior{

    @Override
    public void show() {
        System.out.println("Prefiero recibir notificaciones a modo de alerta cuando mi saldo baja de cierto punto");
    }
    
}
