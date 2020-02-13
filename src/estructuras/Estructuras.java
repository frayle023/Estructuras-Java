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
         lista.insertarFinal(100);
         lista.insertarFinal(200);
         lista.insertarFinal(300);
         lista.insertarPrincipio(44);
         lista.insertarPrincipio(1);
         lista.insertarPrincipio(8);
         
         
        
         
        
        lista.reversa();
        System.out.println(lista.toString());
        System.out.println("Hay: " + lista.getContador() + " nodos");
        
    }
    
}
