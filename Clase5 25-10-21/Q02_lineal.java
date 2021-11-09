package Clase5 25-10-21;
/* 
 * Question N2
 * Autor: Fabiola Tapara Quispe
 * Description: Review of Time Complexity
 * Implementar el ejercicio 2 del algoritmos 
 * visto en clase para calcular el tiempo computacional
 * Date: 25 october
 */
public class Q02_lineal {
	public static void main(String[] args) {
		System.out.println("Casos de prueba Complexity Time");
		System.out.println();
		System.out.println("Ejercicio1");
		System.out.println("con n=2");
		Q2lineal(2);
		System.out.println();
		System.out.println("con n=4");
		Q2lineal(4);
	}
	
	public static void Q2lineal(int n) {
		//Q2: What is the time complexity of? O(n)
		// A2: O(n)
		int contador=0;
		for (int i = n; i > 0; i--) { // Decrementa i-- O(n)
			contador++;   // O(n)  
			System.out.println(i);
		}
		System.out.println("Numeros: " + contador);
	}
}
