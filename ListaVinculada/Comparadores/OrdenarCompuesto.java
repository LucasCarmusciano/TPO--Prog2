package Comparadores;

import java.util.Comparator;

import ListaVinculada.Alumno;

public class OrdenarCompuesto implements Comparator<Object>{

	private Comparator<Object> c1,c2;
	private Alumno a1,a2;
	
		
	public OrdenarCompuesto(Comparator<Object> c1, Comparator<Object> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(Object o1, Object o2) {
		this.a1=(Alumno) o1;
		this.a2=(Alumno) o2;
		int resultado = c1.compare(a1, a2);
		if(resultado == 0 && c2 !=null)
			 return c2.compare(a1, a2);
		return resultado;
	}

}
