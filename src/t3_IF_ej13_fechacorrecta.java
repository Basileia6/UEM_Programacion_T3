import java.util.ArrayList;
import java.util.Scanner;

public class t3_IF_ej13_fechacorrecta {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] meses = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("Introduzca un día");
        int dia = reader.nextInt();

        System.out.println("Introduzca un mes");
        int mes = reader.nextInt();

        System.out.println("Introduzca un año");
        int anio = reader.nextInt();

        if (mes < 1 || mes > 12){
            System.out.println("La fecha no es válida, el mes no existe");
        }
        else if (dia < 1 || dia > meses[mes-1]) {
            System.out.println("La fecha no es válida, el día no existe para el mes dado");
        } else if (anio < 1000 || anio > 3000){
            System.out.println("La fecha no es válida, el año debe estar entre el año 1000 y el 3000");
        } else{
            System.out.println(dia + "/" + mes + "/" + anio );
        }
    }
}
