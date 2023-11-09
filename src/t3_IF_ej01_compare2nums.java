import java.util.Scanner;

public class t3_IF_ej01_compare2nums {

    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca un número ");
        int num1 = reader.nextInt();

        System.out.println("Introduzca otro número ");
        int num2 = reader.nextInt();

        if (num1 > num2){
            System.out.println("El número 1 es mayor que el número 2 ");
        } else if (num1 < num2) {
            System.out.println("El número 1 es menor que el número 2 ");
        } else {
            System.out.println("El número 1 y número 2 son iguales");
        }
    }
}
