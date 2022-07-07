//Programa 5: Suma de dos números por entrada de teclado
//Martín Galván Vigueraz
//Clase Scanner

import java.util.Scanner;

public class Suma{
	
	public static void main(String[] args){
	
	Scanner num1 = new Scanner(System.in);	
	
	System.out.println("Introduce el primer numero: \n");
	int x = num1.nextInt();
	
	System.out.println("Introduce el segundo numero: \n");
	int y = num1.nextInt();
	
	System.out.println("La suma de: "+x+"\ncon el segundo numero: "+y+"\nes igual a: "+(x+y));	
		
	}//main
	
}//class