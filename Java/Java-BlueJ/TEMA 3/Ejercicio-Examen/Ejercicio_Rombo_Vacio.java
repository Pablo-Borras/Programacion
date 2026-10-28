import java.util.Scanner;

/**
 * Write a description of class Ejercicio_Triangulo_Vacio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_Rombo_Vacio {
    public static void main(String[] args) {
        Scanner scTeclado = new Scanner(System.in);
        
        int intNum = scTeclado.nextInt();
        
        for (int i = 1; i<= intNum; i++) {
            for (int j= 1; j<=intNum-i; j++) {
                System.out.print(" ");
            }
            
            for (int k=1; k<=(2*i-1); k++) {
                if (k==1 || k==(2*i-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println(" ");
        }
        
        for (int i = intNum; i>= 1; i--) {
            for (int j= 1; j<=intNum-i; j++) {
                System.out.print(" ");
            }
            
            for (int k=1; k<=(2*i-1); k++) {
                if (k==1 || k==(2*i-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println(" ");
        }
    }
}