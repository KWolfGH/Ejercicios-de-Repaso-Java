import java.util.Scanner;

public class NumeroPrimo{
    
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        System.out.println("Ingreas un numero:");
        int numero = lee.nextInt();
        int contador = 0;

        for (int i = 1;i <= numero;i++) {
            if (numero % i == 0) {
                contador++;
            }//if
        }//for
        if (contador == 2) {
            System.out.println("Es Primo");
        }else{
            System.out.println("No es Primo");
        }//else
    }//main
}//class