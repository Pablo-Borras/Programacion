import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_12 here.
 * 
 * @author
 * @version (a version number or a date)
 */
public class Ejercicio_2_12 {
    public static void main(String[] args) {
    
        Scanner scTeclado = new Scanner(System.in);
        
        System.out.println("Introduce un día:");
        int intDia = scTeclado.nextInt();
        
        System.out.println("Introduce un mes:");
        int intMes = scTeclado.nextInt();
        
        System.out.println("Introduce un año:");
        int intAnio = scTeclado.nextInt();
        
        if (intDia <= 31 && intMes <= 12) { 
            switch (intMes) {
            
                case 4, 6, 9, 11:
                    if (intDia > 30) {
                        System.out.println("La fecha introducida no es correcta.");
                    } else {
                        System.out.println("La fecha introducida es correcta ("+intDia+"/"+intMes+"/"+intAnio+")");
                    }
                break;
                    
                case 2:
                    if (intDia > 28) {
                        System.out.println("La fecha introducida no es correcta.");
                    } else {
                        System.out.println("La fecha introducida es correcta ("+intDia+"/"+intMes+"/"+intAnio+")");
                    }    
                break;    
                
                default:
                    System.out.println("La fecha introducida es correcta ("+intDia+"/"+intMes+"/"+intAnio+")");
            }
        } else {
            System.out.println("La fecha introducida no es correcta.");
        }
    }
}