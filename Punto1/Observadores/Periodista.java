package Punto1.Observadores;

import java.util.ArrayList;

public class Periodista implements Observer, Display{

    private ArrayList<String> cursosOfertados;

    public Periodista() {

    }

    @Override
    public void display() {
        System.out.println("Buenos diaaas radio Universidad Central, continuando con el programa de Maestros y Aprendizaje");
        System.out.println("Los cursos ofertados actualmente son:");
        for(String cursos : cursosOfertados) {
            System.out.println("- " + cursos);
        }
        System.out.println("Informado por: Luz Dary\n");
    }

    @Override
    public void update(ArrayList<String> cursosOfertados) {
        this.cursosOfertados = cursosOfertados;
        display();
    }
    
}
