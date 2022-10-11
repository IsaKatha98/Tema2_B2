package boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int dia; //Variable introducida por el usuario.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
									
		Scanner sc= new Scanner (System.in);
									
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
		
		System.out.print("Introduzca un número (1-7) para saber a qué día de la semana corresponde y pulse Intro: ");
		dia=sc.nextInt();
		
		//Asignamos el día de la semana correspondiente
		
		switch (dia) {
		
		case 1 :
			
			System.out.println("Lunes");
			break;
		
		case 2: 
			
			System.out.println("Martes");
			break;
			
		case 3:
			
			System.out.println("Miércoles");
			break;
			
		case 4:
			
			System.out.println("Jueves");
			break;
			
		case 5: 
			
			System.out.println("Viernes");
			break;
		
		case 6:
			
			System.out.println("Sábado");
			break;
			
		case 7:
			
			System.out.println("Domingo");
			break;
			
		default:
			
			System.out.println("Undefined");
		
	}
		
	//Por último, cerramos el escáner.
		
	sc.close();

	}

}
