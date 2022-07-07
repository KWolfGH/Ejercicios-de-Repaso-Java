/*
Programa 20:Leer una frase e indicar 
a) colocar en mayusculas
b) colocar en minusculas
c) tipo oracion 
GABRIELA NOLASCO AVILA 
*/
import java.util.Scanner;

public class mayus_minus_oracion{
	public static void main(String[] args){
		Scanner lee= new Scanner(System.in);
		System.out.println("Da una frase: ");
		String cadena=lee.nextLine();
		System.out.println("FRASE EN MAYUSCULAS: "+cadena.toUpperCase() );
		System.out.println("FRASE EN MINUSCULAS: "+cadena.toLowerCase() );
		String cadena1;
	}
}
