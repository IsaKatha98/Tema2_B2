package boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		/*Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que haría el usuario. 
		 * El algoritmo pregunta al usuario cuánto ha sacado en la primera tirada y el usuario le dará
			esa información pero en formato cadena (“UNO”, “DOS” … “SEIS”).
			Después el algoritmo volverá a preguntar al usuario cuánto ha sacado en la segunda tirada y el usuario
			 también dará esa información en formato cadena.
			Por último, el algoritmo mostrará por pantalla la suma de las dos tiradas en formato numérico.
*/
		
		//Declaramos las variables.
		
		String dado1;//Variable introducida por el usuario.
		String dado2;//Segunda variable introducida por el usuario.
		int num1, num2;//Variables auxiliares que utilizaremos para hacer la suma.
		int suma;//Variable resultado.
							
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
							
		Scanner sc= new Scanner (System.in); 
							
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
							
		System.out.print("Introduzca el resultado del primer dado y pulse Intro: ");
		dado1=sc.next();
		System.out.print("Introduzca el resultado del segundo dado y pulse Intro: ");
		dado2=sc.next();
		
		//Asignamos los valores numéricos a los valores escritos introducidos.
		
		num1= switch (dado1) {
			
			case "UNO", "uno" ->{
				yield 1;
			}
			
			case "DOS", "dos"-> {
				yield 2;
			}
			
			case "TRES", "tres"-> {
				yield 3;
			}
			
			case "CUATRO", "cuatro"-> {
				yield 4;
			}
			case "CINCO", "cinco"-> {
				yield 5;
			}
			case "SEIS", "seis"-> {
				yield 6;
			}
			default-> {
				yield -1;
			}
		};
		
		num2= switch (dado2) {
		
			case "UNO", "uno" ->{
				yield 1;
			}
		
			case "DOS", "dos"-> {
				yield 2;
			}
		
			case "TRES", "tres"-> {
				yield 3;
			}
		
			case "CUATRO", "cuatro"-> {
				yield 4;
			}
			case "CINCO", "cinco"-> {
				yield 5;
			}
			case "SEIS", "seis"-> {
				yield 6;
			}
			default-> {
				yield -1;
			}
			
		};
		
		//Realizamos la suma
		
		if (num1!=-1&&num2!=-1) {
			
			suma=num1+num2;
			System.out.println("La suma de ambos dados es= "+suma);}
		
		else {
			
			System.out.println("Ha introducido un valor no válido.");
			
		}
		
		//Por último, cerramos el escáner.
		
		sc.close();

	}

}
