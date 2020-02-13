package estructurasdatos;

/**
 *
 * @author charli
 */
public class NodoDoble {
    private Object dato;
    private NodoDoble izq;
    private NodoDoble der;
    
    public NodoDoble(){}
    
    public NodoDoble(Object dato){
        this.dato = dato;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoDoble getIzq() {
        return izq;
    }

    public void setIzq(NodoDoble izq) {
        this.izq = izq;
    }

    public NodoDoble getDer() {
        return der;
    }

    public void setDer(NodoDoble der) {
        this.der = der;
    }
    
    @Override
    public String toString(){
        String datoIzq = this.getIzq() == null ? "null" : this.getIzq().getDato().toString();
        String datoDer = this.getDer() == null ? "null" : this.getDer().getDato().toString();
        return datoIzq + " <=[" + this.dato + "]=> " + datoDer + "\n";
    }
    
    public String StringLineal(){
        return this.dato + " - ";
    }
}
