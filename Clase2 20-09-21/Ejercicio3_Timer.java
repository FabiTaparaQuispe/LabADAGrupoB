package Clase2 20-09-21;

import java.util.Scanner;

public class Ejercicio3_Time {
	/* El ejercicio pide ordenar un arreglo de numeros usando ordenacion
	 * por insercion y mostrarlo ordenado, y guardar los tiempos de ejecuciones
	 * para diferentes cantidades y armar una gráfica de su crecimiento */
	public static void main (String[]args){
		int[] a = Array(10);
		double inicioTime = System.currentTimeMillis();
		insertion(a);
		double finTime = System.currentTimeMillis();
		System.out.println("Se demoro: " + (finTime-inicioTime)  + " milisegundos");

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

	public static int[] Array(int n) {

		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = (n - i);
		}

		return array;

	}
}
