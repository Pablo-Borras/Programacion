import java.util.Scanner;

/**
 * Write a description of class Ejercicio_3_14 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_3_14 {
    public static void main(String[] args) {
        for (int intNum = 1; intNum <= 10; intNum++) {
            //El 2º bucle sirve para multiplicar el número de la tabla correspondiente.
            for (int i = 1; i <= 10; i++) {
                System.out.println(intNum + " x " + i + " = " + (intNum * i));
            }

            System.out.println();
        }
    }
}