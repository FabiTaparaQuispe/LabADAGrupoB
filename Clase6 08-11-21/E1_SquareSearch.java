package Clase6 08-11-21;
import java.util.Scanner;
/* 
 * Ejercicio 1 SquareSearch
 * Autor: Fabiola Tapara Quispe
 * Description: Implementar el algoritmo de busqueda binaria 
 *              para comprobar si un numero es cuadrado o no.
 * Date: 08/11/21 
 */

class E1_SquareSearch {
	public static void main(String args[]) {
		int[] array = { 2, 3, 6, 6, 7, 9, 15, 19 };
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese el valor a buscar: ");
		int numberSearch = s.nextInt();
		System.out.println((squareSearch(array, numberSearch)));

	}

	public static int squareSearch(int[] array, int numberSearch) {
		/*  Este metodo recibe un arreglo y el numero a buscar
		 *  devuelve "-1" si no se encuentra el numero.
		 */
		int mid=0;
		int l = 0;
		int r = array.length-1;
		while (l <= r) {	
			mid = l + (r - l) / 2; // punto medio del arreglo
			if (array[mid]*array[mid] == numberSearch) {
				// Si el numero "mid" es igual al numeroBuscado se encontro
				System.out.print("Se encontro el numero ");
				return mid;
			}
			else {
			if (array[mid] < numberSearch)
				// Si el numero "mid" es menor, buscar en la mitad superior
				l = mid + 1;
			else
				// Si el numero "mid" es mayor, buscar en la mitad inferior
				r = mid - 1;
			}
		}
		System.out.println("No se encontro el numero " + numberSearch);

		return -1; // si no se encuentra el numero buscado
	}
}
