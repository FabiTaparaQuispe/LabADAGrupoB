package Clase5 25-10-21;
/* 
 * Question N3
 * Autor: Fabiola Tapara Quispe
 * Description: Review of Time Complexity
 * 		Implementar el ejercicio 3 del algoritmos 
 * visto en clase para calcular el tiempo computacional
 * Date: 25 october
 */
public class Q03_mitad {
	public static void main(String[] args) {
		System.out.println("Casos de prueba Complexity Time");
		System.out.println();
		System.out.println("Ejercicio3");
		System.out.println("con n=2");
		Q3Mitad(2);
		System.out.println();
		System.out.println("con n=4");
		Q3Mitad(4);
	}

	public static void Q3Mitad(int n) {
		//Q3: What is the time complexity of? O(n)
		// A3: O(n)
		// It can be 2, 20, etc
		//0 2 4 6 ... n - 2
		//O(n)*1/2 = O(n) por ser 1/2 una constante
		int contador=0;
		for (int i = 0; i < n; i=i+2) { 
			contador++; //O(n/2) 
			System.out.println(i);
		}
		System.out.println("Numeros repetidos: " + contador);
	}
}
