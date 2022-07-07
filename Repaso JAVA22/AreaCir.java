//Programa 6: Area de un Círculo con radio ingresado por el usuario
//Martín Galván Vigueraz

import java.util.Scanner;

public class AreaCir{
	
	public static void main(String[] args){
		
		double PI = 13.14159216;
		
		Scanner radio = new Scanner(System.in);	
	
		System.out.println("Ingresa el valor del radio: \n");
		double x = radio.nextDouble();
		
		System.out.println("El area del circulo es: "+(PI*(x*x)));
		
		
	}//main
	
}//class