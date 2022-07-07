import java.util.Scanner;

public class MinMayus{

	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);

		System.out.println("Dime una frase:");
		String frase = lee.nextLine();

		frase = frase.toUpperCase();

		System.out.println(frase.toUpperCase());
		//System.out.println(frase + " en minúsculas: " + frase.toLowerCase());
	}//main

}//class