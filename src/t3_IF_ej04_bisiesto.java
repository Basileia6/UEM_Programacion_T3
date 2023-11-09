import java.util.Scanner;

public class t3_IF_ej04_bisiesto {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca un año");
        int num1 = reader.nextInt();
        int resto = num1 % 4;

        if (resto == 0 ){
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
