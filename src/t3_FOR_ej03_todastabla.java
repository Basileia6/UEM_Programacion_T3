
public class t3_FOR_ej03_todastabla {

	public static void main(String[] args) {
		
		System.out.println("Tablas de multiplicar");
		
		for (int j=0;j<=10;j++){
		    System.out.println("*** La tabla del " + j + " ***");
		    for (int i=0;i<=10;i++){
		        System.out.println(j + " x " + i + " = " + i*j);
		    }
		}
		
	}
}
