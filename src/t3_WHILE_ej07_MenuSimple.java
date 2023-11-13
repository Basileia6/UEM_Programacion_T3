import java.util.Scanner;

public class t3_WHILE_ej07_MenuSimple {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Bienvenido a la aplicación del menú");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Opción 4");
            System.out.println("5. Salir");
            System.out.println("Introduce la opción seleccionada");
            opcion = reader.nextInt();

            switch (opcion){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("La opción seleccionada es " + opcion);
                    break;
                default:
                    System.out.println("Opción no contemplada");
            }
        } while (opcion != 5);
    }
}