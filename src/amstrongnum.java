import java.util.Scanner;

public class amstrongnum {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca un número de 3 dígitos");
        String num = reader.next();

        int numint = Integer.parseInt(num);

        if (numint < 100 || numint > 999 ){
            System.out.println("El número no tiene 3 dígitos");
        }
        else {
            int dig1 = Integer.parseInt(String.valueOf(num.charAt(0)));
            int dig2 = Integer.parseInt(String.valueOf(num.charAt(1)));
            int dig3 = Integer.parseInt(String.valueOf(num.charAt(2)));

            //System.out.println(dig1);
            //System.out.println(dig2);
            //System.out.println(dig3);

            double elevado1 = Math.pow((int) dig1,3);
            double elevado2 = Math.pow((int) dig2,3);
            double elevado3 = Math.pow((int) dig3,3);

            //System.out.println(elevado1);
            //System.out.println(elevado2);
            //System.out.println(elevado3);

            if (numint == elevado1+elevado2+elevado3) {
                System.out.println("Es un número Armstrong");
            } else {
                System.out.println("No es un número Armstrong");
            }
        }
    }
}
