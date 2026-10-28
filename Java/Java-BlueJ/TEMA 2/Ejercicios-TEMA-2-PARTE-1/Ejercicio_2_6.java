import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_3 here.
 * 
 * @author
 * @version (a version number or a date)
 */
public class Ejercicio_2_6 {
    public static void main(String[] args) {
    
        Scanner scTeclado = new Scanner(System.in);
        
        System.out.println("Introduce tu primer número:");
        
        int intPrimer_num = scTeclado.nextInt();
        
        System.out.println("Introduce tu segundo número:");
        
        int intSegundo_num = scTeclado.nextInt();
        
        if (intPrimer_num > intSegundo_num) {
            System.out.println(intPrimer_num+" es mayor que "+intSegundo_num);
        } else if (intPrimer_num < intSegundo_num) {
            System.out.println(intPrimer_num+" es menor que "+intSegundo_num);
        } else {
            System.out.println(intPrimer_num+" es igual a "+intSegundo_num);
        }
        
    
    }
}