package ListaVinculada.Comparadores;

import java.util.Comparator;

public class ComparadorIntegerDesc implements Comparator<Object>{

    @Override
    public int compare(Object o1, Object o2) {
        return ((-1)*((Integer)o1).compareTo((Integer)o2));
    }
    
}