import java.util.Scanner;

public class t3_FOR_ej12_cuadradobis {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.println("¿De que tamaño es el cuadrado?");
        int tamanio = reader.nextInt();

        for (int i = 1; i<=tamanio; i++){
            System.out.println();
            for (int j = 1; j<=tamanio; j++){
                if (i==1 || i==tamanio || j == 1 || j == tamanio){
                    System.out.print(" - ");
                } else {
                    System.out.print(" + ");
                }
            }
        }
    }
}
