import java.util.Scanner;

public class t3_FOR_ej13_palabrainversa {

    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Escriba una palabra");
        String palabra = reader.next();

        String palabrainversa = "";

        for (int i = palabra.length() -1; i >= 0; i--){
            palabrainversa = palabrainversa + palabra.charAt(i);
        }

        System.out.println(palabrainversa);

    }
}
