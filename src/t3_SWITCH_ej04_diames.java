import java.util.Scanner;

public class t3_SWITCH_ej04_diames {

    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca un mes con números");
        int mes = reader.nextInt();

        int result = 0;

        switch (mes){
            case 1:
                result = 31;
                break;
            case 2:
                result = 28;
                break;
            case 3:
                result = 31;
                break;
            case 4:
                result = 30;
                break;
            case 5:
                result = 31;
                break;
            case 6:
                result = 30;
                break;
            case 7:
                result = 31;
                break;
            case 8:
                result = 31;
                break;
            case 9:
                result = 30;
                break;
            case 10:
                result = 31;
                break;
            case 11:
                result = 30;
                break;
            case 12:
                result = 31;
                break;
            default:
                System.out.println("El mes indicado no existe");
        }
        if (result != 0){
            System.out.println("El mes " + mes + " tiene " + result + " días");
        }
    }
}
