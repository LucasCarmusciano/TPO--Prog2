package principal;
import java.util.ArrayList;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private int dni;
	private ArrayList<String> intereses;
	
	
	public Alumno(String nombre, String apellido, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.intereses = new ArrayList<>();
	}


	public void agregarintereses(String inter) {
		if(!intereses.contains(inter))
			intereses.add(inter);
	}


	public String getApellido() {
		return apellido;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	@Override
	public String toString() {
		return nombre +" "+ apellido+"    DNI: "+dni;
	}


	public int getDni() {
		// TODO Auto-generated method stub
		return dni;
	}


	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	
	public boolean equals(Object obj) {
		Alumno alumno = (Alumno) obj;
		try {
		return this.getNombre().equals(alumno.getNombre())&&
				this.getApellido().equals(alumno.getApellido())&&
				this.getDni() == alumno.getDni();
		}
		catch(Exception e){
			return false;
		}
	}


}
