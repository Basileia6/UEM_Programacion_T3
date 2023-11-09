import java.util.Scanner;

public class t3_IF_ej09_numconsecutivos {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int primero = reader.nextInt();

        System.out.println("Introduzca otro número");
        int segundo = reader.nextInt();

        System.out.println("Introduzca otro número más");
        int tercero = reader.nextInt();

        if (segundo != primero + 1 ){
            System.out.println("Los números no son consecutivos");
        } else if (tercero != segundo + 1) {
            System.out.println("Los números no son consecutivos");
        } else {
            System.out.println("Los números son consecutivos");
        }
    }
}
