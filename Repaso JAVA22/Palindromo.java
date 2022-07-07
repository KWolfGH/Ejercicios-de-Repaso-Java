import java.util.Scanner;

public class Palindromo{

	public static void main(String[] args) {
	
		Scanner lee = new Scanner(System.in);		

		System.out.println("Dime un palindromo");
		String frase = lee.nextLine();

		int primero = 0;
		int ultimo = frase.length()-1;
		boolean diferente = false;		
		
		while ((primero<ultimo) && (!diferente)){
			
			if (frase.charAt(primero)==frase.charAt(ultimo)){				
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
