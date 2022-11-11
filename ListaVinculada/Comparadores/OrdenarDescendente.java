package ListaVinculada.Comparadores;

import java.util.Comparator;

import ListaVinculada.Alumno;

public class OrdenarDescendente implements Comparator<Object>{

    private Comparator<Object> c;
    private Alumno a1,a2;
    
        
    public OrdenarDescendente(Comparator<Object> c) {
        this.c = c;
    }

    @Override
    public int compare(Object o1, Object o2) {
        this.a1=(Alumno) o1;
        this.a2=(Alumno) o2;
        return ((-1)*(c.compare(a1, a2)));
    }
}
