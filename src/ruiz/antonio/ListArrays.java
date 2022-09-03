package ruiz.antonio;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListArrays {

    public static void main(String[] args) {

        // ArrayList String
        ArrayList<String> list = new ArrayList();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");

        // Recorriendo el ArrayList String
        for (String i : list) {
            System.out.println("ArrayList: " + i);
        }


        // LinkedList
        LinkedList<String> listE = new LinkedList<>(list);

        // Recorriendo el LinkedList

        for (String x : listE) {
            System.out.println("LinkedList: " + x);
        }


        // ArrayList Int
        ArrayList<Integer> listI = new ArrayList<>();

        // Rellenado ArrayList Int

        for(int a = 0; a < 10; a++){
            if (a < 10) {
                listI.add(a);
            }
            System.out.println(listI.size());
        }

        System.out.println(listI);

        // Eliminando numeros pares de listI

        listI.removeIf(num -> num%2==0);
        System.out.println(listI);

        // Volvemos a recorrer listI

        for (int i = 0; i < listI.size() ; i++) {
            System.out.println(listI.get(i));
        }



    }



}
