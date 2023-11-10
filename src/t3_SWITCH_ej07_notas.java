
import java.util.Scanner;


public class t3_SWITCH_ej07_notas
{
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);
		
		System.out.println("Escribe un número del 1 al 5");
		int num = reader.nextInt();
		
		String result = "";
		
		switch (num){
		    case 1:
		        result = "Suspenso";
		        break;
		    case 2:
		        result = "Aprobado";
		        break;
		    case 3:
		        result = "Notable";
		        break;
		    case 4:
		        result = "Sobresaliente";
		        break;
		    case 5:
		        result = "Matrícula de honor";
		        break;
		    default: 
		        result = "El número indicado no tiene nota asociada";
		            
		}
		
		System.out.println(result); 
	}
}
