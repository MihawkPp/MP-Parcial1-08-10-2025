package Punto1.Sujetos;

import java.util.ArrayList;
import Punto1.Observadores.Observer;

public class UniversidadCentral implements Sujeto{

    private ArrayList<Observer> observadores;
    private ArrayList<String> cursosOfertados;

    public UniversidadCentral() {
        observadores = new ArrayList<>();
        cursosOfertados = new ArrayList<>();

        this.cursosOfertados.add("inteligencia artificial aplicada a la educación");
        this.cursosOfertados.add("la pedagogía decolonial");
        this.cursosOfertados.add("las ciudades inteligentes");
    }

    @Override
    public void agregarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservador(ArrayList<String> cursosOfertados) {
        for(Observer o : observadores) {
            o.update(cursosOfertados);
        }
    }

    public ArrayList<String> getCursos() {
        return cursosOfertados;
    }
}
