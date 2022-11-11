package ListaVinculada;

public class Nodo {
    private Object elemento;
    private Nodo siguiente;

    public Nodo(Object elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public void setSiguiente(Nodo n){
        this.siguiente = n;
    }
    public void setElemento(Object e){
        this.elemento = e;
    }

    public Nodo getSiguiente(){
        return this.siguiente;
    }

    public Object getElemento(){
        return this.elemento;
    }
    
}
