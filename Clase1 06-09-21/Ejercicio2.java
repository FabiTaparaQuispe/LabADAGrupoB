/*Leer n números en un array y mostrarlos en orden inverso */

import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner ent  = new Scanner(System.in);
		System.out.print("Ingresa la cantidad de numeros del array: ");
		int n = ent.nextInt();
		int [] arreglo = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Ingresa el "+(i+1)+" numero:");
			arreglo[i] = ent.nextInt();
		}
		System.out.println("Imprimiendo orden inverso");
        for (int i = arreglo.length - 1; i >= 0 ; i--) {
            System.out.println(arreglo[i]);
        }
	}
}
