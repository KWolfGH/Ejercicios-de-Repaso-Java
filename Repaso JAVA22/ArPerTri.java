//Programa 25: Area y Perímetro de un rectángulo
//Martín Galván Vigueraz

import java.util.*;

public class ArPerTri{
	
	double base, altura;
	
/******Método setBase******/
	
	void setBase(double mibase){
		
		base = mibase;
		
	}//setBase

/******Método getBase******/

	double getBase(){
		
		return base;
		
	}//getBase
	
/******Método setAltura******/

	void setAltura(double mialtura){
		
		altura = mialtura;
		
	}//setAltura
	
/******Método getAltura******/


	double getAltura(){
		
		return altura;
		
	}//getAltura
	
/******Método getPerimetro******/	
	double getPerimetro(){
		
		return 2*(base+altura);
		
	}//getPerimetro
	
/******Método getArea******/

	double getArea(){
		
		return (base*altura)/2;
	}//getArea
	
/******Método getHip******/	

	double getHip(){
		
		return Math.sqrt( (Math.pow(altura,2) ) + (Math.pow(base,2) ) );
		
	}//getHip
	
/******Aquí está el Main******/
	
	public static void main(String[] args){
		
		Scanner lee = new Scanner(System.in);
		
		double nbase, naltura;
		
		
		System.out.print("\nHola otra vez, mi rectangulo.. \n\n============================\n\n");
		System.out.print("Ingresa la base: ");
		nbase = lee.nextDouble();
		System.out.print("\nIngresa la altura: ");
		naltura = lee.nextDouble();
		
		ArPerTri rec = new ArPerTri();
		
		rec.setBase(nbase);
		rec.setAltura(naltura);
		
		System.out.print("\nEl rectangulo de base "+rec.getBase()+" y altura "+rec.getAltura()+" tiene un area de "+rec.getArea()+"cm^2 y un permetro de "+rec.getPerimetro()+"cm e hipotenusa de "+getHip()+"cm");
		
		
	}//main
	
	
}//class