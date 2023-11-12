import java.util.Scanner;

public class t3_FOR_ej15_adivinacion {

    public static void main (String[] args){
         Scanner reader = new Scanner(System.in);

         int numaleatorio = (int) (Math.random() * 15) + 1;
         boolean acertado = false;
         int intentos = 0;

         for (int i = 1; i <= 10 && !acertado; i++){
             System.out.println("Escriba un número");
             int num = reader.nextInt();

             if (num == numaleatorio){
                 acertado = true;
                 intentos = i;
             }
         }

         if (acertado){
             System.out.println("Has adivinado el número en " + intentos + " intentos");
         } else {
             System.out.println("Lo siento, has agotado todos los intentos");
         }
    }
}
