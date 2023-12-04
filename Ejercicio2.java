/**
 * Este programa crea 100 numeros entre 1 y 10, luego pide al usuario por teclado un valor N y mostrar en que posiciones del array aparece N
 * 
 * @author Sergio Peña
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        int numeros[] = new int[100]; // Creo un array con longitud 100

        for(int i = 0; i < numeros.length; i++){ 
            numeros[i] = (int)(1 + Math.random() * 10); // Relleno cada posicion del array con numeros aleatorios entre 1 y 10
        }

        System.out.println("Escribe el valor que quieres buscar del array:");
        String n = System.console().readLine();
        int nInt = Integer.parseInt(n);

        System.out.println("------- POSICIONES DEL ARRAY QUE CONTIENEN UN: " + nInt + " -------");
        for(int i = 0; i < numeros.length; i++){
            if(nInt == numeros[i]) System.out.println("POSICION: " + i); // Compruebo si el número introducido es igual al almacenado en la posicion del array
        }
    }
}
