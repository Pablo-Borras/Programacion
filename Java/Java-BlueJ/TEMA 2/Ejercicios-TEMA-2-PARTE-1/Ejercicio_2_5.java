import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_5 here.
 * 
 * @author
 * @version (a version number or a date)
 */
public class Ejercicio_2_5 {
    public static void main(String[] args) {
    
    Scanner scTeclado = new Scanner(System.in);
    System.out.println("Introduce el primer número: ");
    int intPrimer_num = scTeclado.nextInt();
    
    System.out.println("Introduce el segundo número: ");
    int intSegundo_num = scTeclado.nextInt();
    
    if (intPrimer_num > intSegundo_num) {
        System.out.println(intPrimer_num+", "+intSegundo_num);
        
    }else if (intPrimer_num < intSegundo_num) {
        System.out.println(intSegundo_num+", "+intPrimer_num);
    }else {
        System.out.println("Los números son iguales.");
    }
    }
}