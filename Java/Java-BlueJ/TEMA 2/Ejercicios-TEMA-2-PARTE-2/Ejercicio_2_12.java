import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_2_12 {
    public static void main(String[] args) {
    
        System.out.println("Introduce tu DNI: ");
        Scanner scTeclado = new Scanner(System.in);
        
        int intDNI = scTeclado.nextInt();
        
        int intDNIAux = intDNI %23;
            
        switch (intDNIAux){
            case 0:
                System.out.println("Tu DNI acaba por T.");
            break;
            
            case 1:
                System.out.println("Tu DNI acaba por R.");
            break;
            
            case 2:
                System.out.println("Tu DNI acaba por W.");
            break;
            
            case 3:
                System.out.println("Tu DNI acaba por A.");
            break;
            
            case 4:
                System.out.println("Tu DNI acaba por G.");
            break;
            
            case 5:
                System.out.println("Tu DNI acaba por M.");
            break;
            
            case 6:
                System.out.println("Tu DNI acaba por Y.");
            break;
            
            case 7:
                System.out.println("Tu DNI acaba por F.");
            break;
            
            case 8:
                System.out.println("Tu DNI acaba por P.");
            break;
            
            case 9:
                System.out.println("Tu DNI acaba por D.");
            break;
            
            case 10:
                System.out.println("Tu DNI acaba por X.");
            break;
            
            case 11:
                System.out.println("Tu DNI acaba por B.");
            break;
            
            case 12:
                System.out.println("Tu DNI acaba por N.");
            break;
            
            case 13:
                System.out.println("Tu DNI acaba por J.");
            break;
            
            case 14:
                System.out.println("Tu DNI acaba por Z.");
            break;
            
            case 15:
                System.out.println("Tu DNI acaba por S.");
            break;
            
            case 16:
                System.out.println("Tu DNI acaba por Q.");
            break;
            
            case 17:
                System.out.println("Tu DNI acaba por V.");
            break;
            
            case 18:
                System.out.println("Tu DNI acaba por H.");
            break;
            
            case 19:
                System.out.println("Tu DNI acaba por L.");
            break;
            
            case 20:
                System.out.println("Tu DNI acaba por C.");
            break;
            
            case 21:
                System.out.println("Tu DNI acaba por K.");
            break;
            
            case 22:
                System.out.println("Tu DNI acaba por E.");
            break;
        }
    }
}