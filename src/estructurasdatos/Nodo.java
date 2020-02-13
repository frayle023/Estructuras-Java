package estructurasdatos;

/**
 *
 * @author charli
 */
public class Nodo {
    private Object dato;
    private Nodo siguiente;
    
    public Nodo(){}
    
    public Nodo(Object dato){
        this.dato = dato;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    public boolean compareTo(Nodo nodo){
        return this.dato.toString().compareTo(nodo.getDato().toString()) > 0;
    }
    
    @Override
    public String toString(){
        return dato + " -> ";
    }
    
}
