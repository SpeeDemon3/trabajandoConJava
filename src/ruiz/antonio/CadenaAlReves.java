package ruiz.antonio;

public class CadenaAlReves {


    public static void main(String[] args) {

        String texto = "Recorriendo una cadena";

        String vuelve = reverse(texto);

        System.out.println(vuelve);
    }


    // Metodo para devolver una cadena invertida
    public static String reverse(String texto) {
        String invertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }

        return invertida;
    }
}
