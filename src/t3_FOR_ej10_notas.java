import java.util.Scanner;

public class t3_FOR_ej10_notas {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;

        for (int i = 0; i<6; i++){
            System.out.println("Introduzca una nota");
            int nota = reader.nextInt();

            switch (nota){
                case 0:
                case 1:
                case 2:
                case 3:
                    suspensos++;
                    break;
                case 4:
                    condicionados++;
                    break;
                default:
                    aprobados++;
            }
        }

        System.out.println("Hay " + suspensos + " suspensos");
        System.out.println("Hay " + condicionados + " condicionados");
        System.out.println("Hay " + aprobados + " aprobados");
    }
}
