package Clase5 25-10-21;
/* 
 * Question N6
 * Autor: Fabiola Tapara Quispe
 * Description: Review of Time Complexity
 * 				Implementar el ejercicio 6 del algoritmos 
 * visto en clase para calcular el tiempo computacional
 * Date: 25 october
 */
public class Q6_Square {
	public static void main(String[] args) {
		System.out.println("Casos de prueba Complexity Time");
		System.out.println();
		System.out.println("Ejercicio6");
		System.out.println("con n=2");
		Q6Square(2);
		System.out.println();
		System.out.println("con n=4");
		Q6Square(4);
	}
	public static void Q6Square(int n) {
		//Q6: What is the time complexity of? O(n^1/2)
		int contador=0;
		int p = 0;	
		for(int i = 1; p <= n; i++) { // Ciclo for p < n
			contador++;		// O(1)			
			p = p + i;
			System.out.println("Acumulado: " + p);
		}
		
		/*  A6 Explicacion:
	 	i       p
	 	------------------------
	  	1       0 + 1 = 1
	  	2       1 + 2
	    3       1 + 2 + 3
	    4       1 + 2 + 3 + 4
	    .    
	    .    
	    .    
	    k       1 + 2 + 3 + 4 + ... + k

	    Condicion k > n   p>n
 		k * (k + 1) / 2 > n //eliminamos los valores menos significativos y las constantes
		k ^ 2 > n
		k > sqrt(n)
 		O(n^(1/2))

		 */
	}
	
}
