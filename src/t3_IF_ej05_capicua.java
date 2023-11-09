import java.util.Scanner;

public class t3_IF_ej05_capicua {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca un número de 4 dígitos");
        String num = reader.next();

        StringBuilder num1 = new StringBuilder(num);
        String reverso = String.valueOf(num1.reverse());

        int num3 = Integer.parseInt(String.valueOf(num1));

        if (num3 < 1000 || num3 > 9999 ){
            System.out.println("El número no tiene 4 dígitos");
        }
        else {
            if (num.equals(reverso)) {
                System.out.println("El número es capicúa");
            } else {
                System.out.println("El número no es capicúa");
            }
        }
    }
}
