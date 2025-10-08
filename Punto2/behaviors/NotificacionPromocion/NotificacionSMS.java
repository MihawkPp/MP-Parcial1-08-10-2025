package Punto2.behaviors.NotificacionPromocion;

public class NotificacionSMS implements NotificacionPromocionBehavior{

    @Override
    public void show() {
        System.out.println("Prefiero recibir promociones via SMS");
    }
    
}
