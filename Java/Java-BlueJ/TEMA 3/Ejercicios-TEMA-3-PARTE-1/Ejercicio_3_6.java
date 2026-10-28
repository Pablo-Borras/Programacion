import java.util.Scanner;

/**
 * Write a description of class Ejercicio_3_6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_3_6 {
    public static void main(String [] args) {
    
        Scanner scTeclado = new Scanner(System.in);
        
        System.out.println("Introduce un número:");
        int intNum = scTeclado.nextInt();
        
        for (int intIntentos=1;intIntentos<=intNum;intIntentos++) {
            System.out.print(intIntentos+", ");
        }
    }
}