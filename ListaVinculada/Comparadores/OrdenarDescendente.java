package ListaVinculada.Comparadores;

import java.util.Comparator;

import ListaVinculada.Alumno;

public class OrdenarDescendente implements Comparator<Object>{

    private Comparator<Object> c;    
        
    public OrdenarDescendente(Comparator<Object> c) {
        this.c = c;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return ((-1)*(c.compare(o1, o2)));
    }
}
