//Programa 23: get y set
//Martín Galván Vigueraz
import java.util.*;
 
public class Persona{
      String name;
	  int edad;
	  char sexo;
	  
//********metodo 1 setName ********

	    void setName (String _name){
			name = _name;
		}//setName
		
//********metodo 2 getName*******

		String getName(){
			return name;
		}//getName
		
//********metodo 3 setEdad********

		void setEdad(int _edad){
			edad = _edad;;
		}//setEdad
		
//********metodo 4 getEdad*****

         int getEdad() {
			 return edad;
		 }//getEdad		
		
//********metodo 5 setSexo****

		void setSexo(char _sexo){
			sexo = _sexo;
		}//setSexo
		
//********metodo 6 getSexo****

		 char getSexo() {
			 return sexo;
		 }//getSexo
		 
	public static void main(String[] args){
		
		Scanner lee = new Scanner(System.in);
		
		String Nname  = "";
		int Nedad = 0; //float xxx=5.2f;
		char Nsexo = '_'; //Hola
		
		System.out.print("Nombre: ");
		Nname = lee.nextLine();
		
		System.out.print("Edad: ");
		Nedad = lee.nextInt();
		
		System.out.print("Sexo: ");
		Nsexo = lee.next().charAt(0);
		
		System.out.println();
		System.out.println();
		System.out.println("+-------------------------++");
		
		Persona per = new Persona();
		
		per.setEdad(Nedad);
		per.setSexo(Nsexo);
		per.setName(Nname);
		
		System.out.println("Nombre: "+per.getName()+"\nEdad: "+per.getEdad()+"\nSexo: "+per.getSexo() );
		
		
		
		
		
		
	}//main	
	
}//class

/**
Tarea: hacer el cálculo del área con clases.
*/