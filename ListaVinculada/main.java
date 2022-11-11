package ListaVinculada;

import java.util.Comparator;
import java.util.Iterator;

import ListaVinculada.Comparadores.*;

public class main {
    public static void main(String[] args) {
        // String a = new String("a");
        // String b = new String("e");
        // String c = new String("c");
        // String d = new String("e");
        // String e = new String("e");
        // String f = new String("f");

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 4;
        Integer e = 5;
        Integer f = 6;


        Nodo n1 = new Nodo(a);
        Comparator<Object> compS1 = new ComparadorStringAsc();
        Comparator<Object> compS2 = new ComparadorStringDesc();
        Comparator<Object> compI1 = new ComparadorIntegerAsc();
        Comparator<Object> compI2 = new ComparadorIntegerDesc();

        ListaEnlazada lista = new ListaEnlazada(n1, compI2);
        lista.addNodo(b);
        lista.addNodo(c);
        lista.addNodo(d);
        lista.addNodo(e);
        lista.addNodo(f);

        Iterator<Nodo> it = lista.iterator();

        while(it.hasNext()){
            System.out.println(it.next().getElemento());
        }
    }
}
