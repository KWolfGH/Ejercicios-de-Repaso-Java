//Programa 8: Calcular el volumen de un cilindro
//Martín Galván Vigueraz
//pi*r^2*altura

public class volumen{
	
	public static void main(String[] args){
		
		double PI = 3.14159;
		int radio = 5;
		int altura = 10;
		double volumen = (PI*(radio*radio)*altura);
		
		System.out.println("El Radio del Cilindro es: "+radio+"cm\nLa Altura del Cilindro es: "+altura+"cm\nEl Volumen del Cilindro es: "+volumen+"cm^3\n--------------------------------");
		
		
		
	}//main
	
	
}//class

