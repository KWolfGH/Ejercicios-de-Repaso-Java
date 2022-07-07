import java.util.Scanner;

public class VocalConsonante{
	
	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);

		System.out.println("Dime una frase:");
		String frase = lee.nextLine(), espacio0 = "";
		int vocal = 0, consonante = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != ' ') {
				espacio0 += frase.charAt(i);

				if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i'
                    || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
					vocal+=1;
				} else {
				consonante++;
			}//if-else
			}//if
		}//for
		System.out.println("'"+ frase + "'" + " tiene " + vocal + " vocales y " + consonante + " consonantes");
	}//main

}//class