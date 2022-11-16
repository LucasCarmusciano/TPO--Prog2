package ListaVinculadaComposite;

import java.util.ArrayList;

public abstract class Entidad {
    public abstract ArrayList<Alumno> getAlumnos();
    public int getCantidadAlumnos(){
        return this.getAlumnos().size();
    }
}
