import java.util.Scanner;

public class Casos{
	
	public static void main(String[] args){
		Scanner lee = new Scanner(System.in);
	
		System.out.print("Dame el nombre");
		String nombre = lee.nextLine();
		
		
		System.out.print("Dame su clave");
		int clave = lee.nextInt();
		
		switch(nombre){
			
			case "Orco":
				switch(clave){
					case 12:
						System.out.print("El orco es feo");
					break;
					case 14:
						System.out.print("El orco da asco");
					break;
				}
			break;
			
			case "Sucio":
				switch(clave){
					case 12:
						System.out.print("Da asco");
					break;
					case 14:
					System.out.print("Da Es repulsivo");
					break;
				}
			break;
			
			default:
				System.out.print("Opcion incorrecta");
			break;
		
		}
	
	}
	
}