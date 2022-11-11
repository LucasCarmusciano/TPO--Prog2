package ListaVinculada.Comparadores;

import java.util.Comparator;

public class ComparadorStringDesc implements Comparator<Object>{

    @Override
    public int compare(Object o1, Object o2) {
        return ((-1)*((String)o1).compareTo((String)o2));
    } 
}
