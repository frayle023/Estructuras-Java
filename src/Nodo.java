/**
 *
 * @author charli
 */
public class Nodo {
    Object dato;
    Nodo siguiente;
    
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
    
    @Override
    public String toString(){
        return dato + " -> ";
    }
    
}
