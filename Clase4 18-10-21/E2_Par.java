package Clase4 18-10-21;

import java.util.Scanner;

public class E2_Par{
	public static void main( String[] args )  {
		int[] numeros = new int[] { 1,2,3,4};
		int par = numeros[0];
		for (int x = 1; x < numeros.length; x++) {
			if ( x % 2 == 0 ) {
				for (int y = 1; x < numeros.length; x++) {
					System.out.println(numeros[x]+numeros[y]);
				}
				System.out.println("\n");
			}
		}
	}
}
