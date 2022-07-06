import java.util.Scanner;

public class Repaso{

	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);

		System.out.println("Dimensión del arreglo");
		int tamanio=lee.nextInt();

		int[] enteros = new int[tamanio];
		System.out.println("Introduce "+tamanio+" numeros");

		for (int i=0;i<enteros.length;i++) {
			enteros[i]=lee.nextInt();
		}

		for (int i=0;i<enteros.length;i++) {
			System.out.print(enteros[i]);
		}

		int mayor = enteros[0];

		for (int i=0;i<enteros.length;i++) {
			if (enteros[i]>mayor) {
				mayor=enteros[i];
			}
		}
		System.out.println("\nEl elemento mayor es: "+mayor);
	}
}