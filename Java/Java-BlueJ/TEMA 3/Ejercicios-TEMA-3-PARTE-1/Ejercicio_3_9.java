import java.util.Scanner;

/**
 * Write a description of class Ejercicio_3_9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_3_9 {
    public static void main(String[] args) {
        Scanner scTeclado = new Scanner(System.in);
        
        int intContador = 0;
        int intMultiplicacion = 0;
        
        System.out.println("Introduce un número del 1 al 10:");
        int intNum = scTeclado.nextInt();
        
        if (intNum >= 1 && intNum <= 10) {
            System.out.println("Tabla de multiplicar del "+intNum+":");
            
            do {
                intMultiplicacion = intNum * intContador;
                
                System.out.print(intNum+" x "+intContador+" = "+intMultiplicacion+"\n");
                
                intContador++;
                
            } while (intContador <= 10);
        } else {
            System.out.println("ERROR: Los números deben estar entre el 1 y el 10");
        }
    }
}