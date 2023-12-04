/**
 * Este programa muestra un menú con 3 opciones, la primera opcion muestra los valores de un array de longitud "10",
 * la segunda opción pide un valor y una posición para agregar un nuevo valor al array y la tercera opción es para cerrar el programa.
 * 
 * @author Sergio Peña
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        boolean funciona = true; // Variable para controlar la duración del programa

        while(funciona){
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir.");

            String opcion = System.console().readLine();

            if(opcion.equalsIgnoreCase("a")){
                for(int i = 0; i < numeros.length; i++){ // Muestro todos los valores del array seguido del índice en el que se encuentran
                    System.out.println(i + ". " + numeros[i]);
                }
            }
            else if(opcion.equalsIgnoreCase("b")){
                System.out.println("Introduce el valor que quieres agregar al array");
                String valor = System.console().readLine();
                int valorInt = Integer.parseInt(valor);
                System.out.println("Introduce la posición del array en la que quieres guardar el valor");
                String posicion = System.console().readLine();
                int posicionInt = Integer.parseInt(posicion);

                numeros[posicionInt] = valorInt; // Introduzco el valor en la posición indicada por el usuario
                System.out.println("Valor: " + valorInt + " agregado en la posición: " + valorInt);
            }
            else if(opcion.equalsIgnoreCase("c")){
                System.out.println("Cerrando programa...");
                funciona = false; // Me salgo del bucle y cierro el programa
            }
            else{
                System.out.println("No has introducido una opción válida");
            }
        }
    }
}
