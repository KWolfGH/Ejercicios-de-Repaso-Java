import java.util.Scanner;

public class SumaPalabras{
	
	public static void main(String[] args){

	Scanner lee = new Scanner(System.in);

	System.out.println("Dime una frase:");
	String frase1 = lee.nextLine();

	System.out.println("Dime otra frase:");
	String frase2 = lee.nextLine();

	String fraseSumada = "";
	fraseSumada += frase1 + frase2;

	System.out.println(fraseSumada);

	}//main

}//class