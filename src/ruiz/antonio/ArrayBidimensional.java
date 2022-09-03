package ruiz.antonio;

public class ArrayBidimensional {

    public static void main(String[] args) {

        // Iterando array bidimensional

        int[][] enteros = {{1, 2, 3}, {4, 5, 6}};

        for (int w = 0; w < enteros.length; w++) {
            for (int x = 0; x < enteros[w].length; x++) {
                System.out.println("Posicion: " + w + ", valor: " + x);
            }
        }

    }
}
