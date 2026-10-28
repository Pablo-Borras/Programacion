
import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_2_13 {
    public static void main(String[] args) {

        Scanner scTeclado = new Scanner(System.in);

        System.out.println("Introduce la hora actual:");
        int intHora = scTeclado.nextInt();

        while (intHora < 0 || intHora >= 24) {
            System.out.println("ERROR: hora no válida.");
            System.out.println("Introduce la hora actual:");
            intHora = scTeclado.nextInt();
        }

        System.out.println("Introduce el minuto actual:");
        int intMinuto = scTeclado.nextInt();

        while (intMinuto < 0 || intMinuto >= 60) {
            System.out.println("ERROR: minuto no válido.");
            System.out.println("Introduce el minuto actual:");
            intMinuto = scTeclado.nextInt();
        }

        System.out.println("Introduce el segundo actual:");
        int intSegundo = scTeclado.nextInt();

        while (intSegundo < 0 || intSegundo >= 60) {
            System.out.println("ERROR: segundo no válido.");
            System.out.println("Introduce el segundo actual:");
            intSegundo = scTeclado.nextInt();
        }

        intSegundo++;

        if (intSegundo >= 60) {
            intMinuto++;
            intSegundo = 0;
        }

        if (intMinuto >= 60) {
            intHora++;
            intMinuto = 0;
        }

        if (intHora >= 24) {
            intHora = 0;
        }

        if (intHora < 10) {
            System.out.print("0");
        }
        System.out.print(intHora + ":");

        if (intMinuto < 10) {
            System.out.print("0");
        }
        System.out.print(intMinuto + ":");

        if (intSegundo < 10) {
            System.out.print("0");
        }
        System.out.println(intSegundo);

        scTeclado.close();
    }
}
