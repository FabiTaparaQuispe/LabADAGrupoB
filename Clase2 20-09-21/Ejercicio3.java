package Clase2 20-09-21;
import java.util.Scanner;

public class Ejercicio3 {
	/* El ejercicio pide ordenar un arreglo de numeros usando ordenacion
	 * por insercion y mostrarlo ordenado */
	public static void main(String[] args) {

		// Metodo main del programa

		int[] a = { 10, 4, 8, 9, 1, 15, 7, 5, 13, 6 };
		System.out.println("\nArreglo inicial: \n");
		print(a);
		insertion(a);
		System.out.println("\nArreglo ordenado: \n");
		print(a);

	}

	public static void insertion(int[] a) {

		/* Metodo insertion ordenar un arreglo de numeros usando ordenacion
		 * por insercion*/
		int k, t;
		for(int i=0;i<a.length;i++) {
			k = i;
			t = a[i];
			while(k	>0 && a[k-1]>t) { 
				a[k]=a[k-1];
				k--;
			}
			a[k]=t;
		}

	}

	public static void print(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", "); 
		}
		System.out.println();

	}
}
