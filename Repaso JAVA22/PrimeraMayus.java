import java.util.*;

public class PrimeraMayus{
	
	public static void main(String[] args){	
		Scanner lee = new Scanner(System.in);

		System.out.println("Dame unacadena:");
		String frase = lee.nextLine();

		char[] primMayu = frase.toCharArray();

		primMayu[0] = Character.toUpperCase(primMayu[0]);

		for (int i=0; i<primMayu.length; i++) {
			System.out.print(primMayu[i]);	
		}//for
	}//main
}//class