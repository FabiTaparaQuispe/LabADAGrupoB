package Clase5 25-10-21;
/* 
 * Question N1
 * Autor: Fabiola Tapara Quispe
 * Description: Review of Time Complexity. Implementar el ejercicio 1 del algoritmos 
 * visto en clase para calcular el tiempo computacional
 * Date: 25 october
 */

public class Q001_lineal {
	public static void main(String[] args) {
		System.out.println("Casos de prueba Complexity Time");
		System.out.println();
		System.out.println("Ejercicio1");
		Q1lineal(2);
		Q1lineal(8);
	}

	// A1: O(n)
	public static void Q1lineal(int n) {
		//Q1: What is the time complexity of? O(n)

		int contador=0;
		for (int i = 0; i < n; i++) { // Se ejecuta "n+1" veces O(n)
			contador++;   // Se ejecuta "n" veces         
		}
		System.out.println("Acumulado: " + contador);
	}
}
