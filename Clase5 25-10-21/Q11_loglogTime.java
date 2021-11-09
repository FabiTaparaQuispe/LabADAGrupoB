package Clase5 25-10-21;

public class Q11_loglogTime {
	/* 
	 * Question N11
	 * Autor: Fabiola Tapara Quispe
	 * Description: Review of Time Complexity
	 * 				Implementar el ejercicio 11 del algoritmos 
	 * visto en clase para calcular el tiempo computacional
	 * Date: 25 october
	 */
	public static void main(String[] args) {
		System.out.println("Casos de prueba Complexity Time");
		System.out.println();
		System.out.println("Ejercicio11");
		System.out.println("con n=2");
		Q11LogLogTime(2);
		System.out.println();
		System.out.println("con n=6");
		Q11LogLogTime(6);
	}
	public static void Q11LogLogTime(int n) {
		//Q11: What is the time complexity of? 
		//A11: O(log log(n))
		int contador=0;
		int p = 0;
		for(int i = 1; i < n; i = i * 2) { // For "log_2(n)"
			p++;	// Acumula en p 
			System.out.println(" i = " + i + ", p = " + p);	
		}
		for(int j = 1; j < p; j = j * 2) { // For "log_2(p)"
			contador++;	// O(1)
			System.out.println(" j = " + j + ", p = " + contador);
		}
		/*Explicacion: 
		 *
		 *En el primer for: 
		 *	    i = n / 2 ^ k
		 * 				i >= 1
		 * 				i = 1
		 * 		   	n / 2 ^ k = 1
		 * 					n = 2 ^ k
		 * 			  Log2(n) = k
		 * 			  Log2(n) = p
		 *El valor de "p" sera el tiempo de la recurrencia
		 *es decir log_2(n)
		 *
		 *En el caso del segundo for: 
		 *      j = p / 2 ^ q
		 * 				j >= 1
		 * 				j = 1
		 * 		   	p / 2 ^ q = 1
		 * 			  Log2(n) = 2 ^ q
		 * 			  Log2(Log2(n)) = q
		 *Su valor depende del primer for, su tiempo es de log_2(p)
		 *Finalmente seria: log(p) = log(log(n))

		 *A11: O(log log(n))
		 */

	}
}
