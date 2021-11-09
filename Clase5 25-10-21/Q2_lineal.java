package Clase5 25-10-21;

public class Q2_lineal {
	public static void main(String[] args) {
		//Casos de prueba Complexity Time
		System.out.println("Ejercicio2");
		Q2lineal(2);
		Q2lineal(4);
		Q2lineal(8);
		Q2lineal(16);
	}
	
	public static void Q2lineal(int n) {
		//Q2: What is the time complexity of? O(n)
    //Codigo individual
		int contador=0;
		for (int i = n; i > 0; i--) { // Decrementa i-- O(n)
			contador++;   // O(n)        
		}
		System.out.println("Acumulado: " + contador);
	}
}
