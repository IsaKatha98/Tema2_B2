package boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int nota; //Variable introducida por el usuario.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
									
		Scanner sc= new Scanner (System.in);
									
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
		
		System.out.print("Introduzca su nota y pulse Intro: ");
		nota=sc.nextInt();
		
		//Asignamos la valoración de la nota
		
		switch (nota) {
		
			case 0,1,2,3,4 :
				
				System.out.println("Su nota es un insuficiente.");
				break;
			
			case 5: 
				
				System.out.println("Su nota es un suficiente.");
				break;
				
			case 6:
				
				System.out.println("Su nota es un bien.");
				break;
				
			case 7, 8:
				
				System.out.println("Su nota es un notable.");
				break;
				
			case 9,10: 
				
				System.out.println("Su nota es un sobresaliente.");
				break;
			
		}
		
		//Por último, cerramos el escáner.
		
		sc.close();
	}

}
