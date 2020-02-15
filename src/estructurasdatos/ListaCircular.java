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
    
    public int getContador(){
        return num_nodos;
    }
    
    public boolean esVacia(){
        return num_nodos == 0;
    }
    
    public void vaciar(){
        this.num_nodos = 0;
        primero = null;
        ultimo = null;
    }
    
    public void insertarPrincipio(Object dato){
        Nodo nuevo = new Nodo(dato);
        if(this.esVacia()){
            primero = nuevo;
            ultimo = nuevo;
            primero.setSiguiente(ultimo);
            ultimo.setSiguiente(primero);
        }else if(primero == ultimo){
            primero = nuevo;
            primero.setSiguiente(ultimo);
            ultimo.setSiguiente(primero);
        }else{
            nuevo.setSiguiente(primero);
            primero = nuevo;
            ultimo.setSiguiente(primero);
        }
        this.num_nodos++;
    }
    
    public void insertarFinal(Object dato){
        Nodo nuevo = new Nodo(dato);
        if(this.esVacia()){
            primero = nuevo;
            ultimo = nuevo;
            primero.setSiguiente(ultimo);
            ultimo.setSiguiente(primero);
        }else if(primero == ultimo){
            ultimo = nuevo;
            primero.setSiguiente(nuevo);
            ultimo.setSiguiente(primero);
        }else{
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
            ultimo.setSiguiente(primero);
        }
        this.num_nodos++;
    }
    
    public void eliminarPrincipio(){
        if(!this.esVacia()){
            if(primero == ultimo){
                this.vaciar();
            }else{
                primero = primero.getSiguiente();
                ultimo.setSiguiente(primero);
                this.num_nodos--;
            }
        }
    }
    
    public void eliminarFinal(){
        if(!this.esVacia()){
            if(primero == ultimo){
                this.vaciar();
            }else{
                Nodo temporal = primero;
                while(temporal.getSiguiente() != ultimo){
                    temporal = temporal.getSiguiente();
                }
                ultimo = temporal;
                ultimo.setSiguiente(primero);
                this.num_nodos--;
            }
        }
    }
    
    @Override
    public String toString(){
        if(this.esVacia()) return "Lista Vacia";
        String cadena = "";
        
        System.out.println(primero.getDato() + " - " + ultimo.getDato());
        
        Nodo temporal = primero;
        for(int i = 0; i < num_nodos; i++){
            cadena += temporal.toString();
            temporal = temporal.getSiguiente();
        }
        return cadena;
    }
    
}
