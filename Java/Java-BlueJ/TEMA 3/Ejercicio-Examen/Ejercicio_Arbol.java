import java.util.Scanner;

/**
 * Write a description of class Ejercicio_Arbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_Arbol {
    public static void main(String[] args) {
        Scanner scTeclado = new Scanner(System.in);
        
        int intNum = scTeclado.nextInt();
        
        for (int i = 1; i<=intNum; i++) {
            for (int j= 1; j<=intNum-i; j++) { //intNum - i para centrar un triangulo
                System.out.print(" ");
            }
            
            for (int k= 1; k<=(2*i-1); k++) { //2*i-1 para hacer el doble y restarle uno para que quede simétrico
                System.out.print((Math.random() < 0.30) ? "o" : "*");
            }
            //Salto de línea
            System.out.println(" ");
        }
        
        //Tronco del árbol
        for (int i = 1; i<=intNum/2; i++) {
            for (int j= 1; j<=intNum-2; j++) { //intNum - i para centrar un triangulo
                System.out.print(" ");
            }
            //Salto de línea
            System.out.println("||");
        }
        
        /*
         * byte, short, int, long, double, boolean, char, float
         * nextInt, nextLine, nextDouble...
         * 
         * =======CONDICIONALES=======
         * if (intNum1 >= intNum2) {
         *  ...
         * } else if (otra condicion...) {
         *  ...
         * } else {
         *  ...
         * }
         * 
         * if (intNum != 7)....
         *  
         * TERNARIO = condicion ? "verdadero" : "falso"; ---> intNum >= 30 ? "true" : "false";
         * 
         * switch() {
         *  case 1:
         *      ...
         *  break;
         *  
         * }
         * 
         * =======MATH COMANDOS=======
         * Raíz cuadrada = Math.sqrt(numero)
         * NUMERO DEL 0 AL 99 ---> int intNum1 = (int) (Math.random() * 100); 
         * NUMERO DEL 1 AL 100 ---> int intNum2 = (int) (Math.random() * 100) + 1;
         * 
         * =======BUCLES=======
         * SI NO SABEMOS EL NUM DE VECES ---> while (mientras sea verdadero, se ejecuta) {
         *                                      ..... 
         *                                    }
         * SI AL MENOS SE EJECUTA 1 VEZ ---> do {
         *                                      ..... 
         *                                   } while (mientras sea verdadero, se ejecuta);
         *                                    
         * SI SABEMOS EL NUM DE VECES ---> for (variable; mientras sea verdadero; contador) {
         *                                     ..... 
         *                                 }
         * 
         * 
         * 
           */
    }
}