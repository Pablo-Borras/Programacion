import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_1 here.
 * 
 * @author
 * @version (a version number or a date)
 */
public class Ejercicio_2_1 {
    
    public static void main(String[] args) {
        /*
         * Entrada: Solicitamos un numero
         * Salida: ponemos en pantalla la frase "tu numero es" y añadimos par o impar
         * Proceso: tendremos que determinar si el numero introducido es divisible por 2
         * Persistencia: hay que recordar el numero que nos dan. Hay que recordar el scanner.
         */
        
        //Entrada. Para solicitar un numero activamos el teclado a partir de un objeto escaner
        //el algoritmo implica declarar una variable (trozo de memoria, pertenece a la persistencia)
        //despues, llenar esa variable con lo que el usuario del programa teclee en el teclado
        
        //Una sentencia declarativa es: Tipo objeto;
        
        Scanner teclado;
        
        //Asignacion. Se trata de poner un objeto o variable, un "=" y lo que quiero guardar
        //Aqui estamos creando un ojbeto, y despues guardandolo en la persistencia
        teclado = new Scanner(System.in);
        
        //Tipo variable 
        int numero;
        
        //Para palabras usamos objetos String
        String resultado;
        
        numero = teclado.nextInt();
        
        //Aqui el proceso
        //if(escribo la condicion que se convierte en verdad o mentira)
        if(numero %2 == 0) {
            resultado = "par";
        } else {
            resultado = "impar";
        }
        
        
        //Por ultimo la salida
        System.out.println("Tu numero es "+resultado);
        
        
        
        
        
    }
}