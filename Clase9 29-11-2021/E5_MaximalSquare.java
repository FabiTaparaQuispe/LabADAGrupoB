package Clase9 29-11-2021;
/* 
 * Ejercicio 5 Maximal Square
 * Autor: Fabiola Tapara Quispe
 * Descripcion: Dada una matriz binaria m x n llena de ceros y unos,
 * encuentre el cuadrado más grande que contenga solo unos y devuelva
 * su area
 * Fecha: 3/12/21 
 */
public class E5_MaximalSquare {
	public static void main(String[] args) {
		char [][] table = {{'1','0','1','0','0'},{'1','0','1','1','1'},
				{'1','1','1','1','1'},{'1','0','0','1','0'}};
		System.out.println("Output: " + maximalSquare(table));
		print(table);
	}
	//para imprimir el caso de prueba
	private static void print(char[][] table) {
		for (int i = 0; i < table.length; i++) {
			System.out.println();
			for (int j = 0; j < table.length; j++) {
				System.out.print(table[i][j] + "  ");
			}
		}
		System.out.println();	
	}

	public static int maximalSquare(char[][] matriz) {

		//Este metodo recibe una matriz de ceros y unos


		int rows = matriz.length;    
		if(rows == 0) {// Si es cero entonces es vacia, devuelve cero
			return 0;
		}
		int columns = rows > 0 ? matriz[0].length : 0;// Guardamos el num. de columnas de la matriz
		int[] aux = new int[columns + 1];// Matriz auxiliar de dimensiones
		int maximumSize = 0;//guarda el lado mas grande en la matriz
		int maxSquare = 0;//inicia en cero auxiliar
		for (int i = 1; i <= rows; i++) {//recorrido y evaluacion de la matriz
			for (int j = 1; j <= columns; j++) {
				int temp = aux[j];
				if (matriz[i - 1][j - 1] == '1') {// Si la celda en revision == '1'
					// Rescatamos los valores minimos de sus alrededores y sumamos 1
					aux[j] = Math.min(Math.min(aux[j - 1], maxSquare), aux[j]) + 1;
					maximumSize = Math.max(maximumSize, aux[j]);// Actualizando el valor del lado mas grande 
				} else {
					aux[j] = 0;
				}
				maxSquare = temp;
			}
		}
		// devuelve el area mas grande del cuadrado encontrado
		return maximumSize * maximumSize;
	}
}
