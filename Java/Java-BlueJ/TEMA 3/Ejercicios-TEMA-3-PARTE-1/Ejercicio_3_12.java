import java.util.Scanner;

/**
 * Write a description of class Ejercicio_3_12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_3_12 {
    public static void main(String[] args){
        Scanner scTeclado = new Scanner(System.in);
        
        int intSuspenso = 0;
        int intAprobado = 0;
        
        for (int i = 0; i<5; i++) {
            System.out.println("Introduce una nota:");
            double dNotas = scTeclado.nextDouble();
            
            if (dNotas >= 0 && dNotas <= 4.99) {
                intSuspenso++;
            } else if (dNotas >= 5 && dNotas <= 10) {
                intAprobado++;
            }
        }
        
        System.out.println("Hay "+intAprobado+" aprobados y "+intSuspenso+" suspensos.");
    }    
}