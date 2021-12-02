package Clase8 29-11-2021;
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
		int obstacleGrid [][] = {{0,0,0},{0,1,0},{0,0,0}};
		matriz(obstacleGrid);
		print(obstacleGrid);
		System.out.println("N Caminos: " + uniquePathsWithObstacles(obstacleGrid));
	}
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		//este metodo devuelve el numero de caminos
		int o = obstacleGrid[0].length;//matriz "o"
		int [] auxiliar = new int [o];//variable auxiliar para las comparaciones
		auxiliar[0]=1; //inicializo en 1  
		//se establen parametros, se modifica la entrada

		for(int i = 0; i < obstacleGrid.length; i++) {
			for(int j = 0 ; j < o; j ++) {
				if(obstacleGrid[i][j]==1) {
					auxiliar[j] = 0;
				}
				else { // esto sera para j >0
					if(j > 0) {
						auxiliar[j] += auxiliar[j-1];
					}
				}
			}
		}
		return auxiliar[o-1];
	}
	public static void matriz(int [][] o){
		o[1][1] = 1;// llenado de la matriz inicial
	}

	// Para imprimir la matriz inicial 
	public static void print(int [][] all){
		for (int i = 0; i < all.length; i++) {
			System.out.println();
			for (int j = 0; j < all[i].length; j++) {
				System.out.print(all[i][j] + "\t");
			}
		}
		System.out.println();
	}
}

