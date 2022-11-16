package ListaVinculadaComposite;

import java.util.ArrayList;

public class Grupo extends Entidad{
    private ArrayList<Entidad> entidades;
    public Grupo(){
        this.entidades = new ArrayList<>();
    }

    public void addEntidad (Entidad e){
        this.entidades.add(e);
    }

    public ArrayList<Alumno> getAlumnos(){
        ArrayList<Alumno> list = new ArrayList<>();
        ArrayList<Alumno> auxList = new ArrayList<>();
        for (int i = 0; i < entidades.size(); i++) {
            auxList.addAll(entidades.get(i).getAlumnos());
        }
        for (int j = 0; j < auxList.size(); j++) {
            if(!list.contains(auxList.get(j))){
                list.add(auxList.get(j));
            }
        }
        return auxList;
    }

    public String toString(){
        ArrayList<Alumno> list = this.getAlumnos();
        String string = "";
        for (int i = 0; i < list.size(); i++) {
            string += list.get(i)+"\n";
        }
        return string;
    }
}
