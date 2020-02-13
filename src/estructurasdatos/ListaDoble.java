/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
