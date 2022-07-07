//Programa 11: Ingresar dos números e indicar cuál es mayor y cuál es menor
//Martín Galván Vigueraz

import java.util.Scanner;

public class MayMen{
	
	public static void main(String[] args){
		
		int x,y;
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numeromero:");
		x=lee.nextInt();
		
		System.out.println("Ingresa el segundo numero");
		y=lee.nextInt();
		
		if(x<y){
			
			System.out.println(" "+x+" es menor que "+y);
			
		}//if
		else{
			
			if(x>y){
				
				System.out.println(" "+x+" es mayor que "+y);
				
			}//if
			
		}//else{
		
	}//main
	
}//class