package Clase6 08-11-21;
import java.util.Scanner;
/* 
 * Ejercicio 2 InmediatoMayor
 * Autor: Fabiola Tapara Quispe
 * Description: Implementar el algoritmo de busqueda binaria 
 *              y devolver el numero inmediato mayor o igual al buscado
 * Date: 08/11/21 
 */

import java.util.Scanner;

public class E2_InmediatoMayor {
	public static void main(String args[]) {
		int[] array = { 2, 3, 6, 6, 7, 9, 15, 19 };
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese el valor a buscar: ");
		int numberSearch = s.nextInt();
		int value=(inmediatoMayorSearch(array, numberSearch));
		if (value == -1)
			System.out.println("No se encontró");
		else {
			System.out.print("El inmediato igual o mayor es: "+value);
		}
		//casos de prueba
		System.out.println();
		System.out.println("Mayor o igual a 10: " + inmediatoMayorSearch(array, 10) + "\n");
		System.out.println("Mayor o igual a 19: " + inmediatoMayorSearch(array, 19) + "\n");
		System.out.println("Mayor o igual a 6: " + inmediatoMayorSearch(array, 6) + "\n");
		System.out.println("Mayor o igual a 0: " + inmediatoMayorSearch(array, 0) + "\n");

	}
	public static int inmediatoMayorSearch(int[] array, int numberSearch) {
		/*  Este metodo recibe un arreglo y el numero a buscar
		 *  devuelve "-1" si no se encuentra el numero.
		 */
		int mid=0;
		int l = 0;
		int r = array.length-1;
		while (l <= r) {	
			mid = l + (r - l) / 2; // punto medio del arreglo
			//System.out.println("Indice medio: " +mid);
			if (array[mid] == numberSearch) {
				// Si el numero "mid" es igual al numeroBuscado se encontro
				
				return array[mid];
			}

			else {
				if (numberSearch<array[mid]) {
					// Si el numero "mid" es mayor, buscar en la mitad inferior
					//System.out.println("Comparando es mayor");
					r = mid - 1;
				}else {

					// Si el numero "mid" es menor, buscar en la mitad superior
					//System.out.println("Comparando es menor");

					l = mid + 1;
				}
			}

		}
		return array[mid];
	}
}

