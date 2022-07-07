//Programa 20: Dada una cadena introducida por el usuario cambia sus letras a mayusculas, a minúsculas y a tipo oración
//Martín Galván Vigueraz

import java.util.*;
import java.util.Scanner;
import java.lang.String;

public class MayMinus{
	
	public static void main(String[] args){
		
	Scanner lee = new Scanner(System.in);
	
	System.out.print("\nIngresa una cadena: ");
	String cadena=lee.nextLine();
	char character[] = cadena.toCharArray();
	
	
	System.out.print("\nCadena en mayusculas: "+cadena.toUpperCase() );
	System.out.print("\nCadena en minusculas: "+cadena.toLowerCase() );	
	
	cadena.charAt(0).toUpperCase();
	for(int i = 0; i < cadena.length(); i++){
		if(cadena.charAt(i) == ' '){
			//char a;
			//System.out.println("\n"+a.toUpperCase(character[i]));
		}//if*/
		//System.out.println("\n"+cadena.charAt(i).toUpperCase(i));
	}//for*/
			
	}//main
	
}//class