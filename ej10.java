package Arrays;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        int[] numeros= new int[20];
        int multiplo=0;
        Scanner scanner=new Scanner(System.in);

        for (int i=0;i<numeros.length;i++) {
            numeros[i]= (int) (Math.random()*401);
        }

        System.out.println("¿Qué numeros quieres resaltar?   1 - Múltiplos de 5    2 - Múltiplos de 7");
        multiplo=scanner.nextInt();

        if (multiplo==1) {
            multiplo=5;
        } else {
            if (multiplo==2) {
                multiplo=7;
            }
        }
        if (multiplo==5) {
            for (int i=0; i<numeros.length;i++) {
                if (numeros[i]%5==0) {
                    System.out.println(numeros[i]);
                }
            }
        } else {
            if (multiplo==7) {
                for (int i=0; i<numeros.length;i++) {
                    if (numeros[i]%7==0) {
                        System.out.println(numeros[i]);
                    }
                }
            } else {
                System.out.println("Introduce un valor válido");
            }
        }
        



    }
}
