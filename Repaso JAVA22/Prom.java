//Programa 18: Sacar el promedio de 10 números
//Martín Galván Vigueraz

import java.util.*;

public class Prom{
	
	public static void main(String[] args){
		
		Scanner lee = new Scanner(System.in);
		
		double x,y,promedio,suma = 0.0;
		
		System.out.print("\nCantidad de numeros a promediar: ");
		x = Double.parseDouble( lee.next() );
		
		for(int i = 0; i < x; i++){
			
			System.out.print("\nIntroduzca numero: ");
			
			suma = ( suma + Double.parseDouble( lee.next() ) );
						
		}//for

		promedio = (suma/x);
		
		System.out.println("\n-------Terminaste de Ingresar los Numeros-------\n\nLa suma es: "+suma+"\n\nEl promedio de los numeros es: "+promedio);
		
		
	}//main
	
	
}//class
