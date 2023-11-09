import java.util.Scanner;

public class t3_IF_ej10_paroimpar {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int num = reader.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + 1);
        } else {
            System.out.println(num - 1);
        }
    }

}
