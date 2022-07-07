import java.util.Scanner;
 
public class Bisiesto{
 
    public static void main(String[] args) {
 
        Scanner lee = new Scanner(System.in);
 
        System.out.println("Introduce un año:");
        int anio = lee.nextInt();
 
        //Un año biciesto es divisible entre 4 y no es divisible entre 100 Ó es divisible entre 100 Y divisible entre 400.
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }//if-else
    }//main
}//class