import java.util.Scanner;

public class t3_WHILE_ej02_MinimoComunMultiplo {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        int num1;
        int num2;
        int minimomultiplo = 0;
        int multiplicador = 1;

        System.out.println("Escriba un número");
        num1 = reader.nextInt();

        System.out.println("Escriba un número");
        num2 = reader.nextInt();

        do{
            minimomultiplo = num1 * multiplicador;
            multiplicador++;
            System.out.println(minimomultiplo);
        } while (minimomultiplo % num2 != 0);

        System.out.println("El mínimo común múltiplo es " + minimomultiplo);
    }
}
