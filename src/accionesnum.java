import java.util.Scanner;

public class accionesnum {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int num = reader.nextInt();

        int result = 0;

        if(num % 2 == 0){
            result = num + 2;
            System.out.println("El número es par y por tanto se le suma 2: " + result);
        } else if(num % 3 == 0) {
            result = num + 3;
            System.out.println("El número es múltiplo de 3 y por tanto se le suma 3: " + result);
        } else if (num % 5 == 0) {
            result = num + 5;
            System.out.println("El número es múltiplo de 5 y por tanto se le suma 5: " + result);
        } else {
            result = num + 1;
            System.out.println("El número no cumple ningún criterio y por lo tanto se le suma 1: " + result);
        }
    }
}
