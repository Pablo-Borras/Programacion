import java.util.Scanner;

/**
 * Write a description of class Ejercicio_2_14 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_2_14 {
    public static void main(String[] args) {
        Scanner scTeclado = new Scanner(System.in);
        
        System.out.println("Introduce un número entre el 0 y el 99");
        int intNum = scTeclado.nextInt();
        
        if (intNum >= 0 && intNum <= 99) {
            if (intNum >= 0 && intNum <=9) {
                switch (intNum){
                    case 0:
                        System.out.println("Cero.");
                    break;
                    
                    case 1:
                        System.out.println("Uno.");
                    break;
                
                    case 2:
                        System.out.println("Dos.");
                    break;
                    
                    case 3:
                        System.out.println("Tres.");
                    break;
                    
                    case 4:
                        System.out.println("Cuatro.");
                    break;
                    
                    case 5:
                        System.out.println("Cinco.");
                    break;
                    
                    case 6:
                        System.out.println("Seis.");
                    break;
                    
                    case 7:
                        System.out.println("Siete.");
                    break;
                    
                    case 8:
                        System.out.println("Ocho.");
                    break;
                    
                    case 9:
                        System.out.println("Nueve.");
                    break;
                }
            }
            
            if (intNum >= 10 && intNum <=19) {
                switch (intNum){
                    case 10:
                        System.out.println("Diez");
                    break;
                    
                    case 11:
                        System.out.println("Once.");
                    break;
                
                    case 12:
                        System.out.println("Doce.");
                    break;
                    
                    case 13:
                        System.out.println("Trece.");
                    break;
                    
                    case 14:
                        System.out.println("Catorce.");
                    break;
                    
                    case 15:
                        System.out.println("Quince.");
                    break;
                    
                    case 16:
                        System.out.println("Dieciseis.");
                    break;
                    
                    case 17:
                        System.out.println("Diecisiete.");
                    break;
                    
                    case 18:
                        System.out.println("Dieciocho.");
                    break;
                    
                    case 19:
                        System.out.println("Diecinueve.");
                    break;
                }
            }
            
            if (intNum >= 20 && intNum <=29) {
                switch (intNum){
                    case 20:
                        System.out.println("Veinte");
                    break;
                    
                    case 21:
                        System.out.println("Veintiuno.");
                    break;
                
                    case 22:
                        System.out.println("Veintidós.");
                    break;
                    
                    case 23:
                        System.out.println("Veintitrés.");
                    break;
                    
                    case 24:
                        System.out.println("Veinticuatro.");
                    break;
                    
                    case 25:
                        System.out.println("Veinticinco.");
                    break;
                    
                    case 26:
                        System.out.println("Veintiséis.");
                    break;
                    
                    case 27:
                        System.out.println("Veintisiete.");
                    break;
                    
                    case 28:
                        System.out.println("Veintiocho.");
                    break;
                    
                    case 29:
                        System.out.println("Veintinueve.");
                    break;
                }
            }
            
            if (intNum >= 30 && intNum <=99) {
                int intUnidad = intNum %10;
                int intDecena = (intNum /10) %10;
                String decena = "";
                String unidad = "";
                switch (intDecena){
                    case 3:
                        decena = "Treinta ";
                    break;
                    
                    case 4:
                        decena = "Cuarenta ";
                    break;
                
                    case 5:
                        decena = "Cincuenta ";
                    break;
                    
                    case 6:
                        decena = "Sesenta ";
                    break;
                    
                    case 7:
                        decena = "Setenta ";
                    break;
                    
                    case 8:
                        decena = "Ochenta ";
                    break;
                    
                    case 9:
                        decena = "Noventa ";
                    break;
                }  
                switch (intUnidad) {
                    case 1:
                        unidad = "y uno";
                        break;
                        
                    case 2:
                        unidad = "y dos";
                        break;
                        
                    case 3:
                        unidad = "y tres";
                        break;
                        
                    case 4:
                        unidad = "y cuatro";
                        break;
                        
                    case 5:
                        unidad = "y cinco";;
                        break;
                        
                    case 6:
                        unidad = "y seis";;
                        break;
                        
                    case 7:
                        unidad = "y siete";;
                        break;
                        
                    case 8:
                        unidad = "y ocho";;
                        break;
                        
                    case 9:
                        unidad = "y nueve";;
                        break;
                }
                System.out.println(decena+""+unidad+".");
            }
        } else {
            System.out.println("El número debe estar entre el 0 y el 99.");
        }
    }
}
