import java.util.Scanner;

/**
 * Write a description of class Ejercicio_Rombo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_Rombo {
    public static void main(String[] args) {
        Scanner scTeclado = new Scanner(System.in);
        
        System.out.println("Introduzca un número:");
        
        int intNum = scTeclado.nextInt(); 
        
        //Filas
        for (int i = 1; i<=intNum; i++) {
            //Espacios
            for (int j= 1; j<=intNum-i; j++) {
                System.out.print(" ");
            }
            
            //Imprime un triangulo rectángulo y lo duplica quitandole 1.
            for (int k= 1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        //Para invertirlo, invertimos el bucle raíz ya que saltaría directamente abajo del todo con sus espacios y empezaría a
        //subir hasta dibujar el triangulo pero al revés.
        for (int i = intNum; i>=1; i--) {
            for (int j= 1; j<=intNum-i; j++) {
                System.out.print(" ");
            }
            
            for (int k= 1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        
        
        
        
        
        //Triángulo rectángulo pegado a la izquierda.
        for (int x=1; x<=intNum; x++) {
            for (int y= 1; y<=x;y++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}