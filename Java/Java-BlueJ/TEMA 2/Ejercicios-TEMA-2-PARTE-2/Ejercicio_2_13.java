
import java.util.Scanner;

public class Ejercicio_2_13 {
    public static void main(String[] args) {
        Scanner scTeclado = new Scanner(System.in);

        System.out.println("Introduce la cantidad comprada:");
        double dComidaDiaria = scTeclado.nextDouble();

        System.out.println("Introduce el número de animales:");
        double dNumAnimales = scTeclado.nextDouble();

        System.out.println("Introduce la media de kg de consumo:");
        double dKilosPorAnimal = scTeclado.nextDouble();

        if (dNumAnimales <= 0) {
            System.out.println("El número de animales debe ser mayor que cero.");
        } else {
            double dCantidadTotal = dNumAnimales * dKilosPorAnimal;

            if (dCantidadTotal > dComidaDiaria) {
                System.out.println("No hay suficiente comida para la media introducida.");

                double dNuevaMedia = dComidaDiaria / dNumAnimales;

                System.out.println("La nueva ración para cada animal serían "
                        + dNuevaMedia + " kg.");
            } else {
                System.out.println("Dispones de cantidad suficiente para alcanzar la media.");
            }
        }
    }
}
