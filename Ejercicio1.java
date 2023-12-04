/**
 * Este programa genera 100 numeros aleatorios entre 0.0 y 1.0 y luego pide por teclado un valor R y muestra todos los valores que sean igual ó mayores a "R"
 * 
 * @author Sergio Peña
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Introduce el valor R para ver cuantos números en el array son iguales o superiores a este valor:");
        String R = System.console().readLine();
        double RInt = Double.parseDouble(R);

        double numeros[] = new double[100]; // Creo un array con longitud 100

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random(); // Genero 100 numeros aleatorios entre 0.0 y 1.0
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= RInt) { // Compruebo si el número es mayor o igual al valor R
                System.out.println(numeros[i]);
            }
        }
    }
}
