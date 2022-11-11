package comparadores;

import java.util.Comparator;

import principal.Nodo;

public class ComparadorString implements Comparator<Object> {

    private String o1;
    private String o2;
    @Override
	    public int compare(Object o1, Object o2) {
    	this.o1 = (String) o1;
    	this.o2 = (String) o2;
	        return this.o1.compareTo(this.o2);
	    }

}
