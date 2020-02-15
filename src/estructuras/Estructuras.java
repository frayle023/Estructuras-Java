package estructuras;

import estructurasdatos.ListaCircular;


public class Estructuras {

    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        
        lista.insertarFinal(11);
        lista.insertarPrincipio(55);
        lista.insertarFinal(44);
        lista.insertarPrincipio(66);
        
      
         
        System.out.println(lista.toString());
        System.out.println("Hay: " + lista.getContador() + " nodos");
        
    }
    
}
