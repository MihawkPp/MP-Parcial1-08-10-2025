package Punto2.behaviors.NotificacionTransacciones;

public class NotificacionReporte implements NotificacionTransaccionBehavior {

    @Override
    public void show() {
        System.out.println("Prefiero recibir reportes con cierta frecuencia de tiempo");
    }
    
}
