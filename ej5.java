package Arrays;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] numeros= new int[10];
        int suma=0, media=0;

        System.out.println("Introduce 10 números: ");
        for (int i = 0; i<numeros.length;i++) {
            numeros[i]=scanner.nextInt();
            suma= numeros[i]+suma;
        }
        media=suma/10;
        System.out.println(media);
        scanner.close();
    }
}
