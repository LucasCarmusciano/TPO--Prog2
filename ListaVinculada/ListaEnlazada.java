package ListaVinculada;
import java.util.Comparator;
import java.util.Iterator;


public class ListaEnlazada implements Iterable<Object>{

	private Nodo cabeza;
    private int size;
    private Comparator<Object> comparador;

    public ListaEnlazada(Comparator<Object> comparador) {
        this.cabeza = null;
        this.size = 0;
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

    public void addNodo(Object o){
    	Nodo nodo = new Nodo(o);
        Nodo aux;
        Nodo siguiente;

		if(estaVacia()) {
			this.cabeza = nodo;
		} else {
            aux = this.cabeza;
            while(aux != null){
                siguiente = aux.getSiguiente();
                if((this.comparador.compare(aux.getElemento(), nodo.getElemento()))>=0){
                    nodo.setSiguiente(aux);
                    this.cabeza = nodo;
                    break;
                }else if ((this.comparador.compare(aux.getElemento(), nodo.getElemento()))<=0 && siguiente == null) {
                    aux.setSiguiente(nodo);
                    break;
                }else if ((this.comparador.compare(aux.getElemento(), nodo.getElemento()))<0 && 
                        (this.comparador.compare(siguiente.getElemento(), nodo.getElemento()))>=0) {
                    aux.setSiguiente(nodo);
                    nodo.setSiguiente(siguiente);
                    break;
                }else {
                    aux = aux.getSiguiente();
                }
            }
        }
        this.size++;
    }

	public boolean estaVacia() { 
		if(this.cabeza==null){
			return true;
        }
		return false;
	}
    
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
        Nodo siguiente;
        while(aux!=null){
            siguiente = aux.getSiguiente();
            if(aux.getElemento().equals(obj) && aux == this.cabeza){
                this.cabeza = this.cabeza.getSiguiente();
            }else if (siguiente!=null && siguiente.getElemento().equals(obj)) {
                aux.setSiguiente(siguiente.getSiguiente());
            }
            aux = aux.getSiguiente();
        }
    }      
    
    public int getPosicion(Object obj){
        Nodo aux = cabeza;
        for (int i = 0; i < this.size; i++) {
            if(aux.getElemento().equals(obj)){
                return i;
            }else{
                aux = aux.getSiguiente();
            }
        } 
        return -1;
    }
    
    public void setComparador(Comparator<Object> comparador){
        this.comparador = comparador;
        this.ordenar();
    }
    
    @Override
    public Iterator<Object> iterator() {
        return new Iterador(this.cabeza);
    }

    private class Iterador implements Iterator<Object>{
        private Nodo pos;
        
        public Iterador(Nodo first){
            this.pos = first;
        }

        @Override
        public boolean hasNext() {
            return (pos!=null);
        }

        @Override
        public Object next() {
            Object obj = pos.getElemento();
            pos = pos.getSiguiente();
            return obj;
        }
}
}