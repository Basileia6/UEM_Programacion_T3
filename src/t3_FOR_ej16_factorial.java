import java.util.Scanner;

public class t3_FOR_ej16_factorial {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Escribe un número del 0 al 20");
        int num = reader.nextInt();

        if (num < 0 || num > 20){
            System.out.println("El número no es válido");
        } else if (num == 0 || num == 1){
            System.out.println("El factorial del número indicado es 1");
        } else {
            long factorial = 1;
            for (int i = num; i>0; i--){
                factorial = factorial*i;
            }
            System.out.println("El factorial del número indicado es: " + factorial);
        }
    }
}
