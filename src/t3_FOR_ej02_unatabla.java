
import java.util.Scanner;

public class t3_FOR_ej02_unatabla {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce el número para obtener su tabla de multiplicar");
		int num = reader.nextInt();
		
		for (int i=0;i<=10;i++){
		    System.out.println(num + " x " + i + " = " + i*num);
		}
		
	}
}
