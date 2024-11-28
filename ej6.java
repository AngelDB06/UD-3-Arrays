package Arrays;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int nalumnos= 0, suma=0, media=0;

        System.out.println("Introduce el número de alumnos: ");
        nalumnos=scanner.nextInt();
        
        int[] notas= new int[nalumnos];

        for (int i=0; i<notas.length;i++) {
            System.out.println("Introuce la nota del alumno "+(i+1)+".");
            notas[i]=scanner.nextInt();
            suma=notas[i]+suma;
        }
        media=suma/nalumnos;
        System.out.println("La media de los alumnos es "+media+".");
        for (int p=0; p<notas.length;p++) {
            if (notas[p]>media) {
                System.out.println("La nota del alumno "+(p+1)+" está por encima de la media de clase.");
            }
        }
        scanner.close();
    }
}
