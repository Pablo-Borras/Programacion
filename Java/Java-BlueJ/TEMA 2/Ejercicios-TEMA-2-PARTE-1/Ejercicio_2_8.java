import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_8 here.
 * 
 * @author
 * @version (a version number or a date)
 */
public class Ejercicio_2_8 {
    public static void main(String[] args) {
    
    Scanner scTeclado = new Scanner(System.in);
    
    System.out.println("Introduce el primer coeficiente (a):");
    int intCoef_a = scTeclado.nextInt();
    
    System.out.println("Introduce el segundo coeficiente (b):");
    int intCoef_b = scTeclado.nextInt();
    
    System.out.println("Introduce el tercer coeficiente (c):");
    int intCoef_c = scTeclado.nextInt();
    
    double dRaiz = (intCoef_b * intCoef_b) - 4 * (intCoef_a * intCoef_c);

    if (dRaiz < 0) {
        System.out.println("Error matemático.");
    } else if (dRaiz > 0) {
        double dRaiz_resultado = Math.sqrt(dRaiz);
        double dfraccion1 = (- intCoef_b + dRaiz_resultado)/(2 * intCoef_a);
        double dfraccion2 = (- intCoef_b - dRaiz_resultado)/(2 * intCoef_a);
        
        System.out.println("x1 es igual a: "+dfraccion1);
        System.out.println("x2 es igual a: "+dfraccion2);
    } else {
        double dRaiz_resultado = Math.sqrt(dRaiz);
        double dfraccion1 = (- intCoef_b + dRaiz_resultado)/(2 * intCoef_a);
        
        System.out.println("x1 es igual a: "+dfraccion1);
        System.out.println("Esta ecuación solo tiene una solución.");
    }
}
}