import java.util.Scanner;

public class t3_FOR_ej09_diezsueldos {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        int suma = 0;
        int masmil = 0;

        for (int i = 0; i<10; i++){
            System.out.println("Introduzca un sueldo");
            int sueldo = reader.nextInt();

            if (sueldo > 1000){
                masmil++;
            }
            suma += sueldo;
        }

        System.out.println("La media de los sueldos introducidos es " + suma/10.0);
        System.out.println("La suma de los sueldos introducidos es " + suma);
        System.out.println("Hay " + masmil + " sueldos por encima de 1000€");
    }
}
