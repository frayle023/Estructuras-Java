package estructuras;

import estructurasdatos.ListaDoble;

public class Estructuras {

    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
         lista.insertarPrincipio(12);
         lista.insertarPrincipio(16);
         lista.insertarPrincipio(18);
         lista.insertarFinal(14);
         lista.insertarFinal(22);
         lista.insertarPrincipio(5);
         
         lista.eliminarFinal();
         lista.eliminarFinal();
         lista.eliminarFinal();
         
        
        
        System.out.println(lista.toString());
        System.out.println("Hay: " + lista.getContador() + " nodos");
        
    }
    
}
