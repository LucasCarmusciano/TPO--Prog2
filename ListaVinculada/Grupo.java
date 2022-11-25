package ListaVinculada;

import java.util.ArrayList;

public class Grupo extends Entidad{
    private ArrayList<Entidad> entidades;
    public Grupo(String nombre){
        super(nombre);
        this.entidades = new ArrayList<>();
    }

    public void addEntidad (Entidad e){
        this.entidades.add(e);
    }

    public int getCantidadAlumnos(){
        int cant = 0;
        for (int i=0; i<entidades.size(); i++){
            cant += entidades.get(i).getCantidadAlumnos();
        }
        return cant;
    }

    public String toString(){
        // ArrayList<Alumno> list = this.getAlumnos();
        // String string = "";
        // for (int i = 0; i < list.size(); i++) {
        //     string += list.get(i)+"\n";
        // }
        return this.getNombre();
    }
}
