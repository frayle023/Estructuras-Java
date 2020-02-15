package estructurasdatos;

/**
 *
 * @author charli
 */
public class ListaDoble {
    private NodoDoble primero;
    private int num_nodos;
    
    public ListaDoble(){}
    
    public boolean esVacia(){
        return num_nodos == 0;
    }
    
    public int getContador(){
        return num_nodos;
    }
    
    public void vaciar(){
        primero = null;
        num_nodos = 0;
    }
    
    public void insertarPrincipio(Object dato){
        NodoDoble nuevo = new NodoDoble(dato);
        if(this.esVacia()){
            this.primero = nuevo;
        }else{
            NodoDoble temporal = primero;
            nuevo.setDer(temporal);
            temporal.setIzq(nuevo);
            primero = nuevo;            
        }
        this.num_nodos++;
    }
    
    public void insertarFinal(Object dato){
        NodoDoble nuevo = new NodoDoble(dato);
        if(this.esVacia()){
            this.primero = nuevo;
        }else{
            NodoDoble temporal = primero;
            while(temporal.getDer() != null){
                temporal = temporal.getDer();
            }
            nuevo.setIzq(temporal);
            temporal.setDer(nuevo);
        }
        this.num_nodos++;
    }
    
    public void insertarPorIndice(Object dato, int indice){
        NodoDoble nuevo = new NodoDoble(dato);
        if(this.esVacia() || indice == 1){
            nuevo.setDer(primero);
            if(primero != null) primero.setIzq(nuevo);
            primero = nuevo;
        }else if(num_nodos < indice || indice <= 0){
            NodoDoble temporal = primero;
            while(temporal.getDer() != null){
                temporal = temporal.getDer();
            }
            nuevo.setIzq(temporal);
            temporal.setDer(nuevo);
        }else{
            NodoDoble temporal = primero;
            for(int i = 1; i < indice; i++){
                temporal = temporal.getDer();
            }
            nuevo.setDer(temporal);
            nuevo.setIzq(temporal.getIzq());
            temporal.getIzq().setDer(nuevo);
            temporal.setIzq(nuevo);
        }
        this.num_nodos++;
    }
    
    public void eliminarPrincipio(){
        if(!this.esVacia()){
            NodoDoble temporal = primero.getDer();
            if(temporal != null) temporal.setIzq(null);
            primero = temporal;
            this.num_nodos--;
        }
    }
    
    public void reversa(){
        if(num_nodos > 1){
           NodoDoble auxiliar = primero;
           NodoDoble temporal = null;
           while(auxiliar.getDer() != null){
               temporal = auxiliar.getDer();
               auxiliar.setDer(temporal.getDer());
               if(temporal.getDer() != null) temporal.getDer().setIzq(auxiliar);
               temporal.setDer(primero);
               temporal.setIzq(null);
               primero.setIzq(temporal);
               primero = temporal;
           }
        }
    }
    
    public void eliminarFinal(){
        if(!this.esVacia()){
            if(primero.getDer() == null){
                primero = null;
            }else{
                NodoDoble temporal = primero;
                while(temporal.getDer() != null){
                    temporal = temporal.getDer();
                }
                temporal.getIzq().setDer(null);
                temporal.setIzq(null);
            }
            this.num_nodos--;
        }
    }
    
    public void ordenamientoBurbuja(){
        if(!this.esVacia()){
            NodoDoble temporal = primero;
            while(temporal.getDer() != null){
                NodoDoble derecho = temporal.getDer();
                while(derecho != null){
                    if(temporal.compareTo(derecho)){
                        Object dato = temporal.getDato();
                        temporal.setDato(derecho.getDato());
                        derecho.setDato(dato);
                    }
                    derecho = derecho.getDer();
                }
                temporal = temporal.getDer();
            }
        }
    }
    
    @Override
    public String toString(){
        if(this.esVacia()) return "Lista Vacia";
        String texto = "";
        NodoDoble temporal = primero;
        while(temporal != null){
            texto += temporal.toString();
            temporal = temporal.getDer();
        }
        return texto;
    }
    
    
}
