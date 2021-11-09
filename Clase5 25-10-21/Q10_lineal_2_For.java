package Clase5 25-10-21;
/* 
 * Question N10
 * Autor: Fabiola Tapara Quispe
 * Description: Review of Time Complexity
 * 				Implementar el ejercicio 10 del algoritmos 
 * visto en clase para calcular el tiempo computacional
 * Date: 25 october
 */
public class Q10_lineal_2_For {
	public static void main(String[] args) {
		System.out.println("Casos de prueba Complexity Time");
		System.out.println();
		System.out.println("Ejercicio10");
		System.out.println("con n=2");
		Q10Linel2For(2);
		System.out.println();
		System.out.println("con n=6");
		Q10Linel2For(6);
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
}
