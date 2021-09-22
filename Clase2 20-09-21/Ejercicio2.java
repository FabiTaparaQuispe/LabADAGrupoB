package Clase2 20-09-21;

import java.util.*;
public class Ejercicio2{
	/* El ejercicio pide buscar un elemento dentro de un
	 * arreglo de enteros estandar. Usando el metodo de Busqueda Lineal */
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite el numero a buscar: ");
		int n = scan.nextInt();
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("El numero "+ n + " esta en el arreglo? "+ linealSearch(a, n));

	}

	public static boolean linealSearch(int [] a, int n){
		/*Metodo linealSearch recibe como argumentos un arreglo y un entero 
		que a buscar dentro del arreglo. Al ser booleano devuelve true si 
		se encuentra dentro del arreglo y false si no se encuentra*/
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				return true;
			}
		}
		return false;
	}
}
