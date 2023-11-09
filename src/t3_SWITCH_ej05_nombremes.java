import java.util.Scanner;

public class t3_SWITCH_ej05_nombremes {

    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca un mes con números");
        int mes = reader.nextInt();

        String result = "";

        switch (mes){
            case 1:
                result = "Enero";
                break;
            case 2:
                result = "Febrero";
                break;
            case 3:
                result = "Marzo";
                break;
            case 4:
                result = "Abril";
                break;
            case 5:
                result = "Mayo";
                break;
            case 6:
                result = "Junio";
                break;
            case 7:
                result = "Julio";
                break;
            case 8:
                result = "Agosto";
                break;
            case 9:
                result = "Septiembre";
                break;
            case 10:
                result = "Octubre";
                break;
            case 11:
                result = "Noviembre";
                break;
            case 12:
                result = "Diciembre";
                break;
            default:
                System.out.println("El mes indicado no existe");
        }
        if (result != ""){
            System.out.println("El mes " + mes + " es " + result);
        }
    }
}
