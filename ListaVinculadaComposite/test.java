package ListaVinculadaComposite;

import java.util.Comparator;

import ListaVinculadaComposite.Comparadores.*;

public class test {
    public static void main(String[] args) {
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
        Comparator<Object> compuesto = new OrdenarCompuesto(nombre,apellido);
        Comparator<Object> compuesto1 = new OrdenarCompuesto(compuesto,dni);

        ListaEnlazada lista = new ListaEnlazada(compuesto1);
   
        lista.addNodo(alumno1);
        lista.addNodo(alumno2);
        lista.addNodo(alumno3);
        lista.addNodo(alumno4);
        lista.addNodo(alumno5);
        lista.addNodo(alumno6);
        lista.addNodo(alumno7);
 
        
        // for(Nodo s: lista)
        // 	System.out.println(s);
                
        
        lista.eliminarOcurrencias(alumno6);
        System.out.println("---------------------");

        // for(Nodo s: lista)
        // 	System.out.println(s);
        
        
        // Creacion de la primera estructura del punto 3)i).
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

        // Creacion de la segunda estructura del punto 3)i).
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

        System.out.println(OlimpiadasMatematicas);
    }
}
