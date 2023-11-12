import java.util.Scanner;

public class t3_FOR_ej05_potencia {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca la base");
        int base = reader.nextInt();

        System.out.println("Introduzca la potencia");
        int potencia = reader.nextInt();
        int result = 1;

        if (base < 0 || base > 5 || potencia < 0 || potencia > 5){
            System.out.println("Uno de los valores no está en el rango permitido 0-5");
        } else if (base == 0 && potencia == 00) {
            System.out.println("No se puede elevar 0 a la 0");
        } else if (potencia == 0){
            System.out.println("El resultado de cualquier base elevado a 0 es 1");
        } else {
            for (int i = 1; i <= potencia; i++) {
                result = result * base;
            }
            System.out.println("El resultado de "+ base +" elevado a " + potencia + " es " + result);
        }
    }
}
