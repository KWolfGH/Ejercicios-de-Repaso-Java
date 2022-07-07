//Programa 16: Evaluar la función x^2+2x-0 entre 0-20 en intervalos de 0.25
//Martín Galván Vigueraz

import java.util.*;

public class Funcion{
	
	public static void main(String[] args){
				
		for(double i = 0; i <= 20; i+=0.25){
			
			double x = (i*i)+(2*i)-1;
			
			System.out.println("\nf("+i+") = "+x);			
			
		}//for
		
	}//main
	
}//class