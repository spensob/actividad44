/**
 * Este programa hace una serie de números con una longitud, valor inicial e incremento según lo que haya introducido el usuario por teclado
 * 
 * @author Sergio Peña
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        // Pido los valores por teclado
        System.out.println("Introduce la cantidad de valores a crear:");
        String valores = System.console().readLine();
        int valoresInt = Integer.parseInt(valores);
        int[] array = new int[valoresInt]; // El array tendrá la longitud que el usuario introduzca

        System.out.println("Escribe el valor inicial de la secuencia:");
        String valorInicial = System.console().readLine();
        int valorInicialInt = Integer.parseInt(valorInicial);

        System.out.println("Introduce el incremento de cada secuencia:");
        String incremento = System.console().readLine();
        int incrementoInt = Integer.parseInt(incremento);

        for (int i = 0; i < array.length; i++) { // Introduzco los valores en el array
            array[i] = valorInicialInt;
            valorInicialInt += incrementoInt; // Cada vez que se itera el bucle le suma el incremento al valor inicial
        }

        for (int i = 0; i < array.length; i++) { // Muestro todos los valores del array
            System.out.println(array[i]);
        }
    }
}
