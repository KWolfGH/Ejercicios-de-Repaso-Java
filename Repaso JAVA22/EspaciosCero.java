import java.util.Scanner;

public class EspaciosCero{

	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);

		System.out.println("Dime una frase:");
		String frase = lee.nextLine();
		String cero = "";
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != ' ') {
				cero += frase.charAt(i);
			}//if
		}//for
		System.out.println("\t****Le quite los espacios por ti****\n" + cero);		
	}//main
}//class
