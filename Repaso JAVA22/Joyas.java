/*
*Martín Galván Vigueraz
*Programa de Selección de joyas
*Dada una cadena de joyas ingresada por el usario, se selecciona el numero de piedras (cadena también ingresada por el usuario) con joyas identicas a las que el usuario ingresó.
*Las joyas deben ser únicamente letras del alfabeto inglés, la cadena joyas debe tener al menos una joya y la cadena de piedras no puede tener más de 50 letras
*/
import java.util.*;

public class Joyas{

    public static void main (String[] args){

    	Scanner lee = new Scanner(System.in);

    	System.out.println("Joyas a seleccionar:");
    	String joyas = lee.nextLine();
    	System.out.println("Piedras presiosas:");
    	String piedras = lee.nextLine();
    	System.out.println(seleccion(joyas, piedras));
  	}//main

  	public static int seleccion(String joyas, String piedras) {
        int selec = 0;

        if(joyas.length() > 0 && piedras.length() <= 50){
        	for(int i=0; i<piedras.length();i++){
                for(int j=0;j<joyas.length();j++){
            	    if( (piedras.charAt(i) != 'ñ') && (joyas.charAt(j) != 'ñ') && (piedras.charAt(i) == joyas.charAt(j)) ){
                   		selec++;
                    }//if
                }//for
        	}//for
        }//if
        return selec;
    }//seleccion
}//class
