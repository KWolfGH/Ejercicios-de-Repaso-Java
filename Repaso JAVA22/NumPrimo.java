//Programa 14: Mostrar los números primos de 0-3000
//Martín Galván Vigueraz

import java.util.*;

public class NumPrimo{
	
	public static void main(String[] args){
		
		Scanner lee = new Scanner(System.in);

		System.out.print("Numeros primos de 0 hasta n\n");
		int n = lee.nextInt();

		int temp=0;

		for (int i=1;i<=n;i++){
			for (int j=1;j<=n;j++){
				if (i%j==0){
					temp=temp+1;
				}//if

			}//for
			
			if(temp==2){
				System.out.print(" "+i);
			}//if
			
			temp=0;
			
		}//for
			
		
	}//main
	
}//class