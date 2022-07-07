//Programa 26: Capacidad de un Cilindro
//Martín Galván Vigueraz

/*necesitamos:
 a)capacidad = m^3
 b)capacidad = lt
 c)area necesaria = el rectángulo del cilindro
 d)densidad P = masa (volumen)

*/

//2*PI*radio
//m^3 = 1000lt

import java.util.*;

public class Cilindro{
	
	
	double altura, radio, masa;
	//Cilindro invoca = new Cilindro();

/******Método serAltura******/	

	void setAltura(double mialtura){
		
		altura = mialtura;
		
	}//setAltura
	
/******Método getAltura******/


	double getAltura(){
		
		return altura;
		
		
	}//getAltura


/******Método setRadio******/

	void setRadio(double miRadio){
		
		radio = miRadio;
		
	}//setRadio

/******Método getRadio******/

	double getRadio(){
		
		return radio;
		
	}//getRadio

/******Método setMasa******/

	void setMasa(double miMasa){
		
		masa = miMasa;
		
	}//setMasa

/******Método getMasa******/

	double getMasa(){
		
		return masa;
		
	}

/******Método getPerimetro******/

	double getPerimetro(){
		
		return 2*Math.PI*radio;
		
	}//getPerimetro
	
/******Método getAreaRect******/	

	double getAreaRect(){
		
		return ( getPerimetro() )*altura;
		
	}//getArea
	
/******Método getAreaCir******/

	double getAreaCir(){
		
		return Math.PI*(radio*radio);
		
	}//getAreaCir
	
/******Método getVolCir******/	

	double getVolCir(){
		
		return getAreaCir()*altura;
		
	}//getVolCir
	
/******Método getCapLit******/

	double getCapLit(){
		
		return getVolCir()*1000;
		
	}//getCapLit
	
/******Método getDensidad******/	

	double getDensidad(){
		
		return masa/getVolCir();
		
	}//class


	public static void main(String [] args){
	
	Scanner lee = new Scanner(System.in);
	
	double altura1, radio1, masa1;
	
	System.out.print("Dame la altura del cilindro: "); altura1 = lee.nextDouble();
	System.out.print("Dame el radio: "); radio1 = lee.nextDouble();
	System.out.print("Dame la masa: "); masa1 = lee.nextDouble();
	
	Cilindro invocar = new Cilindro();
	
	invocar.setAltura(altura1);
	invocar.setRadio(radio1);
	invocar.setMasa(masa1);
	
	System.out.println("La Capacidad del Cilindro en m^3 es de: "+invocar.getVolCir()+"m^3");
	System.out.println("La Capacidad de l Cilindro en litros es de: "+invocar.getCapLit()+"lts");
	System.out.println("El Perimetro del Circulo es de: "+invocar.getPerimetro()+"m");
	System.out.println("El Area del Circulo es de: "+invocar.getAreaCir()+"m^2");
	System.out.println("El Area Necesaria es de: "+invocar.getAreaRect()+"m^2");
	System.out.println("La Densidad es de: "+invocar.getDensidad()+"Kg/m^3");
	}//main


}//class
