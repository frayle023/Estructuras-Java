package estructuras;

import estructurasdatos.ListaEnlazada;

public class Estructuras {

    public static void main(String[] args) {
        ListaEnlazada l = new ListaEnlazada();
        l.insertar(8);
        l.insertar(16);
        l.insertarPrincipio(5);
        l.insertar(14);
        l.insertarPrincipio(22);
        l.insertar(41);
        System.out.println(l.toString());
    }
    
}
