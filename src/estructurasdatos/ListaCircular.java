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
    
    @Override
    public String toString(){
        if(this.esVacia()) return "Lista Vacia";
        String cadena = "";
        Nodo temporal = primero;
        for(int i = 0; i < num_nodos; i++){
            cadena += temporal.toString();
            temporal = temporal.getSiguiente();
        }
        return cadena;
    }
    
}
