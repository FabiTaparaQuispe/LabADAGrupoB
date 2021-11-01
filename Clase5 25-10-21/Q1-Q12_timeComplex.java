package Lab5;
/* 
 * Question N1-12
 * Autor: Fabiola Tapara Quispe
 * Description: Review of Time Complexity
 * 				Implementar los 12 ejercicios de los algoritmos 
 * vistos en clase para calcular el tiempo computacional
 * Date: 25 october
 */

public class Q1_lineal {
	public static void main(String[] args) {
		System.out.println("Casos de prueba Complexity Time");
		System.out.println();
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
		System.out.println();
		System.out.println("Ejercicio6");
		Q6Square(2);
		Q6Square(8);
		System.out.println();
		System.out.println("Ejercicio7");
		Q7Log(2);
		Q7Log(8);
		Q7Log(16);
		System.out.println();
		System.out.println("Ejercicio8");
		Q8Log(2);
		Q8Log(8);
		Q8Log(16);
		System.out.println();
		System.out.println("Ejercicio9");
		Q9SquareMult(2);
		Q9SquareMult(8);
		Q9SquareMult(16);
		System.out.println();
		System.out.println("Ejercicio10");
		Q10Linel2For(2);
		Q10Linel2For(8);
		Q10Linel2For(16);
		System.out.println();
		System.out.println("Ejercicio11");
		Q11LogLogTime(2);
		Q11LogLogTime(8);
		Q11LogLogTime(16);
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
 		k * (k + 1) / 2 > n //eliminamos los valores menos significativos y las constantes
		k ^ 2 > n
		k > sqrt(n)
 		O(n^(1/2))

		 */
	}
	public static void Q7Log(int n) {
		//Q7: What is the time complexity of? O(log_2(n))
		int contador=0;
		for(int i = 1; i < n; i = i * 2) { // for mientras i < n | Tenemos: i = 2 ^ k
			contador++;	// O(1)
		}
		System.out.println("Acumulado: " + contador);
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
	public static void Q8Log(int n) {
		//Q8: What is the time complexity of? O(log_2(n))
		int contador=0;
		for(int i = 1; i < n; i = i / 2) {  // for mientras 'i >= 1'
			contador++;	// O(1)
		}
		System.out.println("Acumulado: " + contador);
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
	public static void Q9SquareMult(int n) {
		//Q9: What is the time complexity of? O(sqrt(n))
		int contador=0;
		for(int i = 1; i * i < n; i++) { // For mientras "i * i < n"
			contador++;	// O(1)
		}
		System.out.println("Acumulado: " + contador);

		/*	
		Condition       	i * i < n
		Para que finalice el programa: 
		To finish       	i * i >= n
		We assume that     	i^2 = n
	                    	i = sqrt(n)		
		A9: O(sqrt(n))
		 */
	}
	public static void Q10Linel2For(int n) {
		//Q10: What is the time complexity of? O(n)
		int contador=0;									 		
		for (int i = 0; i < n; i++) {															
			System.out.println(i);	//n					
		}   									   							
		for (int j = 0; j < n; j++) {					
			System.out.println(j);	//n
		}   
		//2*n
		//En este caso son 2 for separados, por lo que el tiempo de cada uno es de O(n)
		//obteniendo como resultado final O( 2 * n ), quitando la constante seria O(n)
		//A10: O(n)
	}
	public static void Q11LogLogTime(int n) {
		//Q11: What is the time complexity of? O(log log(n))
		int contador=0;
		int p = 0;
		for(int i = 1; i < n; i = i * 2) { // For "log_2(n)"
			p++;	// Acumula en p 
		}
		System.out.println("Acumulado: " + p);
		for(int j = 1; j < p; j = j * 2) { // For "log_2(p)"
			contador++;	// O(1)
		}
		System.out.println("Acumulado: " + contador);
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
	public static void Q12Log(int n) {

		//Q12: What is the time complexity of? O(n log(n))
		int contador=0;

	}
	/* Review
	 * for (i = 0; i < n; i++)       // O(n)
	 * for (i = 0; i < n; i=i+2)     // O(n)
	 * for (i = n; i >= 1; i--)      // O(n)
	 * for (i = 1; i < n; i=i*2)     // O(log_2(n))
	 * for (i = 1; i < n; i=i*3)     // O(log_3(n))
	 * for (i = n; i >= 1; i=i/2)    // O(log_2(n))
	 */
}
