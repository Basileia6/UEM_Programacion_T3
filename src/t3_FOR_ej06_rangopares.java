import java.util.Scanner;

public class t3_FOR_ej06_rangopares {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca el primer valor");
        int ini = reader.nextInt();

        System.out.println("Introduzca el último valor");
        int fin = reader.nextInt();

        for (int i = ini; i <= fin; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
