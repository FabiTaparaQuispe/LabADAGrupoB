package Lab5;
/* 
 * Question N1
 * Autor: Fabiola Tapara Quispe
 * Description: Review of Time Complexity
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
		Q3Mitad(2);
		Q3Mitad(8);
		System.out.println();
		System.out.println("Ejercicio4");
		Q4Cuadratic(2);
		Q4Cuadratic(8);
		System.out.println();
		System.out.println("Ejercicio5");
		Q5Cuadratic(2);
		Q5Cuadratic(8);
		System.out.println("Ejercicio6");
		Q6Square(2);
		Q6Square(8);
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
			contador++;   // O(n)        
		}
		System.out.println("Acumulado: " + contador);
	}
	// A3: O(n)
	public static void Q3Mitad(int n) {
		//Q3: What is the time complexity of? O(n)
		// It can be 2, 20, etc
		//0 2 4 6 ... n - 2
		//O(n)*1/2 = O(n) por ser 1/2 una constante
		int contador=0;
		for (int i = 0; i < n; i=i+2) { 
			contador++; //O(n/2) 
		}
		System.out.println("Acumulado: " + contador);
	}
	public static void Q4Cuadratic(int n) {
		//Q4: What is the time complexity of? O(n^2)
		int contador=0;
		for(int i = 0; i < n; i++) { // Bucle externo for 'n+1'		
			for(int j = 0; j < n; j++) { // Bucle interno for 'n*(n+1)'				
				contador++;	// Acumular n*n				
			}
		}
		//O(n*(n+1))+(n+1) = O(n^2 + n) = O(n^2)
		System.out.println("Acumulado: " + contador);
	}
	public static void Q5Cuadratic(int n) {
		//Q5: What is the time complexity of? O(n^2)
		int contador=0;
		for(int i = 0; i < n; i++) { // Ciclo for de 'n' veces	
			for(int j = 0; j < i; j++) { // Ciclo for de 'i' veces						
				contador++;	// O(1)				
			}			
		}
		/* Explicacion: Se identifica una depencia de la segunda instruccion 
		   a la primera por "j < i".
		   1 + 2 + 3 + ... + n = n * (n + 1) / 2
		   O((n+1) * (n) / 2) = O(n^2 - n) = O(n^2)*/

		System.out.println("Acumulado: " + contador);
	}
	public static void Q6Square(int n) {
		//Q6: What is the time complexity of? O(n^1/2)
		int contador=0;
		int p = 0;	
		for(int i = 1; p <= n; i++) { // Ciclo for p < n
			contador++;		// O(1)			
			p = p + i;		
		}
		System.out.println("Acumulado: " + contador);
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
 		k * (k + 1) / 2 > n
		k ^ 2 > n
		k > sqrt(n)
 		O(n^(1/2))

		 */
	}
}
