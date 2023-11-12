import java.util.Scanner;

public class t3_FOR_ej04_lanzadados {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("¿Cuántas veces desea tirar el dado?");
        int ini = reader.nextInt();

        if (ini < 0) {
            ini = 100;
        }

        for (int i = 0; i < ini; i++) {
            int numrd = (int) (Math.random() * 6) + 1;
            System.out.println("Ha salido " + numrd);
        }
    }
}
