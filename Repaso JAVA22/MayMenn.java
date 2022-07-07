//Programa 19: Determinar el mayor y el menor número de una lista de 10
//Martín Galván Vigueraz

import java.util.*;

public class MayMenn{
	
	public static void main(String[] args){
		
		Scanner lee = new Scanner(System.in);		 	 
		int mayor=-1000, menor=1000;
			
		System.out.print("\nCantidad de numeros: ");
		int x = lee.nextInt();
		int y[] = new int[x];
		
		for(int i = 0; i < x; i++){
			
			System.out.print("\nIntroduzca numero: ");
			y[i] = lee.nextInt();
			
			if(y[i]>mayor){  
               mayor=y[i];  
           }//if  
		   
           if(y[i]<menor){  
               menor=y[i];  
           }//if

		}//for
		
				
		System.out.println("El mayor es: "+mayor+"\nEn menor es: "+menor);

		
	}//main
	
}//class