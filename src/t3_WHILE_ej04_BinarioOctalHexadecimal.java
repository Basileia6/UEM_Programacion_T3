import java.util.Scanner;

public class t3_WHILE_ej04_BinarioOctalHexadecimal {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.println("Escriba un número");
        int num = reader.nextInt();
        int auxbucle = num;
        int auxmod;
        String result = "";

        //Conversion a binario
        while (auxbucle > 1){
            auxmod = auxbucle % 2;
            result = auxmod + result;
            auxbucle = auxbucle / 2;
        }
        result = auxbucle + result;

        //Rellenamos con ceros a la izquierda para dejarlo siempre en multiplo de 4
        do {
            result = "0" + result;
        } while (result.length() % 4 != 0);

        System.out.println("Binario: " + result);

        //Conversion a octal, reiniciamos las variables que son necesarias
        auxbucle = num;
        result = "";
        while (auxbucle > 7){
            auxmod = auxbucle % 8;
            result = auxmod + result;
            auxbucle = auxbucle / 8;
        }
        result = auxbucle + result;

        System.out.println("Octal: " + result);

        //Conversion a hexadecimal, reiniciamos las variables que son necesarias
        char hex;
        auxbucle = num;
        result = "";
        while (auxbucle > 15){
            auxmod = auxbucle % 16;
            //Como en hexadecimal hay letras comprobamos si el resto es mayor que 10 y lo convertimos a la letra correspondiente
            switch (auxmod){
                case 10: hex = 'A'; break;
                case 11: hex = 'B'; break;
                case 12: hex = 'C'; break;
                case 13: hex = 'D'; break;
                case 14: hex = 'E'; break;
                case 15: hex = 'F'; break;
                default: hex = String.valueOf(auxmod).charAt(0);
            }
            result = hex + result;
            auxbucle = auxbucle / 16;
        }
        //Lo repetimos después del bucle por que el cociente de la última división también puede ser mayor que 10
        switch (auxbucle){
            case 10: hex = 'A'; break;
            case 11: hex = 'B'; break;
            case 12: hex = 'C'; break;
            case 13: hex = 'D'; break;
            case 14: hex = 'E'; break;
            case 15: hex = 'F'; break;
            default: hex = String.valueOf(auxbucle).charAt(0);
        }
        result = hex + result;

        System.out.println("Hexadecimal: " + result);
    }
}
