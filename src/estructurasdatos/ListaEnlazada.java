package estructurasdatos;

/**
 *
 * @author charli
 */
public class ListaEnlazada {
    private Nodo primero;
    private int num_nodos;
    
    public ListaEnlazada(){}
    
    public boolean esVacia(){
        return num_nodos == 0;
    }
    
    public void vaciar(){
        primero = null;
        num_nodos = 0;
    }
    
    public int getContador(){
        return num_nodos;
    }
    
    public void insertar(Object dato){
        Nodo nuevo = new Nodo(dato);
        if(this.esVacia()){
            this.primero = nuevo;
        } else{
            Nodo temporal = primero;
            while(temporal.getSiguiente() != null){
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(nuevo);
        }
        this.num_nodos++;
    }
    
    @Override
    public String toString(){
        if(this.esVacia()) return "Lista Vacia";
        Nodo temporal = primero;
        String resultado = "";
        while(temporal != null){
            resultado += temporal.toString();
            temporal = temporal.getSiguiente();
        }
        return resultado;
    }
}
