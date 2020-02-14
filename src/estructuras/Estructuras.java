package estructuras;

import estructurasdatos.ListaDoble;
import estructurasdatos.ListaEnlazada;

public class Estructuras {

    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
         lista.insertarPrincipio("k");
         lista.insertarPrincipio("j");
         lista.insertarPrincipio("a");
         lista.insertarPrincipio("d");
         lista.insertarPrincipio("z");
         lista.insertarPrincipio("b");
         lista.insertarFinal("i");
      
         lista.ordenamientoBurbuja();
       
        
         
        System.out.println(lista.toString());
        System.out.println("Hay: " + lista.getContador() + " nodos");
        
    }
    
}
