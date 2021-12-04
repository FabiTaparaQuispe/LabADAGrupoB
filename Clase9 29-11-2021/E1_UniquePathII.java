package Clase9 29-11-2021;
/* 
 * Ejercicio 1 Unique Path II
 * Autor: Fabiola Tapara Quispe
 * Descripcion: Un robot está ubicado en la esquina superior izquierda 
 * de una cuadrícula de m x n. El robot solo puede moverse hacia abajo 
 * o hacia la derecha en cualquier momento. El robot está tratando de 
 * llegar a la esquina inferior derecha de la cuadrícula. 
 * Fecha: 2/12/21 
 */
public class E1_UniquePathII {
	//caso de prueba
	public static void main(String[] args) {
		//caso de prueba
		int obstacleGrid [][] = {{0,0,0},{0,1,0},{0,0,0}};
		print(obstacleGrid);
		System.out.println("N Caminos: " + uniquePathsWithObstacles(obstacleGrid));
	}
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		//Este metodo recibe el arreglo bidimensional, la matriz
		int fila = obstacleGrid.length, col = obstacleGrid[0].length;
		System.out.println("Fila: " + fila + ", Columnas: " + col);
		int[][] caminos = new int[fila][col];
		//Iteramos para poder encontrar los posibles caminos para llegar al destino	
		for (int j = 0; j < obstacleGrid.length; j++) {
			for (int i = 0; i < obstacleGrid[j].length; i++) {
				// Verificamos si es un obstaculo
				if (obstacleGrid[j][i] == 1) {//lenamos la primera fila y columna de uno
					caminos[j][i] = 0;//si se encuantra un obstaculo cambia a cero
					continue;
				}
				// solo nos podemos mover hacia abajo y derecha
				// las posiciones son: arriba e izquierda
				if (i - 1 < 0 && j - 1 < 0) {
					caminos[j][i] = 1;					
				} else if (i - 1 < 0) {// lado izquierdo
					caminos[j][i] = caminos[j - 1][i]; 
				} else if (j - 1 < 0) {
					caminos[j][i] = caminos[j][i - 1];
				} else {
					caminos[j][i] = caminos[j - 1][i] + caminos[j][i - 1];
				}
			}
		}
		//print(caminos);
		// Devolvemos el contenido de la ultima celda 
		return caminos[fila - 1][col - 1];
	}

	// Para imprimir la matriz inicial 
	public static void print(int [][] caminos){

		for (int i = 0; i < caminos.length; i++) {
			System.out.println();
			for (int j = 0; j < caminos[i].length; j++) {
				System.out.print(caminos[i][j] + "\t");
			}
		}
		System.out.println();
	}
}


