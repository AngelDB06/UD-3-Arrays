package Arrays;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        int[] enteros= {0,2,4,6,8,10,8,6,2,0};
        Scanner scanner = new Scanner(System.in);
        int contador=0;
        
        System.out.println("Introduce un valor entero: ");
        int ventero = scanner.nextInt();

        for (int i=0; i<enteros.length; i++) {
            if (ventero==enteros[i]) {
                contador++;
            }
        }
        System.out.println("El valor aparece un total de "+contador+" veces.");
        scanner.close();
    }
}
