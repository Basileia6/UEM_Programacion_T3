import java.util.Scanner;

public class Multiplo {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int num1 = reader.nextInt();
        int resto = num1 % 20;

        if (resto == 0 ){
            if (num1 > -100 && num1 <100){
                System.out.println("Es múltiplo de 20 y está entre -100 y 100");
            } else {
                System.out.println("Es múltiplo de 20 y no está entre -100 y 100");
            }
        } else{
            if (num1 > -100 && num1 <100){
                System.out.println("No es múltiplo de 20 y está entre -100 y 100");
            } else {
                System.out.println("No es múltiplo de 20 y no está entre -100 y 100");
            }
        }
    }
}
