//Programa 24: area usando métodos
//Martín galván Vigueraz

import java.util.*;
import java.util.Scanner;

public class Area{
	
/*************Método Círculo*************/	

	public void Circulo(){
		
		Scanner lee1 = new Scanner(System.in);
		
		double PI = 3.1415962;
		
		System.out.println("Ingresa el valor del radio: ");
		double radio = lee1.nextDouble();
		
		double area1 = ( PI*(radio*radio) );
		
		System.out.println("El area del Circulo es: "+area1+"cm^2");
	
	}//Método Círculo
	
	
/*************Método Triángulo*************/	
	
	public void Triangulo(){
		
		Scanner lee2 = new Scanner(System.in);
		
		System.out.println("Ingresa la base: ");
		double base =  lee2.nextDouble();
		
		System.out.println("Ingresa la Altura: ");
		double altura = lee2.nextDouble();
		
		double area2 = (base*altura)/2;
		
		System.out.println("El area del Triangulo es: "+area2+"cm^2");
		
	}//Método Triángulo
	
	
/*************Método Cuadrado************/		
	
	public void Cuadrado(){
		
		Scanner lee3 = new Scanner(System.in);
		
		System.out.print("Ingresa el valor de los lados: ");
		double lado = lee3.nextDouble();
		
		double area3 = (lado*lado);
		
		System.out.print("El area del Cuadrado es: "+area3+"cm^2");
		
	}//Método Cuadrado
	
	
/*************Método Polígono*************/		
	
	public void Poligono(){
		
		Scanner lee4 = new Scanner(System.in);
		
		System.out.println("Numero de lados: ");
		int lados =  lee4.nextInt();
		
		System.out.println("Tamanio de los lados: ");
		double tamanio=  lee4.nextDouble();
		
		System.out.print("Valor del apotema: ");
		double apotema =  lee4.nextDouble();
		
		double perimetro = (lados*tamanio);
		
		double area4 = (perimetro*apotema)/2;
		
		System.out.print("El area del Poligono es: "+area4+"cm^2");
		
	}//Método Polígono
	
	
/*************Aquí está el Main*************/		
	
	public static void main(String[] args){
		
	Scanner lee = new Scanner(System.in);
	int opcion;
	
	System.out.print("Obten el area de: ");
	System.out.println("\n1.-Circulo.\n2.-Triangulo.\n3.-Cuadrado.\n4.-Poligono regular.");
	opcion =  lee.nextInt();
	
	Area cir = new Area();
	Area tri = new Area();
	Area cua = new Area();
	Area pol = new Area();
	
	switch(opcion){
		
		case 1:
				
				cir.Circulo();
			
			break;
			
		case 2:
		
				tri.Triangulo();
		
			break;

		case 3:
		
				cua.Cuadrado();
		
		    break;
			
		case 4:
		
				pol.Poligono();
		
		    break;
			
		
		default:
		
				System.out.print("Opcion Invalida");
				
			break;
		
		
		
	}//switch
	
		
		
	}//main
	
	
}//class