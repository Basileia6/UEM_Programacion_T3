
import java.util.Scanner;

public class t3_SWITCH_ej09_estaciones
{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce un número de mes");
		int mes = reader.nextInt();
		
		String estacion;

        switch (mes) {
            case 12:
            case 1:
            case 2:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
            default:
                estacion = "Otoño";
        }
        System.out.println("La estación del año es: " + estacion);
	}
}
