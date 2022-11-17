package ListaVinculadaComposite;

import java.util.Comparator;

import ListaVinculadaComposite.Comparadores.*;

public class test {
    public static void main(String[] args) {
        // PUNTO (a)
        System.out.println("-----------A-----------");
        Comparator<Object> numero = new OrdenarInteger();
        ListaEnlazada listaA = new ListaEnlazada(numero);
        Integer i1 = 10;
        Integer i2 = 21;
        Integer i3 = 1;
        Integer i4 = 5;
        Integer i5 = 11;

        listaA.addNodo(i1);
        listaA.addNodo(i2);
        listaA.addNodo(i3);
        listaA.addNodo(i4);
        listaA.addNodo(i5);


        // PUNTO (b)

        for(Nodo s: listaA){
        	System.out.println(s);
        }
        System.out.println("-----------------------");


        // PUNTO (c)
        System.out.println("-----------B-----------");

        listaA.eliminar(0);
        listaA.eliminarOcurrencias(5);
        listaA.eliminarOcurrencias(11);
        for(Nodo s: listaA){
        	System.out.println(s);
        }
        System.out.println("-----------------------");


        // PUNTO (d)
        System.out.println("-----------D-----------");
        Comparator<Object> strings = new OrdenarString();
        ListaEnlazada listaD = new ListaEnlazada(strings);
        String s1 = "Facil";
        String s2 = "Es";
        String s3 = "Parcial";
        String s4 = "Prog 2";

        listaD.addNodo(s1);
        listaD.addNodo(s2);
        listaD.addNodo(s3);
        listaD.addNodo(s4);


        // PUNTO (e)

        for(Nodo s: listaD){
        	System.out.println(s);
        }
        System.out.println("-----------------------");


        // PUNTO (f)
        System.out.println("-----------F-----------");

        System.out.println(listaD.getPosicion("Parcial"));
        System.out.println("-----------------------");


        // PUNTO (g)
        System.out.println("-----------G-----------");

        System.out.println(listaD.getPosicion("Recuperatorio"));
        System.out.println("-----------------------");


        // PUNTO (h)
        System.out.println("-----------H-----------");

        Comparator<Object> stringsDesc = new OrdenarDescendente(strings);
        listaD.setComparador(stringsDesc);
        for(Nodo s: listaD){
        	System.out.println(s);
        }
        System.out.println("-----------------------");
  

        // PUNTO (i)
        System.out.println("-----------I-----------");

        // Creacion de la primera estructura.
        Grupo unicen = new Grupo();
        Grupo exactas = new Grupo();
        Grupo humanas = new Grupo();
        Grupo historia = new Grupo();
        Alumno a1 = new Alumno("John", "Doe", 1200000);
        a1.agregarintereses("intercambio");
        Alumno a2 = new Alumno("Federico", "Gomez", 35999888);
        a2.agregarintereses("redes");
        a2.agregarintereses("php");
        a2.agregarintereses("java");
        a2.agregarintereses("Python");
        Alumno a3 = new Alumno("Juana", "Garcia", 27123455);
        a3.agregarintereses("programacion");
        a3.agregarintereses("php");
        a3.agregarintereses("java");
        Alumno a4 = new Alumno("Mora", "Diaz", 37124425);
        a4.agregarintereses("psicologia");
        a4.agregarintereses("Freud");
        Alumno a5 = new Alumno("Flora", "Rivas", 34555111);
        a5.agregarintereses("historia");
        a5.agregarintereses("antigua");
        Alumno a6 = new Alumno("Martin", "Gomez", 34111222);
        a6.agregarintereses("romanos");
        a6.agregarintereses("egipcios");
        a6.agregarintereses("griegos");
        Alumno a7 = new Alumno("Roman", "Bazan", 3255111);
        a7.agregarintereses("argentina");
        
        unicen.addEntidad(exactas);
        exactas.addEntidad(a2);
        exactas.addEntidad(a3);
        unicen.addEntidad(humanas);
        humanas.addEntidad(historia);
        historia.addEntidad(a5);
        historia.addEntidad(a6);
        historia.addEntidad(a7);
        humanas.addEntidad(a4);
        unicen.addEntidad(a1);
        
        // Creacion de la segunda estructura.
        Grupo OlimpiadasMatematicas = new Grupo();
        Grupo Matea2 = new Grupo();
        Grupo LosFibo = new Grupo();
        Alumno m1 = new Alumno("Juan", "Juarez", 33222444);
        m1.agregarintereses("sucesiones");
        m1.agregarintereses("algebra");
        Alumno m2 = new Alumno("Julio", "Cesar", 33222111);
        m2.agregarintereses("sucesiones");
        m2.agregarintereses("algebra");
        Alumno m3 = new Alumno("Bernardino", "Rivas", 30987654);
        m3.agregarintereses("matematicas");
        Alumno m4 = new Alumno("Jose", "Paso", 33322112);
        m4.agregarintereses("problemas");
        Alumno m5 = new Alumno("Isaac", "Newton", 12343565);
        m5.agregarintereses("sucesiones");
        
        OlimpiadasMatematicas.addEntidad(Matea2);
        Matea2.addEntidad(m1);
        Matea2.addEntidad(m2);
        OlimpiadasMatematicas.addEntidad(LosFibo);
        LosFibo.addEntidad(m3);
        LosFibo.addEntidad(m4);
        LosFibo.addEntidad(m5);
        
        // Creo la lista.
        Comparator<Object> cantAlumnos = new OrdenarCantAlumnos();
        Comparator<Object> cantAlumnosDesc = new OrdenarDescendente(cantAlumnos);
        ListaEnlazada listaCompuesta = new ListaEnlazada(cantAlumnosDesc);
        listaCompuesta.addNodo(unicen);
        listaCompuesta.addNodo(OlimpiadasMatematicas);
        
        // Obtengo los valores de la lista compuesta.
        for(Nodo s: listaCompuesta)
        System.out.println(s);
        System.out.println("-----------------------");

      }
}
