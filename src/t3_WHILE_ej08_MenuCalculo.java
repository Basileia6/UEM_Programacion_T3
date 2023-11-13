import java.util.Scanner;

public class t3_WHILE_ej08_MenuCalculo {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Bienvenido a la aplicación de cáculos");

            System.out.println("Introduzca el primer operando");
            int num1 = reader.nextInt();
            System.out.println("Introduzca el segundo operando");
            int num2 = reader.nextInt();

            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Módulo");
            System.out.println("6. Salir");
            System.out.println("Selecciona la operacion que quieres realizar");
            opcion = reader.nextInt();
            double result = 0;

            switch (opcion){
                case 1:
                    System.out.println("El resultado de la operación es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de la operación es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado de la operación es " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("El resultado de la operación es " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("El resultado de la operación es " + (num1 % num2));
                    break;
                case 6:
                    System.out.println("Ha seleccionado salir");
                    break;
                default:
                    System.out.println("Opción no contemplada");
            }
        } while (opcion != 6);
    }
}
