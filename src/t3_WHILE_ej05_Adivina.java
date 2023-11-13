import java.util.Scanner;

public class t3_WHILE_ej05_Adivina {

    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);

        int numaleatorio = (int) (Math.random() * 21);
        int num;
        boolean acertado = false;

        do {
            System.out.println("Indique un número");
            num = reader.nextInt();
            if (num == numaleatorio){
                acertado = true;
                System.out.println("Enhorabuena, has acertado el número en " + num + " intentos.");
            }
            else {
                num++;
                System.out.println("Lo siento, intentalo de nuevo");
            }
        } while (!acertado);
    }
}
