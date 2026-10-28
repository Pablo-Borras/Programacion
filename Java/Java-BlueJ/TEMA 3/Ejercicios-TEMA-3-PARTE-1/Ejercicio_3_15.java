import java.util.Scanner;

/**
 * Write a description of class Ejercicio_3_15 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_3_15 {
    public static void main (String[] args) {
        Scanner scTeclado = new Scanner(System.in);
        
        System.out.println("Introduce un número:");
        int intNum = scTeclado.nextInt();
        
        for (int i= 1; i <= intNum; i++) {
            //j <= i ya que i al principio vale 1, y va incrementándose.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Salto de línea.
            System.out.println();
        }
    }
}