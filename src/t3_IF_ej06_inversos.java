import java.util.Scanner;

public class t3_IF_ej06_inversos {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca un número");
        double num1 = reader.nextInt();

        System.out.println("Introduzca otro número");
        double num2 = reader.nextInt();

        System.out.println("Introduzca otro número más");
        double num3 = reader.nextInt();

        double inv1 = 0.0;
        double inv2 = 0.0;
        double inv3 = 0.0;


        if (Math.abs(num1) > 100 || Math.abs(num2) > 100 || Math.abs(num3) > 100 ){
            System.out.println("Alguno de los números introducidos no está entre -100 y 100");
        }
        else {
            if (num1 != 0){
                inv1 = 1 / num1;
            }
            if (num2 != 0){
                inv2 = 1 / num2;
            }
            if (num3 != 0){
                inv3 = 1 / num3;
            }

            System.out.println(inv1 + inv2 + inv3);
        }
    }
}
