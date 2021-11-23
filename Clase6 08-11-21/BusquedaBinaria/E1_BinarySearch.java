package Clase6 08-11-21;

/* 
 * Ejercicio 1 BynarySearch
 * Autor: Fabiola Tapara Quispe
 * Description: Implementar el algoritmo de busqueda binaria 
 *              y buscar un numero indicando si se encuentra o no. 
 * Date: 08/11/21 
 */

class E1_BinarySearch {
	public static void main(String args[]) {
		int[] array = { 2, 3, 6, 6, 7, 9, 15, 19 };
		int prueba1 = 20;
		int prueba2 = 7;
		int prueba3 = 50;
		
		System.out.println("Buscando el numero: " + prueba1 + " ... ");
		System.out.println(binarySearch(array, prueba1));
		
		System.out.println("Buscando el numero: " + prueba2 + " ... ");
		System.out.println(binarySearch(array, prueba2));
		
		System.out.println("Buscando el numero: " + prueba3 + " ... ");
		System.out.println(binarySearch(array, prueba3));

	}
	public static int binarySearch(int[] array, int numberSearch) {
		/*  Este metodo recibe un arreglo y el numero a buscar
		 *  devuelve "-1" si no se encuentra el numero.
		 */
		int mid=0;
		int l = 0;
		int r = array.length-1;
		while (l <= r) {	
			mid = l + (r - l) / 2; // punto medio del arreglo
			if (array[mid] == numberSearch) {
				// Si el numero "mid" es igual al numeroBuscado se encontro
				System.out.print("Si esta el numero ");
				return array[mid];
			}

			if (array[mid] < numberSearch)
				// Si el numero "mid" es menor, buscar en la mitad superior
				l = mid + 1;
			else
				// Si el numero "mid" es mayor, buscar en la mitad inferior
				r = mid - 1;
		}
		System.out.println("No esta el numero " + numberSearch);

		return -1; // si no se encuentra el numero buscado
	}
}


