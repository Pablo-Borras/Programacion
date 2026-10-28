import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_10 here.
 * 
 * @author
 * @version (a version number or a date)
 */
public class Ejercicio_2_10 {
    public static void main(String[] args) {
    
        Scanner scTeclado = new Scanner(System.in);
        
        int intNota = scTeclado.nextInt();
        
        switch (intNota){
        
            case 0, 1, 2, 3 ,4:
                System.out.println("INSUFICIENTE");
            break;
            
            case 5:
                System.out.println("SUFICIENTE");
            break;
            
            case 6:
                System.out.println("BIEN");
            break;
            
            case 7, 8:
                System.out.println("NOTABLE");
            break;
            
            case 9, 10:
                System.out.println("SOBRESALIENTE");
            break;
            
            default:
                System.out.println("ERROR");
        }
    
    }
}