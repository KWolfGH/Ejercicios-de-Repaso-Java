//Programa 15: Mostrar los factores primos de un numero dado por el usuario en un rango de 0-3000
//Martín Galván Vigueraz

import java.util.*;

public class FactorPrimo{
    
    public static void main(String[] args) {
        
        Scanner lee = new Scanner(System.in);
	
        System.out.print("Ingrese un numero: ");
        int x = lee.nextInt();
		
        System.out.println("Los factores primo son:");
        Factores(x);
		
        System.out.println("\n");
		
    }//main
      
    public static void Factores(int y){
		
        if (Primo(y)){
			
         System.out.print(" "+y+" ");
		 
         return;
		 
        }//if
		
        int fact = (int) Math.sqrt(y);
		
        while (y % fact !=0) {
			
            fact++;
			
        }//while
		
        Factores(fact);
        Factores(y/fact);

    }//Factores
  
  
    public static boolean Primo(int num){
		
        int cont = 2;
        boolean prim=true;
		
        while ((prim) && (cont!=num)){
			
          if (num % cont == 0) {
			  
                prim = false;
				
            }//if
			
          if (num == 1) {
			  
                prim = true;
				return prim;
				
            }//if
			
          cont++;
		  
        }//while
		
        return prim;
		
  }//Primo

}//class