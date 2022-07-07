import java.util.Scanner;

public class PalindromoV2{

	public static void main(String[] args) {
	
		Scanner lee = new Scanner(System.in);		

		System.out.println("Dime un palindromo");
		String frase = lee.nextLine();		
		
		String palindromo = "";

		//Quitamos espacios, puntos y comas solamente
		for (int i = 0; i < frase.length(); i++) {
			if ( (frase.charAt(i) != ' ') && (frase.charAt(i) != '.') && (frase.charAt(i) != ',') ) {
				palindromo += frase.charAt(i);
			}//if
		}//for

		int primero = 0;
		int ultimo = palindromo.length()-1;
		boolean diferente = false;
		
		//comparamos si la cadena es un palíndromo o no		
		while ((primero<ultimo) && (!diferente)){
			
			if (palindromo.charAt(primero)==palindromo.charAt(ultimo)){				
				primero++;
				ultimo--;
			}else {
				diferente = true;
			}//if-else	
		}//while
		
		if (!diferente){
			System.out.println(frase + " es un PALINDROMO");
		}else{
			System.out.println(frase + " NO es un palindromo");
		}//if-else
	}//main
}//class