
import java.util.Scanner;

public class t3_SWITCH_ej10_producto
{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce un código");
		
		String codigo = reader.next();
		
		String descripcion;
		double precio = 0.0;

        switch (codigo) {
            case "Cod001":
                descripcion = "Ratón inalámbrico Logitech";
                precio = 12.95;
                break;
            case "Cod002":
                descripcion = "Teclado inalámbrico Logitech";
                precio = 23.50;
                break;
            case "Cod003":
                descripcion = "SD 128GB";
                precio = 20.00;
                break;
            default:
                descripcion = "El código introducido no pertenece a ningún producto";
        }
        System.out.println(descripcion);
        if (precio != 0.0){
            System.out.println(precio);
        }
	}
}
