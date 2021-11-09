package Clase5 25-10-21;
/* 
 * Question N12
 * Autor: Fabiola Tapara Quispe
 * Description: Review of Time Complexity
 * 				Implementar el ejercicio 12 del algoritmos 
 * visto en clase para calcular el tiempo computacional
 * Date: 25 october
 */
public class Q12_nLog {
	public static void main(String[] args) {
		System.out.println("Casos de prueba Complexity Time");
		System.out.println();
		System.out.println("Ejercicio12");
		System.out.println("con n=2");
		Q12nLog(2);
		System.out.println();
		System.out.println("con n=6");
		Q12nLog(6);
	}
	public static void Q12nLog(int n) {

		//Q12: What is the time complexity of? O(n log(n))
		for (int i = 0; i < n; i++) {				//(1)O(n)
			for (int j = 1; j < n; j = j * 2) {     //(2)
				System.out.println(i + " , " + j);  //(3)
			}
		}
		/*Explicacion: 
		 * El for interno j como no depende del for de afuera, su valor es de 
		 * log(n)---> (2) and this inner loop n times * log(n)  
		 * El for externo tiene un valor lineal ---> (1) This repeats n times 
		 * Finalmente * multiplicando su tiempos obtendremos O( n * log(n)) 
		 * (3) and this statement n times * log(n) Adding them together n + 2 n * log(n) 	 		 
		
		 * A12: O(nlog(n)) */
	}
	/* Review Final
	 * for (i = 0; i < n; i++)       // O(n)
	 * for (i = 0; i < n; i=i+2)     // O(n)
	 * for (i = n; i >= 1; i--)      // O(n)
	 * for (i = 1; i < n; i=i*2)     // O(log_2(n))
	 * for (i = 1; i < n; i=i*3)     // O(log_3(n))
	 * for (i = n; i >= 1; i=i/2)    // O(log_2(n))
	 */
}
