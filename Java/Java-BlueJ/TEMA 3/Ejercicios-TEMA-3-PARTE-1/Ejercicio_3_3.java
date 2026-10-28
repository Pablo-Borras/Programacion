import java.util.Scanner;

/**
 * Write a description of class Ejercicio_3_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_3_3 {
    public static void main(String[] args) {
        int intNum = -1;
        int intIntento = 0;
        intNum = (int) (Math.random() * 100) + 1;
        
        Scanner scTeclado = new Scanner(System.in);

        while (intIntento != -1) {
            System.out.println("Número generado. Intenta adivinarlo! (Escribe -1 para salir.)");
            
            intIntento = scTeclado.nextInt();
            
            if (intIntento >=0) {
                if (intNum < intIntento) {
                    System.out.println("Es menor.");
                }
                if (intNum > intIntento) {
                    System.out.println("Es mayor.");
                }
                if (intNum == intIntento) {
                    System.out.println("Acertaste el número!");
                    intIntento = -1;
                    
                    System.out.println("Fin del programa.");
                }
            } else {
                System.out.println("Fin del programa.");
            }
        }
    }
}