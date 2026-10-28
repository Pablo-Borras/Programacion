import java.util.Scanner;

/**
 * Write a description of class Ejercicio_3_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_3_1 {
    public static void main(String[] args) {
        Scanner scTeclado = new Scanner(System.in);
        int intNum = 1;
        String par = "";
        
        while (intNum != 0){
            System.out.println("Introduce un número:");
            System.out.println("Pulsa 0 para salir.");
            intNum = scTeclado.nextInt();
            
            if (intNum != 0) {            
                if (intNum %2== 0) {
                    par = "es par";
                } else {
                    par = "es impar";
                }
                
                String positivo = (intNum >= 0) ? "positivo" : "negativo";
                
                int intCuadrado = intNum * intNum;
                
                System.out.println("El número "+intNum+" es "+par+", "+positivo+" y su cuadrado es "+intCuadrado+".");
                
            } else {
                System.out.println("Fin del programa.");
            }
        }
    }
}