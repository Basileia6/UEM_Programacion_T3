import java.util.Scanner;

public class t3_WHILE_ej09_MenuBases {
    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Bienvenido a la aplicación de cambios de base");
        int opcion = 0;

        do {
            System.out.println("Introduce el número que quieres cambiar de base");
            int num = reader.nextInt();

            while (num <= 0){
                System.out.println("No válido, introduce otro");
                num = reader.nextInt();
            }

            System.out.println("1. Pasar a base 2");
            System.out.println("2. Pasar a base 8");
            System.out.println("3. Pasar a base 16");
            System.out.println("4. Salir");
            System.out.println("Selecciona la base a la que quieres pasar");
            opcion = reader.nextInt();

            int auxbucle = num;
            int auxmod;
            String result = "";

            if (opcion > 4){
                System.out.println("Opción no válida");
            } else if (opcion == 1) {
                //Conversion a binario
                while (auxbucle > 1) {
                    auxmod = auxbucle % 2;
                    result = auxmod + result;
                    auxbucle = auxbucle / 2;
                }
                result = auxbucle + result;

                //Rellenamos con ceros a la izquierda para dejarlo siempre en multiplo de 4
                do {
                    result = "0" + result;
                } while (result.length() % 4 != 0);

                System.out.println("El número "+ num +" en base10 es igual que "+ result +" en base2");
            } else if (opcion == 2) {
                //Conversion a octal, reiniciamos las variables que son necesarias
                auxbucle = num;
                result = "";
                while (auxbucle > 7) {
                    auxmod = auxbucle % 8;
                    result = auxmod + result;
                    auxbucle = auxbucle / 8;
                }
                result = auxbucle + result;

                System.out.println("El número "+ num +" en base10 es igual que "+ result +" en base8");
            } else if (opcion == 3) {
                //Conversion a hexadecimal, reiniciamos las variables que son necesarias
                char hex;
                auxbucle = num;
                result = "";
                while (auxbucle > 15) {
                    auxmod = auxbucle % 16;
                    //Como en hexadecimal hay letras comprobamos si el resto es mayor que 10 y lo convertimos a la letra correspondiente
                    switch (auxmod) {
                        case 10:
                            hex = 'A';
                            break;
                        case 11:
                            hex = 'B';
                            break;
                        case 12:
                            hex = 'C';
                            break;
                        case 13:
                            hex = 'D';
                            break;
                        case 14:
                            hex = 'E';
                            break;
                        case 15:
                            hex = 'F';
                            break;
                        default:
                            hex = String.valueOf(auxmod).charAt(0);
                    }
                    result = hex + result;
                    auxbucle = auxbucle / 16;
                }
                //Lo repetimos después del bucle por que el cociente de la última división también puede ser mayor que 10
                switch (auxbucle) {
                    case 10:
                        hex = 'A';
                        break;
                    case 11:
                        hex = 'B';
                        break;
                    case 12:
                        hex = 'C';
                        break;
                    case 13:
                        hex = 'D';
                        break;
                    case 14:
                        hex = 'E';
                        break;
                    case 15:
                        hex = 'F';
                        break;
                    default:
                        hex = String.valueOf(auxbucle).charAt(0);
                }
                result = hex + result;

                System.out.println("Hexadecimal: " + result);
            }
        } while (opcion != 4);
    }
}
