import java.util.Scanner;

/**
 * Write a description of class Ejercicio_3_2_For here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_3_2_For {
    public static void main(String[] args) {
        Scanner scTeclado = new Scanner(System.in);
        int intNum = 0;
        int intSuma = 0;
        int intAlumnos = 0;
        int intMayorEdad = 0;
        
        for (intNum =0; intNum >=0;){
            System.out.println("Introduce las edades:");
            intNum = scTeclado.nextInt();
            
            if (intNum >=0) {
                intSuma = intSuma + intNum;    
                
                intAlumnos++;
                if (intNum >= 18) {
                    intMayorEdad++;
                }
            }
        }
        
        double dMedia = intSuma / intAlumnos;
        
        System.out.println("Suma de edades: "+intSuma+" años\nMedia de edad: "+dMedia+" años\nAlumnos: "+intAlumnos+"\nMayor de edad: "+intMayorEdad);
    }
}
