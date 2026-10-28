import java.util.Scanner;

/**
 * Write a description of class Ejercicios_3_8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicios_3_8 {
    public static void main(String[] args) {
        Scanner scTeclado = new Scanner(System.in);
        
        double dNum = 0;
        double dSuma = 0;
        int intContador = 1;
        
        for (int i= 0;i<10;i++) {
            System.out.println("\n"+intContador+". Introduce un número");
            dNum = scTeclado.nextDouble();
            
            dSuma = dSuma + dNum;
            intContador++;
        }
        
        double intMedia = dSuma / 10;

        System.out.println("\nLa media es: "+intMedia);
    
    }
}