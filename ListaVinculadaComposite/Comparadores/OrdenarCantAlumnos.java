package ListaVinculadaComposite.Comparadores;

import java.util.Comparator;

import ListaVinculadaComposite.Entidad;

public class OrdenarCantAlumnos implements Comparator<Object>{
 
    private Entidad grupo1,grupo2;
	@Override
	public int compare(Object o1, Object o2) {
	   	this.grupo1 = (Entidad) o1;
    	this.grupo2 = (Entidad) o2;
		return (grupo1.getCantidadAlumnos()-grupo2.getCantidadAlumnos());
	}
}