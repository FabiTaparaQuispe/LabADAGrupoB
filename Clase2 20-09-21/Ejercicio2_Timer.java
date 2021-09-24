package Clase2 20-09-21;

import java.util.*;
public class Ejercicio2_Time{
	/* El ejercicio pide buscar un elemento dentro de un arreglo de enteros usando 
	 * el metodo de Busqueda Lineal y se debe guardar los tiempos de ejecuciones 
	 * para diferentes cantidades para finalmente armar una gráfica de su crecimiento */

	public static void main (String[]args){
		int[] a = Array(10);
		double inicioTime = System.nanoTime();
		System.out.println("El numero 7 esta en el arreglo? "+ linealSearch(a, 17));
		double finTime = System.nanoTime();
		System.out.println("Se demoro: " + (finTime-inicioTime)  + " nanosegundos");

	}

	public static boolean linealSearch(int [] a, int n){
		/*Metodo linealSearch recibe como argumentos un arreglo y un entero 
		que a buscar dentro del arreglo. Al ser booleano devuelve true si 
		se encuentra dentro del arreglo y false si no se encuentra*/

		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				return true;
			}
		}
		return false;
	}
	public static int[] Array(int n) {

		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = (n - i);
		}

		return array;

	}
}
