//Programa 22: Indicar el número mayor y el menor usando clases
//Martín Galván Vigueraz

import java.util.*;

public class MayMenMet{
	
	public void compara(int num){
				
		Scanner lee = new Scanner(System.in);		
				
		int mayor=-1000, menor=1000;
			
		int y[] = new int[num];
		
		for(int i = 0; i < num; i++){
			
		System.out.print("\nIntroduzca numero: ");
		y[i] = lee.nextInt();
			
		if(y[i]>mayor){  
            mayor=y[i];  
        }//if  
		   
        if(y[i]<menor){  
           menor=y[i];  
        }//if

		}//for
		
				
		System.out.println("El mayor es: "+mayor+"\nEn menor es: "+menor);
		
		
	}//compara
	
		
	
	public static void main(String[] args){
				
	Scanner leer = new Scanner(System.in);
	
	MayMenMet comp = new MayMenMet();

	System.out.print("\nCantidad de numeros: ");
	int	x = leer.nextInt();
	comp.compara(x);
	
		
	}//main
		
}//class