package ListaVinculadaComposite.Comparadores;

import java.util.Comparator;

public class OrdenarString implements Comparator<Object>{
 
    @Override
    public int compare(Object o1, Object o2) {
        return (((String)o1).compareTo((String)o2));
    }
}