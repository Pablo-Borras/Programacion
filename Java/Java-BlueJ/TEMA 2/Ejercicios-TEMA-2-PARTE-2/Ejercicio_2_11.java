import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_15 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_2_11 {
    public static void main(String[] args) {
    
        Scanner scTeclado = new Scanner(System.in);
        
        System.out.println("Introduce un número:");
        int intNum = scTeclado.nextInt();
        
        if (intNum > 9 && intNum < 100) {
            if (intNum %11 == 0) {
                System.out.println("El número "+intNum+" es capicua.");
            } else {
                System.out.println("El número "+intNum+" no es capicua.");
            }
        }
        
        int intNumDig = intNum;
        if (intNum > 99 && intNum < 1000) {
            int intD3 = intNumDig % 10; //Coge un digito en especifico
            int intD2 = (intNumDig/10) % 10; //Le quita un digito
            int intD1 = (intNumDig/100) % 10;

            if (intD3 == intD1) {
                System.out.println("El número "+intNum+" es capicua.");
            } else {
                System.out.println("El número "+intNum+" no es capicua.");
            }
        }
        
        if (intNum > 999 && intNum < 10000) {
            int intD4 = intNumDig % 10; //Coge un digito en especifico
            int intD3 = (intNumDig/10) % 10; //Le quita un digito
            int intD2 = (intNumDig/100) % 10;
            int intD1 = (intNumDig/1000) % 10;

            if (intD4 == intD1 && intD3 == intD2) {
                System.out.println("El número "+intNum+" es capicua.");
            } else {
                System.out.println("El número "+intNum+" no es capicua.");
            }
        }
    }
}