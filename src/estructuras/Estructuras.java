package estructuras;

import estructurasdatos.ListaCircular;


public class Estructuras {

    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        
        lista.insertarFinal(10);
      
        lista.insertarFinal(55); 
        
       System.out.println(lista.toString());
       System.out.println("Hay: " + lista.getContador() + " nodos");
        
    }
    
}
