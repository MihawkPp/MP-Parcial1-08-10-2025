package Punto1;

import Punto1.Observadores.*;
import Punto1.Sujetos.*;

public class LauncherPatronObserver {
    
    public static void main(String[] args) {
        
        UniversidadCentral UniversidadNotificaciones = new UniversidadCentral();
        
        Webmaster WebmasterDisplay = new Webmaster();
        Periodista PeriodistaDisplay = new Periodista();
        CommunityManager CommunityManager = new CommunityManager();
        
        UniversidadNotificaciones.agregarObservador(WebmasterDisplay);       
        UniversidadNotificaciones.agregarObservador(PeriodistaDisplay);        
        UniversidadNotificaciones.agregarObservador(CommunityManager);
        
        System.out.println(">> Probamos que todos los observadores reciban notificaciones\n");
        UniversidadNotificaciones.notificarObservador(UniversidadNotificaciones.getCursos());
        
        System.out.println("\n>> Probamos remover Observadores y notificarlos\n"); 
        UniversidadNotificaciones.removerObservador(CommunityManager);
        UniversidadNotificaciones.removerObservador(PeriodistaDisplay);
        UniversidadNotificaciones.notificarObservador(UniversidadNotificaciones.getCursos());
        
        System.out.println("\n>> Probamos agregar Observadores nuevamente y volver a notificarlos\n");
        UniversidadNotificaciones.agregarObservador(PeriodistaDisplay);
        UniversidadNotificaciones.notificarObservador(UniversidadNotificaciones.getCursos());
        
        System.out.println(">> Probamos quitar cursos y volver a notificar");
        UniversidadNotificaciones.getCursos().remove("inteligencia artificial aplicada a la educación");
        UniversidadNotificaciones.notificarObservador(UniversidadNotificaciones.getCursos());

        System.out.println(">> Fin del punto 1");
        
    }

}
