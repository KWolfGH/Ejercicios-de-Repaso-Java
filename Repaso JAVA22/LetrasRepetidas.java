import java.util.Scanner;

public class LetrasRepetidas{

	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);

		System.out.println("Dame una cadena: ");
		String cadena = lee.nextLine();
		char[] repetidas = cadena.toCharArray();

		int contador=0;

		for (int i = 0; i < repetidas.length; i++) {
			 char letra = repetidas[i];
			 for (int j = 0; j < repetidas.length; j++) {
			 	if (repetidas[j] == letra) {
			 		contador++;
			 	}//if
			 }//for
			 System.out.println(letra + " : " + contador);
			 contador = 0;
		}//for
	}//main
}//class