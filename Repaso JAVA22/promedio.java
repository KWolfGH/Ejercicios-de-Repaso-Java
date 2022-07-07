//Programa 7: Saca el 16% del promedio de la suma de (85+18+40)
//Martín Galván Vigueraz

public class promedio{
	
	public static void main(String[] args){
		
		int x = 85;
		int y = 18;
		int z = 40;
		int suma = x+y+z;
		double promedio = suma/3;
		double porcentaje = (promedio * 0.16);
		
		System.out.println("La Suma de x,y,z es: "+suma+"\nEl Promedio es: "+promedio+"\nEl 16% del Promedio es: "+porcentaje+"\n--------------------------------");
		
	}//main
	
}//class