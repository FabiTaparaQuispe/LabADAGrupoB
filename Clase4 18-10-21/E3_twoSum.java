package Clase4 18-10-21;

/* 
 * Ejercicio N3
 * Autor: Fabiola Tapara Quispe
 * Descripcion: Encontrar 2 numeros en un arreglo e iterar 
 * por cada uno de ellos, buscando una suma que de 10 y que
 * sean distintos. La complejidad del elemento es de O(n^2)
 * 
 */

public class E3_twoSum {
	public static void main( String[] args )  {
		int[] numeros = new int[] { 1,2,3,4,5,6};
		System.out.println("¿Existe una suma que da 10? " + twoSum(numeros));
	
	}
	public static boolean twoSum(int[]a) {
		
	//Este metodo itera por cada elemento del arreglo y 
	//verifica si existe una suma que den una suma de 10
	for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a.length; y++) {

				if(x != y && (a[x] + a[y] == 10)) {
					System.out.println("La suma que se encontro: " + a[x] + " + "
							+ a[y] + " = " + (a[x] + a[y]));
					return true; 	

				}
			}
		}
	return false;
	}
}

