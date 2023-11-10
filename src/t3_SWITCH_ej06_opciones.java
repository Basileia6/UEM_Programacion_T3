
import java.util.Scanner;


public class t3_SWITCH_ej06_opciones
{
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);
		
		System.out.println("Escribe un número del 1 al 4");
		int num = reader.nextInt();
		
		String result = "";
		
		switch (num){
		    case 1:
		        result = "El 1 es un soldado haciendo la instrucción";
		        break;
		    case 2:
		        result = "El 2 es un patito que está tomando el sol";
		        break;
		    case 3:
		        result = "El 3 es una serpiente que no para de bailar";
		        break;
		    case 4:
		        result = "El 4 es una sillita que invita a descansar";
		        break;
		    default: 
		        result = "Paso a paso que solo es hasta el 4";
		            
		}
		
		System.out.println(result);
	}
}
