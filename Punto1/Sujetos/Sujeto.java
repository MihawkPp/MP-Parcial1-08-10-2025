package Punto1.Sujetos;
import java.util.ArrayList;

import Punto1.Observadores.Observer;

public interface Sujeto {
    
    public void agregarObservador(Observer o);

    public void removerObservador(Observer o);

    public void notificarObservador(ArrayList<String> cursosOfertados);
    

}
