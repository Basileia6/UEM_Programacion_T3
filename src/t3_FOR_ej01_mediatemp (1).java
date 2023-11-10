
import java.util.Scanner;

public class t3_FOR_ej01_mediatemp {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce el número de temperaturas a leer");
		int num = reader.nextInt();
		double sumatemp = 0.0;
		
		
		for (int i=1;i<=num;i++){
		    System.out.println("Introduzca una temperatura");
		    sumatemp += reader.nextDouble();
		}
		
		double result = sumatemp/num;
		
		System.out.println("La media de las temperaturas introducidas es: "+result);
	}
}
