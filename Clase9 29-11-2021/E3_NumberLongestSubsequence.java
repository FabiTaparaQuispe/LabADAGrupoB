import java.util.Arrays;

/* 
 * Ejercicio 3 Number of Longest Increasing Subsequence
 * Autor: Fabiola Tapara Quispe
 * Descripcion: Dada una matriz de números enteros, devuelve la 
 * longitud de la subsecuencia estrictamente creciente más larga.
 * Una subsecuencia es una secuencia que se puede derivar de una 
 * matriz eliminando algunos elementos o ninguno. sin cambiar el 
 * orden de los elementos restantes. 
 * Fecha: 3/12/21 
 */
public class E3_NumberLongestSubsequence {
	public static void main(String[] args) {
		//caso de prueba
		int [] numbers = {10,9,2,5,3,7,101,18};
		System.out.println("Explanation");
		System.out.println("The longest increasing subsequence is ");
		System.out.println("la cadena más larga es de : " + lengthOfLIS(numbers));
	}
	public static int lengthOfLIS(int[] numbers) {
		int num = numbers.length;// tamano del arreglo
		if(num == 0) {		
			return 0;//si no tiene elementos
		}
		int[] aux = new int[num];// arreglo donde se guarda la cadena más larga por item
		Arrays.fill(aux, 1);//llenado de caso base, dado que todos empiezan en 1
		int maxValue = 1;
		for(int i=1; i < num; i++){
			for(int j=0; j <= i-1; j++){
				if(numbers[i] > numbers[j])// si el actual es menor
					aux[i] = Math.max(aux[i], aux[j] + 1);// si aux[i] es menor a aux[j] + 1, se reemplazara 
			}
			maxValue = Math.max(maxValue, aux[i]);//caso contrario
		}
		//seguimiento
		for (int i : aux) {
			System.out.println(i);
		}
		return maxValue;
	}
}
