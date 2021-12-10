package Clase_10_06-12-2021;
/* 
 * Ejercicio 1 
 * Autor: Fabiola Tapara Quispe
 * Descripcion: Sean los arreglos A y B, nos pide hallar la mayor
 * cantidad de segmentos que podemos juntar sin que se sobrepongan
 * Fecha: 6/12/21 
 */
public class E1_MaxNonoverlappingSegments {
	public static void main(String[] args) {
		//casos de prueba
		int A []= {1, 3, 7, 9, 9};
		int B [] = {5, 6, 8, 9, 10};
		System.out.println(solution(A, B));
	}
	public static int solution(int[] A, int[] B) {
		/* Aarreglos con posiciones inciales y finales de segmentos 
		 * Devuelve el num max de segmentos que podemos juntar sin que
		 * se sobrepongan  */
		int size = A.length;//tamanio del vector A
		if (size <= 1) {
			return size;
		}

		int startIndex = B[0];//Variable para la posicion inicial
		int segmentAcumu= 1;//Se acumula la cantidad de segmentos
		
		// Iteramos sobre todos los segmentos del arreglo
		for (int i = 1; i < size; i++) {
			if (A[i] > startIndex) {// si el valor del A[i] es mayor entonces no se sobreponen 
				startIndex = B[i];// se actualiza el valor actual al valor final 
				segmentAcumu++;//aumenta segmentos acumulados
			}
		}        
		return segmentAcumu;// devolvemos la cantidad de segmentos que cumplen
	}

}

