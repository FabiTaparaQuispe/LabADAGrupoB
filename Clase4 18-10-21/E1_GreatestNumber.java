package Clase4 18-10-21;

/* 
 * Ejercicio N1
 * Autor: Fabiola Tapara Quispe
 * Description: Encontrar el elemento mayor de un arreglo de numeros 
 * 				en un tiempo de O(n) 
 */

class E1_GreatestNumber {
	public static void main(String[] args) {
		int[] numeros = new int[] { 28, 50, 40, 500, 20, 44, 100, 153 };
		System.out.println("El mayor es: " + greatestNumber(numeros));
	}
	// El metodo itera sobre los elementos de un arreglo y devuelve el mayor
	public static int greatestNumber(int[] a) {	
		
		int mayor = 0; // variable aux
		// Ciclo for, itera sobre los elementos del arreglo
		for (int x = 1; x < a.length; x++) {
			//compara el numero del indice x si es mayor al maximo actual
			if (a[x] > mayor) {
				mayor = a[x];//si es mayor se le asigna como nuevo maximo
			}
		}
		return mayor;// retorna el valor maximo
	}
}
