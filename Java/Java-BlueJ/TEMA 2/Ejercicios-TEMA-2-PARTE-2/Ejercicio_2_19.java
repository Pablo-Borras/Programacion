import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_19 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_2_19 {
    public static void main(String[] args) {
    
        Scanner scTeclado = new Scanner(System.in);
        
        System.out.println("Introduce el ángulo:");
        
        int intAngulo = scTeclado.nextInt();
        
        if (intAngulo >= 0 && intAngulo <= 360) {
                
            double dRadian = (intAngulo * Math.PI) /180;
            
            System.out.println("El ángulo equivale a "+dRadian+" radianes.");
        } else {
            int intAnguloAux = intAngulo %360; //Me dice el ángulo que sobra
            double dVueltas = intAngulo /360; //Me dice las vueltas que dio
            
            double dRadian = ((intAnguloAux * Math.PI) /180) * dVueltas;
            
            System.out.println("El ángulo sería "+dVueltas+" vueltas y "+intAnguloAux+"º.");
            System.out.println("El ángulo equivale a "+dRadian+" radianes.");
        }
        
    }
}