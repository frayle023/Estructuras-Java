package estructuras;

import estructurasdatos.ListaDoble;
import estructurasdatos.ListaEnlazada;

public class Estructuras {

    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
         lista.insertarPrincipio(60);
         lista.insertarPrincipio(50);
         lista.insertarPrincipio(40);
         lista.insertarPrincipio(30);
         lista.insertarPrincipio(20);
         lista.insertarPrincipio(10);
         lista.insertarFinal(70);
      
       
        
         
        
        lista.reversa();
        System.out.println(lista.toString());
        System.out.println("Hay: " + lista.getContador() + " nodos");
        
    }
    
}
