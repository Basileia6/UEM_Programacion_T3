import java.util.Scanner;

public class t3_FOR_ej11_cuadrado {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.println("¿De que tamaño es el cuadrado?");
        int tamanio = reader.nextInt();;

        for (int i = 0; i<tamanio; i++){
            System.out.println();
            for (int j = 0; j<tamanio; j++){
                System.out.print(" + ");
            }
        }
    }
}
