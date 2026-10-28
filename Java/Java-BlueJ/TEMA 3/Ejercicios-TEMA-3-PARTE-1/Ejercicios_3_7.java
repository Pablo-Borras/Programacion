/**
 * Write a description of class Ejercicios_3_7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicios_3_7 {
    public static void main(String[] args) {
        int intNum = 7;
        int intContador = 0;
        int intMultiplos = 0;
        
        System.out.println("Los múltiplos de 7 menores que 100 son:");
        
        System.out.println("");
        do {
            intContador++;
            
            intMultiplos = intNum * intContador;
            
            //Comprobamos antes si ya superó el 100
            if (intMultiplos < 100) {
                System.out.print(intMultiplos+", ");
            }   
        } while (intMultiplos < 100);
    }
}