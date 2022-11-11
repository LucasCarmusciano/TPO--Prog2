package ListaVinculada;
import java.util.Comparator;
import java.util.Iterator;


public class ListaEnlazada implements Iterable<Nodo>{

	private Nodo cabeza;
	private Nodo fin;
    	private int size;
    	private Comparator<Object> comparador;

    public ListaEnlazada(Comparator<Object> comparador) {
        this.cabeza = null;
        this.fin=null;
        this.size = 0;
        this.comparador = comparador;
    }

    public Nodo getCabeza() {
        return cabeza;
    }
    
    public void addNodo(Object o){ //para prboar
    	Nodo temp;
		if(estaVacia()) {
			temp = new Nodo(o);
			this.cabeza = temp;
			this.fin = temp;
		}
		else {
			temp = new Nodo(o);
			this.fin.setSiguiente(temp);
			fin = temp;
			this.ordenar();
		}
		this.size++;
    }

	public boolean estaVacia() { 
		if(cabeza==null)
			return true;
		return false;
	}

    // private void ordenar(){
    //     Nodo aux = this.cabeza;
    //     Nodo actual;
    //     Object temp;
    //     while(aux.getSiguiente()!=null){
    //         actual = aux.getSiguiente();
    //         while(actual!=null){
    //             if((aux.getElemento())>(actual.getElemento())){
    //                 temp = aux.getElemento();
    //                 aux.getElemento() = actual.getElemento();
    //                 actual.getElemento() = temp;
    //             }
    //             actual = actual.getSiguiente();
    //         }
    //         aux.getSiguiente();
    //     }
    // }

    
    public int size(){
        return this.size;
    }
    
    public void eliminar(int pos){
        Nodo aux = cabeza;
        if(pos == 0){
            this.cabeza = this.cabeza.getSiguiente();
        }else if(pos == size-1){
            while(aux.getSiguiente().getSiguiente()!=null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(null);
        }else{
            for(int i=0; i<pos-1; i++){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
        this.size--;
    }
    
    public void eliminarOcurrencias(Object obj){
        Nodo aux = cabeza;
        int i = 0;
        while(aux!=null){
            if(aux.getElemento().equals(obj)){
                System.out.println("pos "+i);
                aux = aux.getSiguiente();
                this.eliminar(i);
            }else{
                aux = aux.getSiguiente();
                i++;
            }
        }      
    }
    
    public int getPosicion(Object obj){
        Nodo aux = cabeza;
        int i = 0;
        while (!aux.getElemento().equals(obj)) {
            aux = aux.getSiguiente();
            i++;
        }
        return i;
    }
    
    public void setComparador(Comparator<Object> comparador){
        this.comparador = comparador;
    }
    
    private void ordenar(){
        Nodo aux = this.cabeza;
        Nodo actual;
        Object temp;
        while(aux.getSiguiente()!=null){
            actual = aux.getSiguiente();
            while(actual!=null){


                if((this.comparador.compare(aux.getElemento(), actual.getElemento()))>=0){
                    temp = aux.getElemento();
                    aux.setElemento(actual.getElemento());
                    actual.setElemento(temp);
                }
                actual = actual.getSiguiente();
            }
            aux = aux.getSiguiente();
        }
    }
    
    public void imprimir(){
        Nodo aux = this.cabeza;
        System.out.println(aux.getElemento());
        while (aux.getSiguiente()!=null){
            aux = aux.getSiguiente();
            System.out.println(aux.getElemento());
        }
    }

    
    @Override
    public Iterator<Nodo> iterator() {
        return new Iterador();
    }

    private class Iterador implements Iterator<Nodo>{
        private Nodo pos;
        
        public Iterador(){
            this.pos = new Nodo(null);
            this.pos.setSiguiente(cabeza);
        }

        @Override
        public boolean hasNext() {
            return (pos.getSiguiente()!=null);
        }

        @Override
        public Nodo next() {
            pos = pos.getSiguiente();
            return pos;
        }
}
}