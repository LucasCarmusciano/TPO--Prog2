package principal;

import comparadores.ComparadorInt;
import comparadores.ComparadorString;
import comparadores.OrdenarCompuesto;
import comparadores.OrdenarDNI;
import comparadores.OrdenarPorApellido;
import comparadores.OrdenarPorNombre;

import java.util.Comparator;
import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		
       
      /*String a = new String("a");
        String b = new String("e");
        String c = new String("c");
        String d = new String("e");
        String e = new String("e");
        String f = new String("f");
        */
     // Comparator<Object> compS1 = new ComparadorString();
        
        Alumno alumno1 = new Alumno("Luis","Rodriguez",1231);
        Alumno alumno2 = new Alumno("Felipe","Carlos",1342);
        Alumno alumno3 = new Alumno("Juan","Perez",412);
        Alumno alumno4 = new Alumno("Jorge","Gomez",45555);
        Alumno alumno5 = new Alumno("Martin","Diaz",41112);
        Alumno alumno6 = new Alumno("Juan","Perez",423333);
        Alumno alumno7 = new Alumno("Fernando","Lopez",12222);

        Comparator<Object> apellido = new OrdenarPorApellido();
        Comparator<Object> nombre = new OrdenarPorNombre();
        Comparator<Object> dni = new OrdenarDNI();
        Comparator<Object> compuesto = new OrdenarCompuesto(apellido,nombre);
        Comparator<Object> compuesto1 = new OrdenarCompuesto(compuesto,dni);

        ListaEnlazada lista = new ListaEnlazada(compuesto);
   
        lista.addNodo(alumno1);
        lista.addNodo(alumno2);
        lista.addNodo(alumno3);
        lista.addNodo(alumno4);
        lista.addNodo(alumno5);
        lista.addNodo(alumno6);
        lista.addNodo(alumno7);
        //lista.addNodo(e);
        //lista.addNodo(f);
 
        
        for(Nodo s: lista)
        	System.out.println(s);
        

      //  lista.imprimir();
        
        
        lista.eliminarOcurrencias(alumno6);
        System.out.println("---------------------");

        for(Nodo s: lista)
        	System.out.println(s);
        
        
      //  lista.imprimir();
    }
}
