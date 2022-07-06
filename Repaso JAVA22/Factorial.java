import java.util.Scanner;

public class Factorial{

	public static void main(String[] args) {
		
	
		Scanner lee = new Scanner(System.in);

		//Factorial

		System.out.println("Dame un numero");
		int numero = lee.nextInt();

		int factorial = 1;
		for (int i = numero;i > 0;i--) {
			//System.out.println("Factorial: " + factorial);
			factorial *=i;
		}
		System.out.println("Factorial final: " + factorial);
	}
}