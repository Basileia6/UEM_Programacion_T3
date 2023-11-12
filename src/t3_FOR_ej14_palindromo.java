import java.util.Scanner;

public class t3_FOR_ej14_palindromo {

    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Escriba una palabra");
        String palabra = reader.next();

        palabra = palabra.toLowerCase();
        palabra = palabra.replaceAll("á","a");
        palabra = palabra.replaceAll("é","e");
        palabra = palabra.replaceAll("í","i");
        palabra = palabra.replaceAll("ó","o");
        palabra = palabra.replaceAll("ú","u");

        String palabrainversa = "";

        for (int i = palabra.length() -1; i >= 0; i--){
            palabrainversa = palabrainversa + palabra.charAt(i);
        }

        if (palabra.equals(palabrainversa)) {
            System.out.println("La palabra " + palabra + " es capicua");
        }
        else {
            System.out.println("La palabra " + palabra + " no es capicua");
        }
    }
}
