package Arrays;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        String[] cadenas= {"Hola", "Adios", "Mañana", "Semana", "Día", "Ayer"};
        Scanner scanner=new Scanner(System.in);
        String letra;

        System.out.println("Introduce una letra: ");
        letra= scanner.nextLine();
        
        for (int i=0; i<cadenas.length;i++) {
            if (cadenas[i].startsWith(letra)) {
                System.out.println(cadenas[i]);
            }
        }
        scanner.close();
    }
}
