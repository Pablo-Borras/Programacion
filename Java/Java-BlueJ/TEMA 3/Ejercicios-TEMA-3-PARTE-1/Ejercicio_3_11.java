import java.util.Scanner;

/**
 * Write a description of class Ejercicio_3_11 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_3_11 {
    public static void main (String[] args) {
        Scanner scTeclado = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int intNum = scTeclado.nextInt();
        
        int intContador = 1;
        long lMultiplicador = 1;
        
        do {
            lMultiplicador = lMultiplicador * intContador;
            
            intContador++;
        } while (intContador <= intNum);   
        
        System.out.println("El factorial de "+intNum+"! es: "+lMultiplicador+".");
    }
}