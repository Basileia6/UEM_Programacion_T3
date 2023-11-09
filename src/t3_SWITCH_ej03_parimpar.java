import java.util.Scanner;

public class t3_SWITCH_ej03_parimpar {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int num = reader.nextInt();

        String result = "";

        switch (num % 2) {
            case 0:
                result = "par";
                break;
            default:
                result = "impar";
        }
        System.out.println("El número introducido es "+result);
    }
}
