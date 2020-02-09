package estructuras;

import estructurasdatos.ListaEnlazada;

public class Estructuras {

    public static void main(String[] args) {
        ListaEnlazada l = new ListaEnlazada();
        l.insertar(8);
        l.insertar(16);
        l.insertarPrincipio(44);

        l.insertarPrincipio(13);
        l.insertar(41);

        l.insertarPrincipio(15);
        l.insertar(56);
        l.insertar(48);

        l.insertar(16);
        l.insertarPrincipio(16);
        l.insertar(16);
        l.insertar(41);
        
       
        l.eliminarPorDato(48);
        l.eliminarPorDato(8);
        l.eliminarPorDato(41);
        l.eliminarPorDato(13);
   
        System.out.println(l.toString());
        System.out.println("Hay: " + l.getContador() + " nodos");
    }
    
}
