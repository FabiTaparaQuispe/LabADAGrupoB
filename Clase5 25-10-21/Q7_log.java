package Clase5 25-10-21;
/* 
 * Question N7
 * Autor: Fabiola Tapara Quispe
 * Description: Review of Time Complexity
 * 				Implementar el ejercicio 7 del algoritmos 
 * visto en clase para calcular el tiempo computacional
 * Date: 25 october
 */
public class Q7_log {
	public static void main(String[] args) {
		System.out.println("Casos de prueba Complexity Time");
		System.out.println();
		System.out.println("Ejercicio7");
		System.out.println("con n=2");
		Q7Log(2);
		System.out.println();
		System.out.println("con n=4");
		Q7Log(4);
	}
	public static void Q7Log(int n) {
		//Q7: What is the time complexity of? O(log_2(n))
		int contador=0;
		for(int i = 1; i < n; i = i * 2) { // for mientras i < n | Tenemos: i = 2 ^ k
			System.out.println(i);// O(1)
		}
		/*	
	  	i       
		------------------------
		1       
		1 * 2 = 2
		2 * 2 = 2^2
		2 * 2^2 = 2^3
		.    
		.    
		.    
		2^k
		El valor inicial es i = 1, se va multiplicando por 2 sucesivamente
		hasta llegar a 2^k

		Assume i >= n
		Therefore i = 2^k
	    	2^k >= n
	    	2^k = n
	   		  k = log_2(n)

		complexity = O(log_2(n))
		------------------------
		1. Comparacion con algorimto lineal

		for (i = 1; i <= n; i++) {
    		statement;
		}
			i = 1 + 1 + 1 + ... + 1 = n
			     -------------------
			           k = n
		2. Comparacion con algorimto sqrt
		for (i = 1; i < n; i = i*2) {
    		statement;
		}

			i = 1 * 2 * 2 * ... * 2 = n
			     -------------------
			           2^k = n
			             k = log_2(n)
		--------------------------------------
		Ejemplos:
		for (i = 1; i < n; i = i*2) {
    		statement;          // log(n)
		}

		Ejemplo1:  n = 8       
		i       
		------------------------
		1
		2
		4
		8 ❌ 
		It is repeated 3 times, log_2(8) = 3 si cumple log(n)	

		Ejemplo2: n = 10
		i       
		------------------------
		1
		2
		4
		8 
		16 ❌  seria mayor que el valor de n 
		It is repeated 4 times
		log_2(8) = 3
		log_2(10) = 3.322
		So we must apply the ceil to log_2(n)
		 */
	}
}
