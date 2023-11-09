import java.util.Scanner;

public class sumatres {

    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca un número positivo ");
        int num1 = reader.nextInt();

        System.out.println("Introduzca otro número positivo ");
        int num2 = reader.nextInt();

        System.out.println("Introduzca un tercer número positivo ");
        int num3 = reader.nextInt();

        if (num3 == num1 + num2){
            System.out.println(num3 + " = " + num1 + " + " + num2);
        } else if (num2== num1 + num3) {
            System.out.println(num2 + " = " + num1 + " + " + num3);
        } else if (num1 == num2 + num3) {
            System.out.println(num1 + " = " + num2 + " + " + num3);
        } else{
            System.out.println("Ninguno es suma de los otros dos ");
        }
    }
}
