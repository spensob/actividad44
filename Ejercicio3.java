/**
 * Este programa permite introducir varias alturas en un array y luego muestra el promedio de las alturas, la altura máxima, la mínima y dice cuántas personas están por encima de la media
 * y cuantas por debajo de la media
 * 
 * @author Sergio Peña
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        // Pido la longitud del array por teclado
        System.out.println("Introduce cuantas alturas quieres almacenar:");
        String n = System.console().readLine();
        int nInt = Integer.parseInt(n);

        double[] alturas = new double[nInt]; // Introduzco la longitud del array según lo introducido por teclado

        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Introduce la altura nº: " + (i + 1));
            String altura = System.console().readLine();
            double alturaDouble = Double.parseDouble(altura);
            alturas[i] = alturaDouble; // Almaceno la altura en el array
        }

        double sumaAlturas = 0, alturaMaxima = alturas[0], alturaMinima = alturas[0];
        int personasEncimaMedia = 0, personasDebajoMedia = 0;

        for (int i = 0; i < alturas.length; i++) {
            sumaAlturas += alturas[i]; // Almaceno la suma de todas las alturas para luego hacer la media
            if (alturaMaxima < alturas[i]) { // Si la altura maxima es menor que la altura actual del bucle se cambia por la nueva ya que es mas grande
                alturaMaxima = alturas[i];
            }
            if (alturaMinima > alturas[i]) { // Si la altura minima es mas grande que la altura actual del bucle se cambia por la nueva ya que es mas pequeña
                alturaMinima = alturas[i];
            }
        }

        for (int i = 0; i < alturas.length; i++) {
            if(alturas[i] > (sumaAlturas / alturas.length)){ // Si la altura esta por encima de la media, se aumenta el contador
                personasEncimaMedia++;
            }
            if(alturas[i] < (sumaAlturas / alturas.length)){ // Si la altura esta por debajo de la media, se aumenta el contador
                personasDebajoMedia++;
            }
        }

        System.out.println("PROMEDIO: " + sumaAlturas / alturas.length); // Altura media de todas las alturas es igual a la suma de todas las alturas dividido el numero de alturas registradas
        System.out.println("ALTURA MÁXIMA: " + alturaMaxima);
        System.out.println("ALTURA MÍNIMA: " + alturaMinima);
        System.out.println("PERSONAS POR ENCIMA DE MEDIA: " + personasEncimaMedia);
        System.out.println("PERSONAS POR DEBAJO DE MEDIA: " + personasDebajoMedia);
    }
}
