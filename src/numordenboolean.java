import java.util.Scanner;

public class numordenboolean {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int primero = reader.nextInt();

        System.out.println("Introduzca otro número");
        int segundo = reader.nextInt();

        System.out.println("Introduzca otro número más");
        int tercero = reader.nextInt();

        System.out.println("¿Los números se ordenarán de forma ascendente?");
        boolean asc = reader.nextBoolean();

        int aux = 0;

        if (primero > segundo){
            aux = primero;
            primero = segundo;
            segundo = aux;
            if (tercero < segundo){
                aux = tercero;
                tercero = segundo;
                segundo = aux;
                if (primero > segundo){
                    aux = primero;
                    primero = segundo;
                    segundo = aux;
                }
            }
        }
        else if (segundo > tercero) {
            aux = segundo;
            segundo = tercero;
            tercero = aux;
            if (primero > segundo){
                aux = primero;
                primero = segundo;
                segundo = aux;
            }
        }

        if(asc){
            System.out.println(primero + " " + segundo + " " + tercero);
        } else {
            System.out.println(tercero + " " + segundo + " " + primero);
        }
    }
}
