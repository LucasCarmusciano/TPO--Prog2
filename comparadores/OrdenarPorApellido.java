package comparadores;

import java.util.Comparator;

import principal.Alumno;

public class OrdenarPorApellido implements Comparator<Object> {

	private Alumno alumno1,alumno2;
	@Override
	public int compare(Object o1, Object o2) {
	   	this.alumno1 = (Alumno) o1;
    	this.alumno2 = (Alumno) o2;
		return alumno1.getApellido().compareToIgnoreCase(alumno2.getApellido());
	}
	
	
}
