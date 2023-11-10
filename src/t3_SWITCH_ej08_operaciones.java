
import java.util.Scanner;


public class t3_SWITCH_ej08_operaciones
{
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);
		
		System.out.println("Escribe un operador (*,+,/,-)");
		char operador = reader.next().charAt(0);
		
		System.out.println("Escribe el primer operando");
		double operando1 = reader.nextInt();
		
		System.out.println("Escribe el segundo operando");
		double operando2 = reader.nextInt();
		
		String result = "Se ha realizado la siguiente operación ";
		double calculo = 0.0;
		
		switch (operador){
		    case '*':
		        calculo = operando1 * operando2;
		        result += operando1 + " * " + operando2 + " = " + calculo;
		        break;
		    case '+':
		        calculo = operando1 + operando2;
		        result += operando1 + " + " + operando2 + " = " + calculo;
		        break;
		    case '-':
		        calculo = operando1 - operando2;
		        result += operando1 + " - " + operando2 + " = " + calculo;
		        break;
		    case '/':
		        if (operando2==0){
		            result = "Division por 0";
		        } else {
		            calculo = operando1 / operando2;
		            result += operando1 + " / " + operando2 + " = " + calculo;
		        }
		        break;
		    default: 
		        result = "El operador indicado no es válido";
		            
		}
		
		System.out.println(result); 
	}
}
