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
}
