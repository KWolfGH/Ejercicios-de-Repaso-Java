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

public class CilindroTab{
	
	
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
	
	double altura1,	masa1;
	double radio1 = 1;
	
	System.out.print("Dame la altura del cilindro: "); altura1 = lee.nextDouble();
	//System.out.print("Dame el radio: "); radio1 = lee.nextDouble();
	System.out.print("Dame la masa: "); masa1 = lee.nextDouble();
	
	CilindroTab invocar = new CilindroTab();
	

	System.out.println("Radio\tAltura\tMasa\tVolumen(m^3)\tLitros(lts)\tArea(m^2)\tDensidad");
	System.out.println("===============================================================================");
	
	
	for(int i = 0; i<20; i++){		
	
	invocar.setAltura(altura1);
	invocar.setRadio(radio1);
	invocar.setMasa(masa1);

	System.out.println(" "+radio1+"\t"+altura1+"\t"+masa1+"\t"+invocar.getVolCir()+"\t"+invocar.getCapLit()+"\t"+invocar.getAreaRect()+"\t"+invocar.getDensidad() );
	
	radio1+=0.5;
	
	}//for
	
	}//main


}//class
