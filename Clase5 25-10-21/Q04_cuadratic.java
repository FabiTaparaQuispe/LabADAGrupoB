package Clase5 25-10-21;
/* 
 * Question N4
 * Autor: Fabiola Tapara Quispe
 * Description: Review of Time Complexity
 * 		Implementar el ejercicio 4 del algoritmos 
 * visto en clase para calcular el tiempo computacional
 * Date: 25 october
 */
public class Q04_cuadratic {
	public static void main(String[] args) {
		System.out.println("Casos de prueba Complexity Time");
		System.out.println();
		System.out.println("Ejercicio8");
		System.out.println("con n=2");
		Q4Cuadratic(2);
		System.out.println();
		System.out.println("con n=6");
		Q4Cuadratic(6);
	}
	
	public static void Q4Cuadratic(int n) {
		//Q4: What is the time complexity of? 
		//A: O(n^2)
		int contador=0;
		for(int i = 0; i < n; i++) { // Bucle externo for 'n+1'		
			for(int j = 0; j < n; j++) { // Bucle interno for 'n*(n+1)'				
				contador++;	// Acumular n*n	
				System.out.println(i + " - " + j);
			}
		}
		//O((n - 1) * (n - 1)) = O(n^2 - 2n - 1) = O(n^2)
		System.out.println("Numeros repetidos: " + contador);
	}
}
