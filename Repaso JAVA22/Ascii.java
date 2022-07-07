import java.util.Scanner;

public class Ascii{
	
	public static void main(String[] args){

	Scanner lee = new Scanner(System.in);

		System.out.println("Dame una frase:");
		String frase = lee.nextLine();

		for (int i=0;i<frase.length();i++){
  			System.out.println(frase.charAt(i) + " = " + (int)frase.charAt(i));
		}//for

		System.out.println("\nLa frase mide "+frase.length()+" caraceres");

		System.out.println("\nLa frase tiene estos caraceres:");

		for (int i = 0; i < frase.length(); i++) {
			System.out.println(frase.charAt(i));
		}
		

	}//main
}//class