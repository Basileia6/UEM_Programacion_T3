import java.util.Scanner;

public class t3_FOR_ej08_dieznum {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        double mediapos = 0.0;
        int numpos = 0;
        double medianeg = 0.0;
        int numneg = 0;
        int numcero = 0;

        for (int i = 0; i<10; i++){
            System.out.println("Introduzca un número");
            int num = reader.nextInt();

            if (num < 0){
                numneg++;
                medianeg += num;
            } else if (num == 0) {
                numcero++;
            } else {
                numpos++;
                mediapos += num;
            }
        }

        System.out.println("Hay " + numpos + " número positivos. Su media es " + mediapos/numpos);
        System.out.println("Hay " + numneg + " número negativos. Su media es " + medianeg/numneg);
        System.out.println("Hay " + numcero + " ceros");
    }
}
