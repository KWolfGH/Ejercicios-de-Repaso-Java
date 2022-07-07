//Programa 17: Contar el número de vocales, consonantes, números y no-alfanuméricos de una cadena dada
//Martín Galván Vigueraz

import java.util.*;

public class Frase{
	
	public static void main(String[] args){
		
		Scanner lee = new Scanner(System.in);
		
		int vocal = 0, consonante = 0, num = 0, cont = 0;
		System.out.print("Ingresa una cadena: ");
		String cadena=lee.nextLine();
		
		for(int i=0; i<cadena.length(); i++){
			
			if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'){
				
				vocal++;
				
			}//if
			
		    if(cadena.charAt(i) == 'b' || cadena.charAt(i) == 'c' || cadena.charAt(i) == 'd' || cadena.charAt(i) == 'f' || cadena.charAt(i) == 'g'||cadena.charAt(i) == 'h' || cadena.charAt(i) == 'j' || cadena.charAt(i) == 'k' || cadena.charAt(i) == 'l' || cadena.charAt(i) == 'm'||cadena.charAt(i) == 'n' || cadena.charAt(i) == 'p' || cadena.charAt(i) == 'q' || cadena.charAt(i) == 'r' || cadena.charAt(i) == 's'|| cadena.charAt(i) == 't'|| cadena.charAt(i) == 'v' || cadena.charAt(i) == 'w'||cadena.charAt(i) == 'x' || cadena.charAt(i) == 'y'|| cadena.charAt(i) == 'z' ){
				
				consonante++;
				
			}//if
			
			if(cadena.charAt(i) == '0' || cadena.charAt(i) == '1' || cadena.charAt(i) == '2' || cadena.charAt(i) == '3' || cadena.charAt(i) == '4'|| cadena.charAt(i) == '5'|| cadena.charAt(i) == '6'|| cadena.charAt(i) == '7'|| cadena.charAt(i) == '8'|| cadena.charAt(i) == '9'){
			
			num++;
			
			}//if
			
			cont++;
			
		}//for
		
	int signos= cont-(consonante+vocal+num);
	
		System.out.println("\nVocales en la cadena: "+vocal+"\nConstantes en la cadena: "+consonante+"\nNumeros en la cadena: "+num+"\nNo-alfanumericos en la cadena: "+signos );
		
		
	}//main	
	

}//class