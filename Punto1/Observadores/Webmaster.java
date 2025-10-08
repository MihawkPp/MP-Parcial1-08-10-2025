package Punto1.Observadores;

import java.util.ArrayList;

public class Webmaster implements Observer, Display{

    private ArrayList<String> cursosOfertados;

    public Webmaster() {

    }

    @Override
    public void display() {
        System.out.println("Actualizando el sitio web del area EDCO...");
        System.out.println("Los cursos ofertados actualmente son:");
        for(String cursos : cursosOfertados) {
            System.out.println("- " + cursos);
        }
        System.out.println("Informado por: Andrea Mahecha\n");
    }

    @Override
    public void update(ArrayList<String> cursosOfertados) {
        this.cursosOfertados = cursosOfertados;
        display();
    }
    
}
