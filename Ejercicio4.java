/**
 * Este programa imprime los 100 primeros números del 1 al 100 y del 100 al 1 en dos arrays diferentes
 * 
 * @author Sergio Peña
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] arr1 = new int[100];
        int[] arr2 = new int[100];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }

        int indice = arr1.length - 1;

        while (indice >= 0) {
            arr2[arr1.length - indice - 1] = arr1[indice];
            indice--;
        }

        System.out.println("------- ARRAY 1: -------");
        for (int i = 0; i < arr1.length; i++) { // Imprimo el primer array
            System.out.println(arr1[i]);
        }

        System.out.println("------- ARRAY 2 (INVERTIDO): -------");
        for (int i = 0; i < arr2.length; i++) { // Imprimo el segundo array
            System.out.println(arr2[i]);
        }
    }
}
