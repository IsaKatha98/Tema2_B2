package boletin2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
		//Declaramos las variables.
		
		String carnet;//Variable en la que el usuario introduce la opción que desea.
							
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
							
		Scanner sc= new Scanner (System.in); 
							
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
							
		
		System.out.print("Indique un tipo de carné de conducir:");
		carnet=sc.next();
			
		//Asignamos los valores de la variable carnet.
		
		switch (carnet) {
		
			case "E"-> {
				
				System.out.println("Remolques.");
			}
		
			case "D" -> {
				
				System.out.println("Autobuses.");
				
			}
			
			case "C1", "C2", "C3", "C4", "C5"-> {
				
				System.out.println("Camiones.");
			}
			
			case "A"-> {
				System.out.println("Motocicletas.");
			}
			
			case "B1","B2" ->{
				System.out.println("Automóviles.");
			}
			
			default ->{
				System.out.println("Categoría no definida.");
			}
			
		}
	
		//Por último, cerramos el escáner.
		
		sc.close();
				

	}

}
