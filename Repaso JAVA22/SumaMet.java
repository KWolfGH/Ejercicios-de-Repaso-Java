//12/05/2015
//Programa 1_Ed: Suma de dos números por entrada de teclado
//Martín Galván Vigueraz

import java.util.*;


/*Clase Principal*/
public class SumaMet{


/**********Método Operación**********/
public void Operacion(){
	
	//Objeto para leer del teclado
	Scanner num1 = new Scanner(System.in);	
	
	//Pide y lee del teclado
	System.out.println("Introduce el primer numero: \n");
	int x = num1.nextInt();
	
	System.out.println("Introduce el segundo numero: \n");
	int y = num1.nextInt();	
	
	//Muestra Resultado
	System.out.println("La suma de: "+x+"\ncon el segundo numero: "+y+"\nes igual a: "+(x+y));
	
}//Método Operación

/**********Método Main**********/	
	public static void main(String[] args){
	
	//Crea objeto Op de tipo SumaMet
	SumaMet Op = new SumaMet();
	
	//Objeto Op invoca al método Operacion
	Op.Operacion();
				
	}//main
	
}//class
