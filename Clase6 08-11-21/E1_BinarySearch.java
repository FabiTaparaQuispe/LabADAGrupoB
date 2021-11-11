package Clase6 08-11-21;
/* 
 * Ejercicio 1 BynarySearch
 * Autor: Fabiola Tapara Quispe
 * Description: Implementar el algoritmo de busqueda binaria 
 *              y buscar un numero indicando si se encuentra o no. 
 * Date: 08/11/21 
*/


import java.util.Scanner;

class E1_BinarySearch {
	int binarySearch(int array[], int target, int l, int r) {
		int mid=0;
		while (l <= r) {
			mid = l + (r - l) / 2;
			if (array[mid] == target) {
				return array[mid-1];
			}
				
			if (array[mid] < target)
				l = mid + 1;
			else
				r = mid - 1;
		}
		return array[mid-1];
	}

	public static void main(String args[]) {
		E1_BinarySearch obj = new E1_BinarySearch();
		int[] array = { 2, 3, 6, 6, 7, 9, 15, 19 };
		
		int n = array.length;
		Scanner input = new Scanner(System.in);
		System.out.println("Encuentre el primer valor menor a:");
		int element = input.nextInt();
		input.close();
		int result = obj.binarySearch(array, element, 0, n - 1);
		if (result == -1)
			System.out.println("No se encontro");
		else
			System.out.println("El elemento menor es: " + result);
	}
	
}
