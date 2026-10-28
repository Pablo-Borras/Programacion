import java.util.Scanner;

/**
 * Write a description of class Ejercicio_Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_Triangulo {
    public static void main(String[] args) {
        Scanner scTeclado = new Scanner(System.in);
        
        System.out.println("Introduzca un número:");
        
        int intNum = scTeclado.nextInt();
        
        //Imprime las filas.
        for (int i= 1; i<=intNum; i++) {
            //Espacios para centrarlo
            for (int j= 1; j<=intNum-i; j++) {
                System.out.print(" ");
            }
            
            //Para hacerlo simétrico debemos hacer que sea un número impar, entonces generamos el doble y le quitamos 1
            for (int k= 1; k<=(2*i-1); k++) {
                System.out.print("*");
            }
            
            System.out.println(" ");
        }
        
    }
}