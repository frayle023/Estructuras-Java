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
    
}
