import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_4 here.
 * 
 * @author
 * @version (a version number or a date)
 */
public class Ejercicio_2_4 {
    public static void main(String[] args) {
    
        System.out.println("Introduce un número");
        
        Scanner scTeclado = new Scanner(System.in);
        double dNum = scTeclado.nextDouble();
        
        if (-1 <= dNum && dNum < 1) {
            System.out.println(dNum+" es casi cero.");
        } else {
            System.out.println(dNum+" no es casi cero.");
        }
        
    }
}