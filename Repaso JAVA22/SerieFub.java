//Programa 13: Serie de Fubonacci
//Martín Galván Vigueraz

import java.util.*;

public class SerieFub{
	
	public static void main(String[] args){
		
	double a=0,b=1,c,limite; 
	Scanner lee = new Scanner(System.in);
	
	System.out.print("Numero de elementos de la serie: ");
	limite = lee.nextDouble();

	for(int i=0;i<limite;i++){ 
		c=a+b; 
		a=b; 
		b=c; 
		System.out.println(" "+a); 
	} 
		
	}//main
	
}//class