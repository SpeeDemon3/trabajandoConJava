package ruiz.antonio;

public class Excepcion {

    public static void main(String[] args) {

        dividePorCero(3, 0);

    }

    private static int dividePorCero(int a, int b) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
            throw new ArithmeticException();
        } finally {
            System.out.println("Demo de codigo");
        }
        return resultado;

    }

}
