package Clase3 27-09-21;

import java.util.*;

class E3_GaleShapley {

	static int N = 5;//N es el num de mujeres u hombres
	/*m=mujer
	 *H1= Hombre actual(pareja actual)
	 *H = Hombre nuevo(nueva propuesta)*/
	static boolean mPreferH1sobreH(int prefer[][], int m,int h, int h1){
		//Este metodo retorna true si m prefiere a H1 sobre H
		for (int i = 0; i < N; i++) {
			
			/* Si H1 esta antes que H en la lista de preferencia de m,
			 * luego m prefiere a su actual pareja, retorna true*/
			if (prefer[m][i] == h1)
				return true;
				//System.out.println("La pareja que " + m + " prefiere es " + h1);
			/* Si H esta antes que H1 en la lista de preferencia de m,
			 * m deja a su actual pareja y se empareja con H retorna false*/
			if (prefer[m][i] == h)
				System.out.println("La pareja que " + m + " prefiere es " + h);
				return false;
		}
		return false;
	}
	/*Imprime a las N parejas, los hombres estan numerados de 0 a N-1
	 *Las mujeres de N a 2N-1*/
	static void emparejamientoEstable(int prefer[][]) {
		/*Almacena a las parejas de las mujeres, mPareja[]: es un array
		 * de salida que almacena informacion temporal, indica la pareja
		 * asignada a la mujer N + i. El valor -1 indica que la mujer de
		 * la posicion (N + i) esta libre*/
		int mPareja[] = new int[N];
		/*  hLibre []: es un array para almacenar la disponibilidad de los 
		 * hombres. Si hLibre [i] es falso, entonces el hombre en la posicion
		 * 'i' esta libre, de lo contrario esta comprometido.*/
		boolean hLibre[] = new boolean[N];
		// Inicializa a todos los hombres y mujeres como libres '-1' 
		Arrays.fill(mPareja, -1);
		int nLibre = N;
		//Mientras haya hombres libres 
		while (nLibre > 0) {
			System.out.println("\nSe reportan hombres sin pareja");
			// Elige al primer hombre libre (podríamos elegir cualquiera) 
			int h;

			for (h = 0; h < N; h++)
				
			if (hLibre[h] == false)

				break;
			/*Recorre a todas las mujeres según las preferencias de h.
			 *Aquí h es el hombre libre elegido */
			for (int i = 0; i < N && hLibre[h] == false; i++) {
				System.out.println("El hombre "+h+" Esta emparejado? "+hLibre[h]);	
				int m = prefer[h][i];
				System.out.println("m = " + prefer[h][i]);
				/*La mujer de preferencia es libre, myh emparejan
				 *(la pareja puede cambiar más tarde)*/
				if (mPareja[m - N] == -1) {
					mPareja[m - N] = h;
					hLibre[h] = true;
					nLibre--;
				}

				else {// Si m no esta libre
					// Busca el compromiso actual de m
					int h1 = mPareja[m - N];
					/* Si m prefiere a h sobre su actual compromido h1,
					 * se rompe su compromiso entre m y h1 y se 
					 * empareja h con m.*/
					if (mPreferH1sobreH(prefer, m, h, h1) == false) {
						//System.out.println("El hombre "+h+" Esta emparejado? "+hLibre[h]);
						mPareja[m - N] = h;
						hLibre[h] = true;
						hLibre[h1] = false;
					}
				} 
			}
		} 
		System.out.println("Mujer Hombre");
		for (int i = 0; i < N; i++) {
			System.out.print(" ");
			System.out.println(i + N + "     " + mPareja[i]);
		}
	}

	public static void main(String[] args) {
		int prefer[][] = new int[][]{
			{9, 5, 6, 8, 7},
			{7, 6, 8, 5, 9},
			{6, 7, 8, 9, 5},
			{5, 9, 8, 7, 6},
			{8, 6, 9, 7, 5},
			{1, 0, 3, 4, 2},
			{3, 1, 0, 2, 4},
			{1, 4, 2, 3, 0},
			{0, 3, 2, 1, 4},
			{1, 3, 0, 4, 2}
		};
		emparejamientoEstable(prefer);
	}
}

