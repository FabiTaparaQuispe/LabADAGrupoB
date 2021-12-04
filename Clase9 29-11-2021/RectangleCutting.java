/* 
 * Ejercicio 4 Rectangle Cutting
 * Autor: Fabiola Tapara Quispe
 * Descripcion: Dado un rectángulo a × b, su tarea es cortarlo en cuadrados. 
 * En cada movimiento puede seleccionar un rectángulo y córtelo en dos 
 * rectángulos de tal manera que todas las longitudes de los lados sigan
 * siendo números enteros. Cuál es el número mínimo posible de movimientos?
 * Fecha: 3/12/21 
 */
import java.util.*;
public class RectangleCutting {
	public static void main (String[]args){
	    Scanner scan = new Scanner(System.in);
	    // introduccion de los datos
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    System.out.println(minimumSquare(a, b));
	}
	public static int minimumSquare(int a, int b){
		//Este metodo recibe el numero de filas y columnas del rectangulo 
		int [][] aux = new int [a][b];//Creo un arreglo bidimensional auxiliar
		fill(aux);
		for (int fil = 0; fil < aux.length; fil++) {//iteramos sobre las posiciones del rectangulo
			for (int col = 0; col < aux[fil].length; col++) {
				if(fil == col){//caso base
					aux[fil][col] = 0;//inicia en cero
				}
				else {
					for (int x = 0; x < fil; x++) { // posibles cortes en vertical
						// Guardamos los cortes en vertical en la variable auxiliar
						aux[fil][col] = Math.min(aux[fil][col], 1 + aux[fil - x - 1][col] + aux[x][col]);
					}
					for (int y = 0; y < col; y++) {// posibles cortes en horizontal
						// Guardamos los cortes en horizontal en la variable auxiliar
						aux[fil][col] = Math.min(aux[fil][col], 1 + aux[fil][col - y - 1] + aux[fil][y]);
					}
				}
			}
		}
		return aux[a-1][b-1];//devuelve el minimo de cortes
	}
	private static void fill(int [][] matriz){//llenado de la matriz 
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) Double.POSITIVE_INFINITY;
			}
		}
	}

}
