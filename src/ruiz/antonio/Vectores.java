package ruiz.antonio;

import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        System.out.println("Antes: " + v);

        v.remove(1);
        v.remove(1);

        System.out.println("Despues: " + v);
    }


}

/**
 * El problema de utilizar un Vector de capacidad por defecto (10) al que se le añaden
 * 1000 elementos, es una operacion muy costosa, en el proceso se duplica en memoria el consumo,
 * se duplica la capacidad del vector * 2
 */
