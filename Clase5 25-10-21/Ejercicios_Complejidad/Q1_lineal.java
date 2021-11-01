package Ejercicios_Complejidad;
/* 
 * Question N1
 * Autor: Fabiola Tapara Quispe
 * Description: Review of Time Complexity
 * Q1: What is the time complexity of? O(n)
 */
public class Q1_lineal {
	public static void main(String[] args) {
		Q1lineal(2);
		Q1lineal(8);
	}

	// A1: O(n)
	public static void Q1lineal(int n) {
		int contador=0;
		for (int i = 0; i < n; i++) { // Se ejecuta "n+1" veces O(n)
		    contador++;   // Se ejecuta "n" veces         
		}
		System.out.println("Acumulado: " + contador);
	}

}

