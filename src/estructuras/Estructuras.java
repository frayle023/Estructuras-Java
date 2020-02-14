package estructuras;

import estructurasdatos.ListaDoble;
import estructurasdatos.ListaEnlazada;

public class Estructuras {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
         lista.insertarPrincipio(60);
         lista.insertarPrincipio(50);
         lista.insertarPrincipio(40);
         lista.insertarPrincipio(30);
         lista.insertarPrincipio(20);
         lista.insertarPrincipio(10);
         lista.insertarFinal(70);
      
         lista.insertarPorIndice(80, 1000);
         lista.insertarPorIndice(90, -1);
         lista.insertarPorIndice(5, 10);
        
         
        
        //lista.reversa();
        System.out.println(lista.toString());
        System.out.println("Hay: " + lista.getContador() + " nodos");
        
    }
    
}
