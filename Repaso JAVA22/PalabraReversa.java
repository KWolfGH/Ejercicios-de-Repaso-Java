import java.util.Scanner;

public class PalabraReversa{
	
	public static void main(String[] args){

	Scanner lee = new Scanner(System.in);

	System.out.println("Dame una frase:");
	String frase = lee.nextLine();
	String reversa = "";

	for (int i = frase.length()-1; i >= 0 ; i--) {
		reversa += (frase.charAt(i));
	}//for

	System.out.println("Palabra Volteada : " + reversa);

	}//main
}//class