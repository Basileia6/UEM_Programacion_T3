import java.util.Scanner;

public class t3_WHILE_ej01_SumarPositivos {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        int num;
        int suma = 0;

        do{
            System.out.println("Escriba un número");
            num = reader.nextInt();
            if (num > 0) {
                suma += num;
            }
        } while (num != 0);

        System.out.println("La suma de los números positivos es " + suma);
    }
}
