package Arrays;

public class ej9 {
    public static void main(String[] args) {
        int[] numeros= new int[20];
        int[] npares=new int[20];
        int[] nimpares=new int[20];

        for (int i=0; i<numeros.length;i++) {
            numeros[i]= (int) (Math.random()*101);
            if (numeros[i]%2==0) {
                npares[i]=numeros[i];
            } else {
                nimpares[i]=numeros[i];
            }
        }
        
        for (int p=0; p<numeros.length;p++) {
            if (npares[p]!=0) {
                System.out.println(npares[p]);
            }
        }
        for (int p=0; p<numeros.length;p++) {
            if (nimpares[p]!=0) {
                System.out.println(nimpares[p]);
            }
        }

        
    }
}
