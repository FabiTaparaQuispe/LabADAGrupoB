package Clase_10_06-12-2021;
/* 
 * Ejercicio 2 Tie Ropes
 * Autor: Fabiola Tapara Quispe
 * Descripcion: El problema consiste en unir la cuerda. En caso de
 * ser adyacente y"k" que es la longitud minima que se quiere obtener
 * al amarrar todos los pedazos de cuerda. Devuelve el maximo de cuerdas
 * posibles
 * Fecha: 6/12/21 
 */
public class E2_TieRopes {
	public static void main(String[] args) {
		int A []= {1,2,3,4,1,1,3};
		System.out.println(solution(4,A));
	}
	public static int solution(int k, int[] a) {
		int countRopes = 0;// numeros de cuerdas amarradas respecto a K
		int ropeTam = 0;// guarda el tamanio de la cuerda amarrada actual
		for(int i = 0; i < a.length; i++) {// Iteraremos sobre todas las cuerdas
			ropeTam += a[i];// Agregamos la longitud de la cuerda actual
			if(ropeTam >= k) {// Si el tamanio es mayor o igual al valor de K
				ropeTam = 0;// Actualiza el tamanio de la cuerda amarrada actual
				countRopes++;// Agregamos una cuerda que cumple
			}
		}
		return countRopes;//devolvemos el total de cuerdas que cumplen
	}
}
