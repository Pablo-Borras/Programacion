import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_14 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_2_14 {
    public static void main(String[] args) {
    
        Scanner scTeclado = new Scanner(System.in);
        

        System.out.println("Introduce un día:");
        int intDia = scTeclado.nextInt();
        
        if (intDia < 32) {
            System.out.println("Introduce un mes:");
            int intMes = scTeclado.nextInt();

            if (intMes < 13) {
                System.out.println("Introduce un año:");
                int intAnio = scTeclado.nextInt();
            } else {
                System.out.println("ERROR: Formato no válido.");
        }
        
        } else {
            System.out.println("ERROR: Formato no válido.");
        }
        
        
        
        
        intDia++;
        
        if (intDia <= 31) {
            if (intMes = 1)    
        }
    
    }
}