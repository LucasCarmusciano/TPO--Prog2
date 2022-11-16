package ListaVinculadaComposite.Comparadores;

import java.util.Comparator;

public class OrdenarInteger implements Comparator<Object>{
 
    @Override
    public int compare(Object o1, Object o2) {
        return (((Integer)o1).compareTo((Integer)o2));
    }
}
