package estructuras;

import estructurasdatos.ListaEnlazada;

public class Estructuras {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
     
        lista.insertarFinal(8);
        lista.insertarFinal(16);
        lista.insertarFinal(4);
        lista.insertarFinal(44);
        lista.insertarPrincipio(21);
        lista.insertarPrincipio(22);
        lista.eliminarPorIndice(6);
        
        System.out.println(lista.toString());
        System.out.println("Hay: " + lista.getContador() + " nodos");
        
    }
    
}
