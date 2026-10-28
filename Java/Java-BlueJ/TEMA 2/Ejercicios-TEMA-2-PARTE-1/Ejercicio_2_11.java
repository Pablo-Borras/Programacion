import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_11 here.
 * 
 * @author
 * @version (a version number or a date)
 */
public class Ejercicio_2_11 {
    public static void main(String[] args) {
    
        Scanner scTeclado = new Scanner(System.in);
        
        int intNum = scTeclado.nextInt();
        
        switch (intNum) {
        
            case 1:
                System.out.println("Lunes");
            break;
            
            case 2:
                System.out.println("Martes");
            break;
            
            case 3:
                System.out.println("Miércoles");
            break;
            
            case 4:
                System.out.println("Jueves");
            break;
        
            case 5:
                System.out.println("Viernes");
            break;
            
            case 6:
                System.out.println("Sábado");
            break;
            
            case 7:
                System.out.println("Domingo");
            break;
            
            default:
                System.out.println("Ingresa un número del 1 al 7.");
        }
        
        
        
    }
}