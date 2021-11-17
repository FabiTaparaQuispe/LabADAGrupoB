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
		int[] array3 = {6,8,10,12,1,2,3,5};

		System.out.println("menor elemento de array 1 es: "+(lessSearch(array1)));
		System.out.println("Resultado esperado: 2");
		System.out.println("menor elemento de array 2 es: "+(lessSearch(array2)));
		System.out.println("Resultado esperado: 4");
		System.out.println("menor elemento de array 3 es: "+(lessSearch(array3)));
		System.out.println("Resultado esperado: 1");
	}

	public static int lessSearch(int [] array){
		int l = 0;
		int r = array.length-1;
		int mid = 0;
		while(l <= r){
			mid = ( l + r ) / 2;
			if(array[l] < array[r]){ 
				r = mid;
			}
			else if(array[l] > array[r]){
				if(array[l +1 ] < array[mid]){ 
					l = l +1;
				}
				else {
					l = mid;
				}
			}
			if(l == r){
				return array[mid];
			}
		}
		return array[mid]; 
	}
}


