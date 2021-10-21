package Clase4 18-10-21;

import java.util.Scanner;

/* 
 * Ejercicio N2
 * Autor: Fabiola Tapara Quispe
 * Descripcion: Se pide realizar un programa que recibir un arreglo que
 * identifique los indices pares y debe sumar el elemento encontrado en 
 * esa posicion al resto de elementos. Su complejidad es de O(n^2)
 * 
 */

public class E2_Par{
	public static void main( String[] args )  {
		int[] numeros = new int[] { 1,2,3,4,5,6};
		everyOther(numeros);
	}

	public static void everyOther(int [] a) {
		//Este metodo recibe un arreglo que identifica los indices pares y
		//suma el elemento encontrado en esa posicion al resto de elementos.
		//Imprime por consola el indice de la posicion par y sus sumas.

		for (int x = 0; x < a.length; x++) {
			if ( x % 2 == 0 ) {
				System.out.println("Numero par en el indice: " + a[x]);
				for (int y = 0; y < a.length; y++) {
					System.out.println(a[x] + " + " + a[y] + " = " + (a[x] + a[y]));
				}
				System.out.println();
			}
		}
	}
}
