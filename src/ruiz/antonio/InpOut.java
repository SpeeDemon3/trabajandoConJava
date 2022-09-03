package ruiz.antonio;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class InpOut {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un fichero de origen: ");
        String fileIn = scanner.nextLine();
        System.out.println("Introduce el fichero de destino: ");
        String fileOut = scanner.nextLine();
        copy(fileIn, fileOut);
    }

    private static void copy(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();

        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }


}



