package Ejercicios_Complejidad;
/* 
 * Question N1
 * Autor: Fabiola Tapara Quispe
 * Description: Review of Time Complexity
 * Q3: What is the time complexity of? O(n)
 * Q4: What is the time complexity of? O(n^2)
 * Q5: What is the time complexity of? O(n^2)
 * Q6: What is the time complexity of? O(n^1/2)
 * Q7: What is the time complexity of? O(log_2(n))
 * Q8: What is the time complexity of? O(log_2(n))
 * Q9: What is the time complexity of? O(sqrt(n))
 * Q10: What is the time complexity of? O(n)
 * Q11: What is the time complexity of? O(log log(n))
 * Q12: What is the time complexity of? O(n log(n))
 * 
 * // Review
 * for (i = 0; i < n; i++)       // O(n)
 * for (i = 0; i < n; i=i+2)     // O(n)
 * for (i = n; i >= 1; i--)      // O(n)
 * for (i = 1; i < n; i=i*2)     // O(log_2(n))
 * for (i = 1; i < n; i=i*3)     // O(log_3(n))
 * for (i = n; i >= 1; i=i/2)    // O(log_2(n))
 */
public class Q1_lineal {
	public static void main(String[] args) {
		System.out.println("Ejercicio1");
		Q1lineal(2);
		Q1lineal(8);
		System.out.println();
		System.out.println("Ejercicio2");
		Q2lineal(2);
		Q2lineal(8);
		System.out.println();
		System.out.println("Ejercicio3");
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
	// A2: O(n)
	public static void Q2lineal(int n) {
		//Q2: What is the time complexity of? O(n)
		int contador=0;
		for (int i = n; i > 0; i--) { // Decrementa i-- O(n)
		    contador++;   // O(1)        
		}
		System.out.println("Acumulado: " + contador);
	}

}

