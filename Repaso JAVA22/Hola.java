import java.util.*;
public class Hola{
	public static void main(String[] args){
		int a, b, c;
        Scanner lee = new Scanner(System.in);
		
		System.out.println("Dame el valor de a ");
		a = lee.nextInt();
		
		System.out.println("Dame el valor de b ");
		b = lee.nextInt();
		
		c = a + b;
		System.out.println(c);
	}
}