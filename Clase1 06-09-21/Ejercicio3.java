/*Leer n números y separarlos según si son pares e impares*/

import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner ent  = new Scanner(System.in);
		System.out.print("Ingresa la cantidad de numeros del array: ");
		int n = ent.nextInt();
		int [] arreglo = new int[n];
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("Ingresa el "+(i+1)+" numero:");
			arreglo[i] = ent.nextInt();
		}
		String Numberpar = "Numero par: ";
		String Numberimpar = "Numero impar: ";
		for (int i = 0; i < n; i++) {
			if(arreglo[i] % 2 == 0) {
				Numberpar += arreglo[i] + ", ";
			}
			else {
				Numberimpar += arreglo[i] + ", ";
			}
		}
		System.out.println(Numberpar);
		System.out.println(Numberimpar);
	}
}
