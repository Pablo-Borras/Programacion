import java.util.Scanner;

/**
 * Write a description of class Ejercicio_3_13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_3_13 {
    public static void main(String[] args) {
        Scanner scTeclado = new Scanner(System.in);
        
        int intAprobado= 0;
        int intSuspenso = 0;
        int intCondicionado = 0;
        
        for (int i= 0; i<6; i++) {
            System.out.println("Introduce una nota:");
            
            double dNotas = scTeclado.nextDouble();
            
            if (dNotas >= 0 && dNotas <= 3.99) {
                intSuspenso++;
            } else if (dNotas >= 4 && dNotas <= 4.99) {
                intCondicionado++;
            } else if (dNotas >= 5 && dNotas <= 10) {
                intAprobado++;
            }
        }
        
        System.out.println("Hay "+intAprobado+" aprobados, "+intCondicionado+" condicionados y "+intSuspenso+" suspensos.");
    }
}