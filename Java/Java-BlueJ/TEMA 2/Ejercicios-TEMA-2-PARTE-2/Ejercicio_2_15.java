import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_15 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_2_15 {
    public static void main(String[] args) {
    
        Scanner scTeclado = new Scanner(System.in);
        
        System.out.println("Introduce la base del triángulo:");
        double dBase = scTeclado.nextInt();
        
        System.out.println("Introduce la altura del triángulo:");
        double dAltura = scTeclado.nextInt();
        
        double dArea = (dBase * dAltura) / 2;
        
        if (dBase > 0 || dAltura > 0) {
            System.out.println("El área del triángulo es "+dArea+" unidades.");
        } else {
            System.out.println("ERROR: No se pueden ingresar números negativos.");
        }
    }
}