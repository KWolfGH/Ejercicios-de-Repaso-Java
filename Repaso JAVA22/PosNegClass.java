//Programa 21: Hacer un programa con clases que diga si un numero es positivo o negativo
//Martín Galván Vigueraz

import java.util.*;

public class PosNegClass{
	
	public void metodo1(double x){
	
		if(x<0){
		System.out.print("\nEl numero: "+x+" es negativo");
		}//if
		else{
			System.out.print("El numero: "+x+" es positivo");
		}//else
	}//metodo1

	public static void main(String[] args){
	
		double n;
		PosNegClass np = new PosNegClass();
		
		Scanner tecla = new Scanner(System.in);
		System.out.println("Teclea un numero: ");
		
		n=tecla.nextDouble();
		np.metodo1(n);
		
		System.out.println("Este  numero 5 esta fijo: ");
		np.metodo1(5);
		
		
	}//main
	
	
}//class
