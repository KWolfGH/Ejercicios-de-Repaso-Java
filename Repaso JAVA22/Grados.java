//Programa 9: Conversión de °C -> °F
//Martín Galván Vigueraz

import java.util.Scanner;

public class Grados{
	
	public static void main(String[] args){
		
		Scanner grad = new Scanner(System.in);
		
		System.out.println("Ingresa °C que desea convertir:");
		double x = grad.nextDouble();
		
		System.out.println(""+x+"°C "+"es igual a: "+((1.8*x)+32)+"°F");		
		
	}//main
	
	
}//class