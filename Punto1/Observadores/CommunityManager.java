package Punto1.Observadores;

import java.util.ArrayList;

public class CommunityManager implements Observer, Display {
    
    private ArrayList<String> cursosOfertados;

    public CommunityManager() {

    }

    @Override
    public void display() {
        System.out.println("Publicando posts en redes sociales...");
        System.out.println("Los cursos ofertados actualmente son:");
        for(String cursos : cursosOfertados) {
            System.out.println("- " + cursos);
        }
        System.out.println("Informado por: Laura Molano\n");
    }

    @Override
    public void update(ArrayList<String> cursosOfertados) {
        this.cursosOfertados = cursosOfertados;
        display();
    }
    
}
