//Programa 12: Ordenar números de mayor a menor ingresados desde el teclado
//Martín Galván Vigueraz

import java.util.Scanner;

public class OrdMayMen{
	
	public static void main(String[] args){

	int x,y,z,mayor,medio,menor;
	
	Scanner lee = new Scanner(System.in);
	
	System.out.print("Dame el primer numero: ");
	x = lee.nextInt();
	
	System.out.print("Dame el Segundo numero: ");
	y = lee.nextInt();
	
	System.out.print("Dame el ultimo numero: ");
	z = lee.nextInt();
	
	if( (x > y) && (x > z) ){
		mayor = x;		
	}//if
	else if( (y > x) && (y > z) ){
			mayor = y;
		}//if
		else{			
			mayor = z;			
		}//else		

		
	if( (x < y) && (x < z) ){
		menor = x;		
	}//if
	else if( (y < x) && (y < z) ){
			menor = y;
		}//if
		else{			
			menor = z;			
		}//else	
		
	medio = (x+y+z)-(mayor+menor);
	
	System.out.print("Numeros Ordenados de Mayor a Menor: "+mayor+" "+medio+" "+menor);
	
	
	}//main	
	
}//class