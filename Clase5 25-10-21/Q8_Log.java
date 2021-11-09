package Lab5;
/* 
 * Question N8
 * Autor: Fabiola Tapara Quispe
 * Description: Review of Time Complexity
 * 				Implementar el ejercicio 8 del algoritmos 
 * visto en clase para calcular el tiempo computacional
 * Date: 25 october
 */
public class Q8_Log {
	public static void main(String[] args) {
		System.out.println("Casos de prueba Complexity Time");
		System.out.println();
		System.out.println("Ejercicio8");
		System.out.println("con n=2");
		Q8Log(2);
		System.out.println();
		System.out.println("con n=6");
		Q8Log(6);
	}
	public static void Q8Log(int n) {
		//Q8: What is the time complexity of? 
		//A8: O(log_2(n))
		for (int i = n; i >= 1; i = i/2) {  // for mientras 'i >= 1'
			System.out.println(i);	// O(1)
		}
		/*	 i       
		------------------------
		n
		n / 2
		n / 2^2
		n / 2^3
		.    
		.    
		.    
		n / 2^k

		Se realiza una division sucesiva, se iniciliza en "n" (valor maximo)
		y se va diviendo hasta tener n / 2^k

		Assume that i < 1 para que termine
		Therefore n / 2^k < 1
	    		  n / 2^k = 1
	     		  n = 2^k  // Aplicamos log a ambos lados
	   		  	  k = log_2(n)

		A8: O(log_2(n)) 
		 */
	}
	

}
