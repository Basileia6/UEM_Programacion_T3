import java.util.Scanner;

public class t3_SWITCH_ej01_diasemana {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca el número del día de la semana");
        int dia = reader.nextInt();

        String diatxt = "";

        switch (dia) {
            case 1:
                diatxt = "Lunes";
                break;
            case 2:
                diatxt = "Martes";
                break;
            case 3:
                diatxt = "Miercoles";
                break;
            case 4:
                diatxt = "Jueves";
                break;
            case 5:
                diatxt = "Viernes";
                break;
            case 6:
                diatxt = "Sábado";
                break;
            case 7:
                diatxt = "Domingo";
                break;
            default:
                diatxt = "El número no corresponde con un día de la semana";
        }
        System.out.println(diatxt);
    }
}
