import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_16 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_2_16 {
    public static void main(String[] args) {
        
        Scanner scTeclado = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int intNum = scTeclado.nextInt();
        
        int intAbsoluto = (intNum < 0) ? -intNum : intNum;
        
        System.out.println("El valor absoluto es: "+intAbsoluto);
    
    }
}