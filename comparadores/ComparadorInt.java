package comparadores;

import java.util.Comparator;

public class ComparadorInt implements Comparator<Object>  {

    private Integer o1;
    private Integer o2;

    @Override
    public int compare(Object o1, Object o2) {
        this.o1 = (Integer) o1;
        this.o2 = (Integer) o2;
        return this.o1-this.o2;
    }
}
