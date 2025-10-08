package Punto2.behaviors.NotificacionPromocion;

public class NotificacionEmail implements NotificacionPromocionBehavior{

    @Override
    public void show() {
        System.out.println("Prefiero recibir notificaciones de promociones por correo electronico");
    }
    
}
