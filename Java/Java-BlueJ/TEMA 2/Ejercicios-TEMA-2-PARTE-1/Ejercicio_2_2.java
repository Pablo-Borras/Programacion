import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_2 here.
 * 
 * @author
 * @version 1.0.0
 */
public class Ejercicio_2_2 {
    public static void main(String[] args) {
        // Definimos el scanner
        Scanner scTeclado = new Scanner(System.in);
        
        // Entrada:
        System.out.println("Comprobar si dos números son iguales.");
        
        // Definimos las variables del primer número y segundo número.
        System.out.println("Introduce el primer número:");
        int intPrimer_num = scTeclado.nextInt(); //Esto sirve para que un num entero (int) se defina por la última entrada que se escribió en el teclado.
        
        System.out.println("Introduce el segundo número:");
        int intSegundo_num = scTeclado.nextInt();
        
        
        // Salida:
        if (intPrimer_num == intSegundo_num) {
            System.out.println("Tu primer número es igual al segundo número.");
        } else {
            System.out.println("Tu primer número no es igual al segundo número.");
        }
    }
}