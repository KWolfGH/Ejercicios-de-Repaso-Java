import java.util.*;

public class CaraRep{
	
	public static void main(String[] args){

		Scanner lee = new Scanner(System.in);

		System.out.println("Dame una frase:");
		String frase = lee.nextLine();

		for(int i = 0; i < frase.length(); i++){

			boolean repetido = false;

			for(int j = 0; j < frase.length(); j++){
				if(frase.charAt(i) == frase.charAt(j) && i != j){
					repetido = true;
				}//if
			}//for

			if(!repetido){
				System.out.println(frase.charAt(i) + " No se repite");
			}//if

		}//for

	}//main
}//class