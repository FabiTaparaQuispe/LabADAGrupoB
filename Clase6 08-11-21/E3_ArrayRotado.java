package Clase6 08-11-21;

/* 
 * Ejercicio 3 ArrayRotado
 * Autor: Fabiola Tapara Quispe
 * Description: Implementar el algoritmo de busqueda binaria 
 *              y encontrar el item mas pequeño
 * Date: 08/11/21 
 */

public class E3_ArrayRotado {
	public static void main(String args[]) {
		int[] array1 = { 2, 3, 6, 6, 7, 9, 15, 19 };
		int[] array2 = {9, 11, 14, 20, 4, 5, 6, 7};
	
		System.out.println("menor elemento de array 1 es: "+(lessSearch(array1)));
		System.out.println("menor elemento de array 2 es: "+(lessSearch(array2)));

	}
	public static int lessSearch(int[] array) {
		/*  Este metodo recibe un arreglo y el numero a buscar
		 *  devuelve "-1" si no se encuentra el numero.
		 */
		int rpta = 0;
		int mid=0;
		int l = 0;
		int r = array.length-1;
		while (l <= r) {	
			mid = l + (r - l) / 2; // punto medio del arreglo
			if(array[l] < array[mid]) {
				rpta = array[l];
				l = mid;
			}
			else {
				if(array[mid] < rpta) {
					rpta = array[mid];
					r = mid;
				} else {
					l++;
				}
			}
		}
		return rpta;
	}
}

