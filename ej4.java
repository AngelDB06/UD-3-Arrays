package Arrays;

public class ej4 {
    public static void main(String[] args) {
        int[] array1= {7,4,2,9,8};
        int[] array2= {1,5,10,4,3};
        int[] arrayf= new int[5];
        for (int i=0; i<array1.length;i++) {
            if (array1[i]>array2[i]) {
                arrayf[i]=array1[i];
            } else {
                arrayf[i]=array2[i];
            }
            System.out.println(arrayf[i]);
        }
        
    }
}
