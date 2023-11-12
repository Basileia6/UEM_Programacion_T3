import java.util.Scanner;

public class t3_FOR_ej04_rangotabla {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca el primer valor del rango de tablas de multiplicar");
        int ini = reader.nextInt();

        System.out.println("Introduzca el último valor del rango de tablas de multiplicar");
        int fin = reader.nextInt();

        for (int j=ini;j<=fin;j++){
            System.out.println("*** La tabla del " + j + " ***");
            for (int i=0;i<=10;i++){
                System.out.println(j + " x " + i + " = " + i*j);
            }
        }

    }
}
