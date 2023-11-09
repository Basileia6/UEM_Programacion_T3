import java.util.Scanner;

public class t3_IF_ej14_fechadiasiguiente {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] meses = new int[]{30,28,30,30,30,30,30,30,30,30,30,30};

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
            System.out.println("Fecha introducida:" + dia + "/" + mes + "/" + anio );
            if ((dia < 30 && mes != 2) || (dia < 28 && mes == 2)){
                dia++;
            } else{
                dia = 1;
                if (mes !=12) {
                    mes++;
                }else{
                    mes=1;
                    anio++;
                }
            }
            System.out.println("Fecha día siguiente:" + dia + "/" + mes + "/" + anio );
        }
    }
}
