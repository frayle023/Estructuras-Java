package estructuras;

import estructurasdatos.ListaEnlazada;

public class Estructuras {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
     
        lista.insertarFinal("Pedro");
        lista.insertarFinal("Erika");
        lista.insertarFinal(4);
        lista.insertarFinal(6);
        lista.insertarFinal("GT");
        lista.insertarPrincipio("Zolia");
        lista.insertarPrincipio(11);
        lista.insertarPrincipio(22);
        lista.insertarPrincipio("A");
        lista.insertarPrincipio(333);
        lista.insertarPrincipio(0.5);
        lista.insertarPrincipio(3.5);
        lista.insertarFinal(5510);
        lista.insertarFinal("ped");
        lista.insertarPrincipio("a");
        
        lista.ordenamientoBurbuja();
        
        System.out.println(lista.toString());
        System.out.println("Hay: " + lista.getContador() + " nodos");
        
    }
    
}
