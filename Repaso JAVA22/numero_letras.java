/*
Programa 17:Leer una frase e indicar 
a) cuantas vocales hay?
b) cuantas cosonantes hay?
c) cuantos signos no son vocales o consonantes 
GABRIELA NOLASCO AVILA 
*/
import java.util.Scanner;

public class numero_letras{
	public static void main(String[] args){
		Scanner lee= new Scanner(System.in);
		int suma=0,suma2=0,suma3=0, suma4=0;
		System.out.println("Da una frase: ");
		String cadena=lee.nextLine();
		for(int i=0; i<cadena.length(); i++){
			if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'){
				suma++;
			}
		    if(cadena.charAt(i) == 'b' || cadena.charAt(i) == 'c' || cadena.charAt(i) == 'd' || cadena.charAt(i) == 'f' || cadena.charAt(i) == 'g'||cadena.charAt(i) == 'h' || cadena.charAt(i) == 'j' || cadena.charAt(i) == 'k' || cadena.charAt(i) == 'l' || cadena.charAt(i) == 'm'||cadena.charAt(i) == 'n' || cadena.charAt(i) == 'p' || cadena.charAt(i) == 'q' || cadena.charAt(i) == 'r' || cadena.charAt(i) == 's'|| cadena.charAt(i) == 't'|| cadena.charAt(i) == 'v' || cadena.charAt(i) == 'w'||cadena.charAt(i) == 'x' || cadena.charAt(i) == 'y'|| cadena.charAt(i) == 'z' ){
				suma2++;
			}
			
			if(cadena.charAt(i) == '0' || cadena.charAt(i) == '1' || cadena.charAt(i) == '2' || cadena.charAt(i) == '3' || cadena.charAt(i) == '4'|| cadena.charAt(i) == '5'|| cadena.charAt(i) == '6'|| cadena.charAt(i) == '7'|| cadena.charAt(i) == '8'|| cadena.charAt(i) == '9'){
			suma4++;
			
			}
			suma3++;
		}
	int sumita= suma3-(suma2+suma+suma4);
		System.out.println("El numero de vocales es: "+ suma );
		System.out.println("El numero de consonantes es: "+ suma2 );
		System.out.println("El numero de numeros encontrados es: "+ suma4 );
		System.out.println("El numero de signos es: "+ sumita );
		
		
	}
}
