import java.util.Scanner;

/**
 * Write a description of class Ejercicio_Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_Cuadrado {
    public static void main(String[] args) {
        Scanner scTeclado = new Scanner(System.in);
        
        System.out.println("Introduzca un número:");
        
        int intNum = scTeclado.nextInt();
        
        for (int i= 1; i<=intNum; i++) {
            for (int j= 1; j<=intNum; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}