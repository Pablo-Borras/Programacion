import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_17 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_2_17 {
    public static void main(String[] args) {
        
        int intNum1 = (int) (Math.random() * 100);
        int intNum2 = (int) (Math.random() * 100);
        
        int intNumResult = intNum1 + intNum2;
        
        System.out.println("Los números son "+intNum1+" y "+intNum2);
        System.out.println("Súmalos e introduce el resultado:");
        
        Scanner scTeclado = new Scanner(System.in);
        
        int intResultado = scTeclado.nextInt();
        
        if (intResultado == intNumResult) {
            System.out.println("Tu suma es correcta.");
        } else {
            System.out.println("Tu suma es incorrecta.");       
        }
    }
}