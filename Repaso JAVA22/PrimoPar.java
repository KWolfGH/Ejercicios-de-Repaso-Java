import java.util.Scanner;

public class PrimoPar{

	public static void main(String[] args) {
		
		Scanner lee = new Scanner(System.in);

		System.out.println("Dame un Numero: ");
		int numero = lee.nextInt();

		int temp=0;
		
		System.out.print("Numeros primos de 0 hasta N\n");		

		for (int i=1;i<=numero;i++){
			for (int j=1;j<=numero;j++){
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