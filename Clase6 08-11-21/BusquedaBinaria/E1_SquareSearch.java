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
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese el valor a buscar: ");
		int numberSearch = s.nextInt();
		System.out.println((binarySearch(numberSearch)));

	}

	public static int binarySearch(int numberSearch) {
		/*  Este metodo recibe un arreglo y el numero a buscar
		 *  devuelve "-1" si no se encuentra el numero.
		 */
		int mid=0;
		int l = 0;
		int r = numberSearch;
		while (l <= r) {	
			mid = l + (r - l) / 2; // punto medio
			if (mid*mid == numberSearch) {
				// Si "mid"*"mid" es igual al numeroBuscado es cuadrado
				System.out.print("El numero "+numberSearch+" es cuadrado");
				System.out.println();
				return numberSearch;
			}

			else if (mid*mid < numberSearch)
				// Si el numero "mid*mid" es menor, buscar en la mitad superior
				l = mid + 1;
			else
				// Si el numero "mid" es mayor, buscar en la mitad inferior
				r = mid - 1;
		}
		System.out.println("No es cuadrado " + numberSearch);

		return -1; // si no es cuadrado el numero buscado
	}
	
}
