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
public class ListaCircular {
    private Nodo primero;
    private Nodo ultimo;
    private int num_nodos;
    
    public ListaCircular(){}
    
    public int getContador(){
        return this.num_nodos;
    }
    
    public void vaciar(){
        primero = null;
        ultimo = null;
        num_nodos = 0;
    }
    
    public boolean esVacia(){
        return this.primero == null && this.ultimo == null && this.num_nodos == 0;
    }
    
    public void insertarFinal(Object dato){
        Nodo nuevo = new Nodo(dato);
        if(this.esVacia()){
            nuevo.setSiguiente(nuevo);
            primero = ultimo = nuevo;
        }else{
            Nodo temporal = ultimo;
            temporal.setSiguiente(nuevo);
            nuevo.setSiguiente(primero);
            ultimo = nuevo;
        }
        this.num_nodos++;
    }
    
    public void insertarPrincipio(Object dato){
        Nodo nuevo = new Nodo(dato);
        if(this.esVacia()){
            nuevo.setSiguiente(nuevo);
            primero = ultimo = nuevo;
        }else{
            nuevo.setSiguiente(primero);
            primero = nuevo;
            ultimo.setSiguiente(primero);
        }
        this.num_nodos++;
    }
    
    
    
    
    @Override
    public String toString(){
        if(this.esVacia()) return "Lista Vacia";
        String cadena = "";
        Nodo temporal = primero;
        while(temporal != ultimo){
            cadena += temporal.toString();
            temporal = temporal.getSiguiente();
        }
        return cadena + temporal.toString();
    }
    
    
}
