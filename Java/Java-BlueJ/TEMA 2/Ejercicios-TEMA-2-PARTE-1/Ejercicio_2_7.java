import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_7 here.
 * 
 * @author
 * @version (a version number or a date)
 */
public class Ejercicio_2_7 {
    public static void main(String[] args) {
    
    Scanner scTeclado = new Scanner(System.in);
    
    System.out.println("Introduce el primer número:");
    int intPrimer_num = scTeclado.nextInt();
    
    System.out.println("Introduce el segundo número:");
    int intSegundo_num = scTeclado.nextInt();
    
    System.out.println("Introduce el tercer número:");
    int intTercer_num = scTeclado.nextInt();
    
    //Primero, segundo, tercero
    if (intPrimer_num > intSegundo_num && intSegundo_num > intTercer_num) {
        System.out.println(intPrimer_num+", "+intSegundo_num+", "+intTercer_num);
    
        //Segundo, primero, tercero.
        }else if (intSegundo_num > intPrimer_num && intPrimer_num > intTercer_num) {
            System.out.println(intSegundo_num+", "+intPrimer_num+", "+intTercer_num);
            
        //Tercero, segundo, primero
        }else if (intTercer_num > intSegundo_num && intSegundo_num > intPrimer_num) {
            System.out.println(intTercer_num+", "+intSegundo_num+", "+intPrimer_num);
            
        //Primero, tercero, segundo
        }else if (intPrimer_num > intTercer_num && intTercer_num > intSegundo_num) {
            System.out.println(intPrimer_num+", "+intTercer_num+", "+intSegundo_num);
        
        //Tercer, primero, segundo
        }else if (intTercer_num > intPrimer_num && intPrimer_num > intSegundo_num) {
            System.out.println(intTercer_num+", "+intPrimer_num+", "+intSegundo_num);
            
        // Segundo, tercero, primero
        }else if (intSegundo_num > intTercer_num && intTercer_num > intPrimer_num) {
        System.out.println(intSegundo_num+", "+intTercer_num+", "+intPrimer_num);
    }
    }
}