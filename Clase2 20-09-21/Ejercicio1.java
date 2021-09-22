package Clase2 20-09-21;

import java.util.*;

public class Ejercicio1{
	/*El ejercicio pide ingresar datos donde n es la cantidad de datos y k es el
	 *divisor para todos los n numeros y q la cantidad de n enteros que
	 *sean divisibles entre k*/
	
	public static void main (String[]args){
		// Lectura de los valores de 'n' y 'k'

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite el valor de n: ");
		int n = scan.nextInt();
		System.out.print("Digite el valor de k: ");
		int k = scan.nextInt();
		// La variable q representa la cantidad de numeros divisible entre k 
		int q = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite un numero: ");
			int ingreso = scan.nextInt();
			if(ingreso % k == 0)
				q++;
		}
		System.out.println("Hay "+ q + " numero(s) divisible(s) entre " + k );
	}
}
