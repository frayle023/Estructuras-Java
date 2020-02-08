package estructuras;

import estructurasdatos.ListaEnlazada;

public class Estructuras {

    public static void main(String[] args) {
        ListaEnlazada l = new ListaEnlazada();
        l.insertar(8);
        l.insertar(16);
        l.insertar(25);
        l.insertar(27);
        l.insertar(9);
        System.out.println(l.getContador());
    }
    
}
