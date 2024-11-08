package Arrays;

public class ej2 {
    public static void main(String[] args) {
        String[] cadenas= {"Hola", "Adios","Hasta mañana", "Hola muy buenas"};
        int contador1=0, contador2=0;
        
        for (int i=0; i<cadenas.length;i++){
            contador1= cadenas[i].length();
            if (contador1>contador2) {
                contador2=contador1;
                contador1=i;
            }
        }
        System.out.println(cadenas[contador1]);
    }
}
