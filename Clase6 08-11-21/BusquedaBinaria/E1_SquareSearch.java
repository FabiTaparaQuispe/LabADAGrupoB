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
	//Caso de prueba del ejercicio
	public static void main(String args[]) {
		int[] array = { 2, 3, 6, 6, 7, 9, 15, 19 };
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese el valor a buscar: ");
		int numberSearch = s.nextInt();
		int binarySearch = binarySearch(array, numberSearch); 
		//Para corroborar si el numero esta en el array
		int acumulado = 0;
		int n = 0;
		if(binarySearch == -1) { //Si no se encuentra el numero en el array
			System.out.println("No se encontro " + numberSearch);

		} else { // mediante sumatoria de numeros impares se corrobora si es cuadrado		
			while(acumulado <= binarySearch) {
				if(acumulado == binarySearch) {
					// Si el numero buscado es igual a una suma acumulada
					System.out.println("El numero "+ numberSearch + " es cuadrado");
					break;		
				} else {
					n++;
					/*  Para dar solucion al problema se presenta el siguiente ejemplo
					 *  de numeros cuadrados: n^2=1+3+5+...+2n-1
					 */
					acumulado = acumulado + (2*n - 1);
				}
			}

			if(acumulado > binarySearch) {//ultimo caso
				//El numero se encuentra en el arreglo pero no es cuadrado
				System.out.println("El numero "+ numberSearch + " no es cuadrado");
				binarySearch = -1;
			}
		}
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
				System.out.print("Se encontro el numero ");
				System.out.println();
				return array[mid];
			}

			if (array[mid] < numberSearch)
				// Si el numero "mid" es menor, buscar en la mitad superior
				l = mid + 1;
			else
				// Si el numero "mid" es mayor, buscar en la mitad inferior
				r = mid - 1;
		}
		System.out.println("No se encontro el numero " + numberSearch);

		return -1; // si no se encuentra el numero buscado
	}
}
