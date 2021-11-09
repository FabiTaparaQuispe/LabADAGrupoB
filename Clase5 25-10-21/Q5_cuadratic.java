package Clase5 25-10-21;
/* 
 * Question N5
 * Autor: Fabiola Tapara Quispe
 * Description: Review of Time Complexity
 * 				Implementar el ejercicio 5 del algoritmos 
 * visto en clase para calcular el tiempo computacional
 * Date: 25 october
 */
public class Q5_cuadratic {
	public static void main(String[] args) {
		System.out.println("Casos de prueba Complexity Time");
		System.out.println();
		System.out.println("Ejercicio5");
		Q5Cuadratic(2);
		Q5Cuadratic(4);
	}

	public static void Q5Cuadratic(int n) {
		//Q5: What is the time complexity of? 
		// A5: O(n^2)
		int contador=0;
		for(int i = 0; i < n; i++) { // Ciclo for de 'n' veces	
			for(int j = 0; j < i; j++) { // Ciclo for de 'i' veces						
				System.out.println(i + " - " + j);	// O(1)				
			}			
		}
	}
	//Explicacion en clase
	/*	Tiempo de las variables
	i   j      N Veces
	------------------------
	0   0 ❌     0
	------------------------
	1   0 ✔️     1
  		1 ❌     
	------------------------
	2   0 ✔️     2
		1 ✔️  
		2 ❌ 
	------------------------
	.    
	.    
	.    
	------------------------
	n             n
	1 + 2 + 3 + ... + n = n * (n + 1) / 2    
	O(n²)

	Explicacion Individual: Se identifica una depencia de la segunda instruccion 
	   a la primera por "j < i".
	   1 + 2 + 3 + ... + n = n * (n + 1) / 2
	   O((n+1) * (n) / 2) = O(n^2 - n) = O(n^2)*/

}
