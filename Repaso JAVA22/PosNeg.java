//Programa 10: Leer un número e indicar si es positivo o negativo
//Martín Galván Vigueraz

import java.util.Scanner;

public class PosNeg{
	
	public static void main(String[] args){
		
		int x;
		
		Scanner lee=new Scanner(System.in);
		
		System.out.print("Ingresa un numero:");
		x=lee.nextInt();
		
		if(x<0){
			
			System.out.println("El numero es negativo\n");
			
		}//if
		else{
			if(x>0){
				
				System.out.println("El numero es positivo\n");
				
			}//if
			
		}//else
		
	}//main	
}//class