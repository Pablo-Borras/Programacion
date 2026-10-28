import java.util.Scanner;

/**
 * Write a description of class Ejercicio_3_6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_3_10 {
    public static void main(String[] args) {
        Scanner scTeclado = new Scanner(System.in);
        
        System.out.println("Introduce (1) para empezar; (0) para salir.");
        int intEntrada = scTeclado.nextInt();
        
        int intNum = 0;
        int intImpar;
        int intSuma = 0;
        int intImparAux;
        
        if (intEntrada == 1) {
            for (int i= 0;i<10;i++) {
                intNum++;
                intImpar = intNum %2;
                
                if (intImpar != 0) {
                    intImparAux = intNum;
                    intSuma = intSuma + intImparAux;
                }
            }
            System.out.print("La suma de los primeros 10 números impares es: "+intSuma+".");
            
        } else if (intEntrada == 0) {
            System.out.println("Fin del programa.");
        }
    }
}