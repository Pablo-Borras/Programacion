import java.util.Scanner;

/**
 * Write a description of class Ejercicio_6174 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_6174 {
    public static void main(String [] args) {
        System.out.println("Introduce un número para conseguir el 6174.");

        Scanner scTeclado = new Scanner(System.in);

        int intNum = scTeclado.nextInt();
        
        int intMillar = intNum /1000; //4º digito
        int intCentena = (intNum/100) %10; //3º digito
        int intDecena = (intNum/10) %10; //2º digito
        int intUnidad = intNum %10; //1º digito

        int intM= 0;
        int intm= 0;
        ////////////////////////////////////////////////////////
        int intNumAux = 0;
        
        int intResultado = 0;
                
        int intContador= 0;
        

        if (intMillar == intCentena && intDecena == intUnidad) {
            System.out.println("ERROR: No puedes introducir un número con 4 digitos iguales.");
        } else if (intNum >= 1001 && intNum <=9999){
            do {
                for (int i=1; i<=3; i++) {
                    if (intMillar < intCentena) {
                        intNumAux = intMillar; //Pone temporalmente el millar ahí
                        intMillar = intCentena; //Sustituye el millar erroneo por la centena que ahora se convierte en millar
                        intCentena = intNumAux; //El millar antiguo (guardado en temp) pasa a ser una centena
                    }
                    
                    if (intCentena < intDecena) {
                        intNumAux = intCentena;
                        intCentena = intDecena;
                        intDecena = intNumAux;
                    }
                    
                    if (intDecena < intUnidad) {
                        intNumAux = intDecena;
                        intDecena = intUnidad;
                        intUnidad = intNumAux;
                    }
                }
                
                intM = intMillar * 1000 + intCentena * 100 + intDecena * 10 + intUnidad;
                
                intm = intUnidad * 1000 + intDecena * 100 + intCentena * 10 + intMillar;
                            
                intResultado= intM - intm;
                
                //Esto para que adquiera valor los nuevos números de la resta
                intMillar = intResultado / 1000;
                intCentena = (intResultado / 100) % 10;
                intDecena = (intResultado / 10) % 10;
                intUnidad = intResultado % 10;
                
                intContador++;
                System.out.println(intContador+". "+intResultado);
            } while (intResultado != 6174);
            
            System.out.println("\n"+intResultado+" en "+intContador+" intentos.");
        }
    }
}