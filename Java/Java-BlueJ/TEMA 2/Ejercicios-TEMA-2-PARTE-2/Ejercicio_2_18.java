import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_18 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_2_18 {
    public static void main(String[] args) {
        
        int intNum1 = (int) (Math.random() * 100);
        int intNum2 = (int) (Math.random() * 100);
        int intOperacion = (int) (Math.random() * 3);
        
        int intNumResult = 0;
        String stOperacion = "";
        switch (intOperacion){
            case 0:
                stOperacion = "Súmalos";
                intNumResult = intNum1 + intNum2;
            break;
            
            case 1:
                stOperacion = "Réstalos";
                intNumResult = intNum1 - intNum2;
            break;
        
            case 2:
                stOperacion = "Multiplicalos";
                intNumResult = intNum1 * intNum2;
            break;
        }
        
        System.out.println("Los números son "+intNum1+" y "+intNum2);
        System.out.println(stOperacion+" e introduce el resultado:");
        
        Scanner scTeclado = new Scanner(System.in);
        
        int intResultado = scTeclado.nextInt();
        
        if (intResultado == intNumResult) {
            System.out.println("Tu resultado es correcto.");
        } else {
            System.out.println("Tu resultado es incorrecto.");       
        }
    }
}
