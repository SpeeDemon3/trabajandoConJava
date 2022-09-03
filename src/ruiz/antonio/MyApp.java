package ruiz.antonio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) throws IOException {

        Scanner my = new Scanner(System.in);
        System.out.println("Que lenguaje te gustaria aprender : Python, JavaScript, C#, Java, C: ");
        String respuesta = my.next();


        ArrayList<String> lenguajesProgramacion = new ArrayList<String>();
        lenguajesProgramacion.add("java");
        lenguajesProgramacion.add("python");
        lenguajesProgramacion.add("c");
        lenguajesProgramacion.add("c#");
        lenguajesProgramacion.add("javascript");

        if (respuesta.equals(lenguajesProgramacion.get(0))) {
            System.out.println("Hay muchas aplicaciones y sitios web que no funcionarán, probablemente, a menos que tengan Java instalado, y cada día se crean más.");
        } else if (respuesta.equals(lenguajesProgramacion.get(1))) {
            System.out.println("Es un lenguaje de alto nivel de programación interpretado cuya filosofía hace hincapié en la legibilidad de su código.");
        } else if (respuesta.equals(lenguajesProgramacion.get(2))){
            System.out.println("Es un lenguaje orientado a la implementación de sistemas operativos, concretamente Unix.!!!");
        } else if (respuesta.equals(lenguajesProgramacion.get(3))) {
            System.out.println("Es un lenguaje de programación multiparadigma desarrollado y estandarizado por la empresa Microsoft.");
        } else if (respuesta.equals(lenguajesProgramacion.get(4))) {
            System.out.println("Es un lenguaje de programación interpretado, dialecto del estándar ECMAScript.");
        } else {
            System.out.println("Elige un lenguaje de los que te propongo.");
        }

        try {
            File file = new File("test.txt");
            if (file.createNewFile()) {
                System.out.println("Archivo creado: " + file.getName());
            } else {
                System.out.println("El archivo creado ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error." + e.getMessage());
        }

        try {
            FileWriter writer = new FileWriter("test.txt");
            writer.write(respuesta);
            writer.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error." + e.getMessage());
        }


    }



}
