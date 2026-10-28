import java.util.Scanner;

/**
 * Write a description of class Ejercicio_3_5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_3_5 {
    public static void main(String[] args) {
        Scanner scTeclado = new Scanner(System.in);
        
        int intNum1 = 0;
        int intNum2 = 0;
        int intSuma, intIntento, intResultado= 0;
        int intCorrectas = -1;
        
        do {
            intNum1 = (int) (Math.random() * 100) +1;
            intNum2 = (int) (Math.random() * 100) +1;
            
            intResultado = intNum1 + intNum2;
            
            System.out.println("Números generados: "+intNum1+", "+intNum2);
            
            System.out.println("\nSúmalos he introduce la respuesta:");
            intIntento = scTeclado.nextInt();
            
            if (intResultado == intIntento) {
                System.out.println("\nResultado correcto!");
            }

            intCorrectas++;
        } while (intResultado == intIntento);
        
        System.out.println("\nHas acertado "+intCorrectas+" veces.");
        System.out.println("Fin del programa.");
    }
}