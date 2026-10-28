import java.util.Scanner;

/**
 * Write a description of class Ejercicio_Triaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio_Triaje {
    public static void main (String[] args) {
        Scanner scTeclado = new Scanner(System.in);

        boolean bHemorragia = false;
        boolean bInterna = false;
        boolean bIctus = false;
        boolean bArritmia = false;
        boolean bFR = false;
        boolean bTumor = false;
        boolean bNeumonia = false;
        boolean bIGeneral = false;

        System.out.println("¿El paciente presenta alguno de estos transtornos?");
        System.out.println("\nHemorragia: (1) SÍ | (2) NO:");
        int intRespuesta= scTeclado.nextInt();

        if (intRespuesta == 1) {
            bHemorragia = true;
        } else if (intRespuesta == 2){
            bHemorragia = false;
        } else {
            System.out.println("ERROR: Pulse la tecla correcta.");
        }

        System.out.println("Hemorragia Interna: (1) SÍ | (2) NO:");
        intRespuesta= scTeclado.nextInt();

        if (intRespuesta == 1) {
            bInterna = true;
        } else if (intRespuesta == 2){
            bInterna = false;
        } else {
            System.out.println("ERROR: Pulse la tecla correcta.");
        }

        System.out.println("Ictus: (1) SÍ | (2) NO:");
        intRespuesta= scTeclado.nextInt();

        if (intRespuesta == 1) {
            bIctus = true;
        } else if (intRespuesta == 2){
            bIctus = false;
        } else {
            System.out.println("ERROR: Pulse la tecla correcta.");
        }

        System.out.println("Arritmia (Introduzca la FC):");
        int intFrecuencia = scTeclado.nextInt();
        
        if (intFrecuencia < 40 || intFrecuencia > 110) {
            bArritmia = true;
        } else {
            bArritmia = false;
        }

        System.out.println("Introduzca la Frecuencia Respiratoria:");
        int intFR = scTeclado.nextInt();
        
        if (intFR < 10 || intFR > 20) {
            bFR= true;
        } else {
            bFR = false;
        }
        
        System.out.println("Tumor: (1) SÍ | (2) NO:");
        intRespuesta= scTeclado.nextInt();
        
        if (intRespuesta == 1) {
            bTumor = true;
        } else if (intRespuesta == 2){
            bTumor = false;
        } else {
            System.out.println("ERROR: Pulse la tecla correcta.");
        }

        System.out.println("Neumonia: (1) SÍ | (2) NO:");
        intRespuesta= scTeclado.nextInt();
        
        if (intRespuesta == 1) {
            bNeumonia = true;
        } else if (intRespuesta == 2){
            bNeumonia = false;
        } else {
            System.out.println("ERROR: Pulse la tecla correcta.");
        }

        System.out.println("Infección General: (1) SÍ | (2) NO:");
        intRespuesta= scTeclado.nextInt();
        
        if (intRespuesta == 1) {
            bIGeneral = true;
        } else if (intRespuesta == 2){
            bIGeneral = false;
        } else {
            System.out.println("ERROR: Pulse la tecla correcta.");
        }

        
        
        if (bHemorragia == true || bInterna == true || bIctus == true || bArritmia == true || bFR == true) {
            System.out.println("El paciente entra en el rango ROJO.");
        } else if (bTumor == true || bNeumonia == true || bIGeneral == true) {
            System.out.println("El paciente entra en el rango AMARILLO.");    
        } else {
            System.out.println("El paciente entra en el rango VERDE."); 
        }
    }
}