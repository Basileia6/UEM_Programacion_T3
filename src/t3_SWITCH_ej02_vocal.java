import java.util.Scanner;

public class t3_SWITCH_ej02_vocal {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca un caracter");
        String caracter = reader.next();

        if (caracter.length()>1){
            System.out.println("Se la introducido más de un caracter");
        }
        else{
            String result = "";

            switch (caracter.toLowerCase()) {
                case "a":
                    result = "vocal";
                    break;
                case "e":
                    result = "vocal";
                    break;
                case "i":
                    result = "vocal";
                    break;
                case "o":
                    result = "vocal";
                    break;
                case "u":
                    result = "vocal";
                    break;
                default:
                    result = "consonante";
            }
            System.out.println("El caracter introducido es una "+ result);

        }
    }
}
