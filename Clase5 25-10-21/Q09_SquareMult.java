package Clase5 25-10-21;
/* 
 * Question N9
 * Autor: Fabiola Tapara Quispe
 * Description: Review of Time Complexity
 * 				Implementar el ejercicio 9 del algoritmos 
 * visto en clase para calcular el tiempo computacional
 * Date: 25 october
 */
public class Q09_SquareMult {
	public static void main(String[] args) {
		System.out.println("Casos de prueba Complexity Time");
		System.out.println();
		System.out.println("Ejercicio9");
		System.out.println("con n=2");
		Q9SquareMult(2);
		System.out.println();
		System.out.println("con n=6");
		Q9SquareMult(6);
	}
	
	public static void Q9SquareMult(int n) {
		//Q9: What is the time complexity of? 
		//A9: O(sqrt(n))
		int contador = 0;
		for(int i = 0; i * i < n; i++) { // For mientras "i * i < n"
			contador++;
			System.out.println(i);		// O(1)
		}
		System.out.println("Numeros acumulados: " + contador);
		System.out.println();

		/*	
		Condition       	i * i < n
		Para que finalice el programa: 
		To finish       	i * i >= n
		We assume that     	i^2 = n
	                    	i = sqrt(n)		
		A9: O(sqrt(n))
		 */
	}
}
