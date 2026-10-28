import java.util.Scanner;

/**
 * Write a description of class Ejercicio_Reloj_Arena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_Reloj_Arena {
    public static void main() {
        Scanner scTeclado = new Scanner(System.in);
        
        int intNum = scTeclado.nextInt();
        
        for (int i = intNum; i>=1; i--) {
            for (int j = 1; j<=intNum-i; j++){
                System.out.print(" ");
            }
            
            for (int k = 1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            
            System.out.println(" ");
        }
        
        for (int i = 1; i<=intNum; i++) {
            for (int j = 1; j<=intNum-i; j++){
                System.out.print(" ");
            }
            
            for (int k = 1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            
            System.out.println(" ");
        }
        
        
        
        
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        //Triangulo a la derecha (practica).
        for (int x= 1; x<=intNum;x++) {
            for (int y = 1; y<=intNum-x; y++){
                System.out.print(" ");
            }
            
            for (int z = 1; z<=x; z++){
                System.out.print("*");
            }
            
            System.out.println(" ");
        }
    }
}