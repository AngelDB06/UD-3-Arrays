package Arrays;

public class ej11 {
    public static void main(String[] args) {
        int[][] numeros= {{0,30,2,0,0,5},{75,0,0,0,0,0},{0,0,-2,9,0,11}};

        for (int fila = 0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[fila].length; columna++) {
            System.out.print(numeros[fila][columna]+" ");
            }
            System.out.println();
            }
            }
    }

