import java.util.Scanner;

public class t3_WHILE_ej06_AdivinaRecord {

    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        String seguir;

        do {
            int numaleatorio = (int) (Math.random() * 21);
            int num;
            int cont = 1;
            boolean acertado = false;

            do {
                System.out.println("Indique un número");
                num = reader.nextInt();
                if (num == numaleatorio) {
                    acertado = true;
                    System.out.println("Enhorabuena, has acertado el número en " + cont + " intentos.");
                } else {
                    cont++;
                    System.out.println("Lo siento, intentalo de nuevo");
                }
            } while (!acertado);

            System.out.println("Quieres volver a jugar (S/N)");
            seguir = reader.next();
        } while (seguir.equals("S"));
    }
}
