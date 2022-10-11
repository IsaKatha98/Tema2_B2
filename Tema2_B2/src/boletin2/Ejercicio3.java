package boletin2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/* Escribe un algoritmo que le pida al usuario dos números. A continuación debe mostrar el siguiente menú por pantalla:
SUMAR LOS NÚMEROS
RESTAR LOS NÚMEROS
MULTIPLICAR LOS NÚMEROS
DIVIDIR LOS NÚMEROS
	Después, el algoritmo debe pedirle al usuario que selecciona una opción y que haga la operación que marca esa opción, mostrando por 
	último el resultado de la operación elegida por el usuario. Si el usuario elige una opción incorrecta, el algoritmo se lo hace saber al usuario	y 
	no haría nada.*/

		//Declaramos las variables.
		
		int num1;//Variable introducida por el usuario.
		int num2;//Segunda variable introducida por el usuario.
		String menu;//Variable en la que el usuario introduce la opción del menú.
					
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
					
		Scanner sc= new Scanner (System.in); 
					
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
					
		System.out.print("Introduzca un número y pulse Intro: ");
		num1=sc.nextInt();
		System.out.print("Introduzca otro número y pulse Intro: ");
		num2=sc.nextInt();
		System.out.print("""
			
				A continuación deberá elegir entre una de las siguientes opciones:
				
				A = Sumar los números
				B = Restar los números
				C = Multiplicar los números
				D = Dividir los números
							
				Elija la opción deseada: """);
		
		menu=sc.next();
		
		//Instrucciones
		
		switch (menu) {
		
		case "A":
			
			System.out.println("La suma de los dos números es= "+(num1+num2));
			break;
		
		case "B":
			
			System.out.println("La resta de los números introducidos es= "+(num1-num2));
			break;
			
		case "C":
			
			System.out.println("La multiplicación de ambos números es= "+(num1*num2));
			break;
			
		case "D":
			
			System.out.println("La división de ambos números es= "+(num1/num2));
			break;
			
		default:
			
			System.out.println("Esta opción no es válida.");
			
		}
		
		//Por último, cerramos el escáner.
		
		sc.close();

	}

}
