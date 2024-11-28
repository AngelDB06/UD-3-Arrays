package Arrays;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        int[] numeros= new int[100];
        int n1=0, n2=0;
        Scanner scanner=new Scanner(System.in);

        for (int i=0; i<numeros.length; i++) {
            numeros[i]= (int) (Math.random() * 21);
        }
        
        System.out.println("Números generados: ");
        for (int numero:numeros) {
            System.out.println(numero + " ");
        }
    }
}
