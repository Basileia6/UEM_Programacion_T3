import java.util.Scanner;

public class t3_WHILE_ej03_MayorNumero {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        short mayor = 0;
        short num;

        do{
            num = (short) (Math.random() * 101);
            System.out.println(num);
            if (num > mayor) {
                mayor = num;
            }
        } while (num != 0);

        System.out.println("El mayor número que ha salido es " + mayor);
    }
}
