import java.util.Scanner;

/**
 * Write a description of class Ejercicio_3_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_3_4 {
    public static void main(String[] args) {
        Scanner scTeclado = new Scanner(System.in);
        
        int intAltura = 0;
        int intAlturaAux = 0;
        int intAlto = 0;
        int intContador = 0;
        
        do {
            System.out.println("Introduce la altura de los árboles (Pulsa -1 para salir.)");
            intAltura = scTeclado.nextInt();
            
            //Ordenar cual es más alto
            if (intAltura > intAlto) { 
                intAlto = intAltura;
            }
            
            intContador++;
        } while (intAltura != -1);
        
        intContador--;
        System.out.println("El árbol más alto es el número "+intContador+" que mide: "+intAlto+" cm.");
    }
}