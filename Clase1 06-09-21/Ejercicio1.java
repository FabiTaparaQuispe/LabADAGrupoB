//Ejercicio1
/*Leer n números en un array y retornar la suma de los mismos */

import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args) {
		int suma = 0;
		System.out.println("ingresa la cantidad de numeros del array");
		Scanner ent = new Scanner(System.in);
		int n = ent.nextInt();
		int [] arreglo = new int[n];

		for(int i = 0; i < n; i++) {

			System.out.println("Ingresa el "+(i+1)+" numero:");
			arreglo[i] = ent.nextInt();
			suma += arreglo[i];

		}
		System.out.println("la suma de los numeros es: "+suma);
	}
}
