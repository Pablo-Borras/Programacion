import java.util.Scanner;

/**
 * Juego de Dados
 */
public class Ejercicio_Dados {
    public static void main(String[] args) {

        System.out.println("Juego de Dados");

        Scanner scTeclado = new Scanner(System.in);

        // Dados del jugador 1
        System.out.println("Introduce el 1º dado del jugador 1:");
        int intJug1Dado1 = scTeclado.nextInt();

        if (intJug1Dado1 < 1 || intJug1Dado1 > 6) {
            System.out.println("Número introducido no válido.");
        }

        System.out.println("Introduce el 2º dado del jugador 1:");
        int intJug1Dado2 = scTeclado.nextInt();

        if (intJug1Dado2 < 1 || intJug1Dado2 > 6) {
            System.out.println("Número introducido no válido.");
        }

        // Dados del jugador 2
        System.out.println("Introduce el 1º dado del jugador 2:");
        int intJug2Dado1 = scTeclado.nextInt();

        if (intJug2Dado1 < 1 || intJug2Dado1 > 6) {
            System.out.println("Número introducido no válido.");
        }

        System.out.println("Introduce el 2º dado del jugador 2:");
        int intJug2Dado2 = scTeclado.nextInt();

        if (intJug2Dado2 < 1 || intJug2Dado2 > 6) {
            System.out.println("Número introducido no válido.");
        }

        // Contar los seises
        int intSeisesJug1 = 0;
        int intSeisesJug2 = 0;

        if (intJug1Dado1 == 6) {
            intSeisesJug1++;
        }

        if (intJug1Dado2 == 6) {
            intSeisesJug1++;
        }

        if (intJug2Dado1 == 6) {
            intSeisesJug2++;
        }

        if (intJug2Dado2 == 6) {
            intSeisesJug2++;
        }

        // Calcular los puntos totales
        int intResultadoJug1 = intJug1Dado1 + intJug1Dado2;
        int intResultadoJug2 = intJug2Dado1 + intJug2Dado2;

        // Determinar el ganador
        if (intSeisesJug1 > intSeisesJug2) {
            System.out.println("Jugador 1 gana.");
        } else if (intSeisesJug2 > intSeisesJug1) {
            System.out.println("Jugador 2 gana.");
        } else if (intResultadoJug1 > intResultadoJug2) {
            System.out.println("Jugador 1 gana.");
        } else if (intResultadoJug2 > intResultadoJug1) {
            System.out.println("Jugador 2 gana.");
        } else {
            System.out.println("Empate.");
        }

    }
}