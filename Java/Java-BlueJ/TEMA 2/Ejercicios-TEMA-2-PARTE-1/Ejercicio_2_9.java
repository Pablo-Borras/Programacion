import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_9 here.
 * 
 * @author
 * @version (a version number or a date)
 */
public class Ejercicio_2_9 {
    public static void main(String[] args) {
        
        Scanner scTeclado = new Scanner(System.in);
        
        System.out.println("Introduce un número entre el 0 y el 99.999:");
        int intNum = scTeclado.nextInt();
        
    if (0 <= intNum && intNum<= 99999) {
    if (intNum < 10) {
        System.out.println("El número "+intNum+" tiene 1 cifra");
    } else if (intNum < 100) {
        System.out.println("El número "+intNum+" tiene 2 cifras");
    } else if (intNum < 1000) {
        System.out.println("El número "+intNum+" tiene 3 cifras");
    } else if (intNum < 10000) {
        System.out.println("El número "+intNum+" tiene 4 cifras");
    } else {
        System.out.println("El número "+intNum+" tiene 5 cifras");
    }
}
}
}