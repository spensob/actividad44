/**
 * Este programa almacena en un array la serie 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, etc. Así hasta 10 diez veces
 * 
 * @author Sergio Peña
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        int array[] = new int[55]; // Declaro el array con la longitud
        int contadorPosicion = 0; // Posicion en el que se colocará el valor en el array

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                array[contadorPosicion] = i; // almaceno en el array el valor y en su posicion
                contadorPosicion++; // Aumento en uno la posicion
            }
        }

        for (int i = 0; i < array.length; i++) { // Muestro todos los valores del array
            System.out.println(array[i]);
        }
    }
}
