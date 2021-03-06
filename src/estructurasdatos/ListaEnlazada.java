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
    
    public void insertarFinal(Object dato){
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
    
    public void insertarPrincipio(Object dato){
        Nodo nuevo = new Nodo(dato);
        if(this.esVacia()){
            this.primero = nuevo;
        }else{
            Nodo temporal = primero;
            nuevo.setSiguiente(temporal);
            primero = nuevo;
        }
        this.num_nodos++;
    }
    
    public void eliminarFinal(){
        if(!this.esVacia()){
            if(primero.getSiguiente() == null){
                this.primero = null;
            }else{
                Nodo temporal = primero;
                Nodo previo = null;
                while(temporal.getSiguiente() != null){
                    previo = temporal;
                    temporal = temporal.getSiguiente();
                }
                if(previo != null) previo.setSiguiente(null);
            }
            this.num_nodos--;
        }
    }
    
    public void eliminarPrincipio(){
        if(!this.esVacia()){
            Nodo temporal = primero.getSiguiente();
            primero = temporal;
            this.num_nodos--;
        }
    }
    
    public void eliminarPorDato(Object dato){
        if(!this.esVacia()){
            if(primero.getDato() == dato){
                primero = primero.getSiguiente();
                this.num_nodos--;
            }else{
                Nodo temporal = primero.getSiguiente();
                Nodo previo = primero;
                boolean encontrado = false;
                while(temporal != null && !encontrado){
                    if(temporal.getDato() == dato){
                        previo.setSiguiente(temporal.getSiguiente());
                        this.num_nodos--;
                        encontrado = true;
                    }
                    previo = temporal;
                    temporal = temporal.getSiguiente();
                }
            }
        }
    }
    
    public void eliminarPorIndice(int indice){
        if(indice <= num_nodos && indice > 0){
            if(indice == 1){
                primero = primero.getSiguiente();
            }else{
                Nodo temporal = primero.getSiguiente();
                Nodo previo = primero;
                for(int i = 2; i < indice; i++){
                    previo = temporal;
                    temporal = temporal.getSiguiente();
                }
                previo.setSiguiente(temporal.getSiguiente());
            }
            this.num_nodos--;
        }
    }
    
    public void insertarPorIndice(Object dato, int indice){
        Nodo nuevo = new Nodo(dato);
        if(this.esVacia() || indice == 1){
            nuevo.setSiguiente(primero);
            primero = nuevo;
        }else if(indice > num_nodos || indice <= 0){
            Nodo temporal = primero;
            while(temporal.getSiguiente() != null){
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(nuevo);
        }else{
            Nodo temporal = primero;
            Nodo previo = null;
            for(int i = 1; i < indice; i ++){
                previo = temporal;
                temporal = temporal.getSiguiente();
            }
            nuevo.setSiguiente(temporal);
            if(previo != null) previo.setSiguiente(nuevo);
        }
        this.num_nodos++;
    }
    
    public Nodo getNodoPorIndice(int indice){
        Nodo nodo = new Nodo();
        if(indice <= num_nodos && indice > 0){
            if(indice == 1){
                nodo = primero;
            }else{
                Nodo temporal = primero.getSiguiente();
                for(int i = 2; i < indice; i++){
                    temporal = temporal.getSiguiente();
                }
                nodo = temporal;
            }
        }
        return nodo;
    }
    
    public void ordenamientoBurbuja(){
        if(!this.esVacia()){
            Nodo temporal = primero;
            while(temporal.getSiguiente() != null){
                Nodo siguiente = temporal.getSiguiente();
                while(siguiente != null){
                    if(temporal.compareTo(siguiente)){
                        Object dato = temporal.getDato();
                        temporal.setDato(siguiente.getDato());
                        siguiente.setDato(dato);
                    }
                    siguiente = siguiente.getSiguiente();
                }
                temporal = temporal.getSiguiente();
            }
        }
    }
    
    public void reversa(){
        if(num_nodos > 1){
            Nodo auxiliar = primero;
            Nodo temporal = null;
            while(auxiliar.getSiguiente() != null){
                temporal = auxiliar.getSiguiente();
                auxiliar.setSiguiente(temporal.getSiguiente());
                temporal.setSiguiente(primero);
                primero = temporal;
            }        
        }
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
