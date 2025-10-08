package Punto2.model;

import Punto2.behaviors.NotificacionPromocion.NotificacionPromocionBehavior;
import Punto2.behaviors.NotificacionSaldo.NotificacionSaldoBehavior;
import Punto2.behaviors.NotificacionTransacciones.NotificacionTransaccionBehavior;

public class Usuario {
    private String nombre;
    private String aplicacion;
    private NotificacionTransaccionBehavior notificacionTransacciones;
    private NotificacionSaldoBehavior notificacionAlertaSaldo;
    private NotificacionPromocionBehavior notificacionPromociones;

    public Usuario(String nombre, String aplicacion) {
        this.nombre = nombre;
        this.aplicacion = aplicacion;
    }

    public void display() {
        System.out.println("Soy " + nombre + " Estoy usando " + aplicacion + "\nY esta es mi configuracion de notificaciones:");
        mostrarNotificaciones();
    }

    public void mostrarNotificaciones() {
        notificacionTransacciones.show();
        notificacionAlertaSaldo.show();
        notificacionPromociones.show();
    }

    public void setNotificaciones(NotificacionTransaccionBehavior ntb, NotificacionSaldoBehavior nsb, NotificacionPromocionBehavior npb) {
        this.notificacionTransacciones = ntb;
        this.notificacionAlertaSaldo = nsb;
        this.notificacionPromociones = npb;
    }



    
}
