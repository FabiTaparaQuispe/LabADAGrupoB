package Lab5;

/* 
 * Ejercicio 4 Find_needle
 * Autor: Fabiola Tapara Quispe
 * Description:  Encontrar la aguja(cadena1) en el pajar(cadena2)
 * Question: What is the complexity in terms of O()?
 * Answer: La complejidad es de O(haystack.length * needle.length)
 */
public class E4_find_needle {
	public static void main( String[] args )  {
		String cadena1 = "fgh";
		String cadena2 = "abcdefghi";
		System.out.println( cadena1+" se encuentra en " + cadena2 + " ? " + E4_find_needle(cadena1, cadena2));

	}
	public static boolean E4_find_needle(String needle, String haystack) {

		int needle_index = 0;
		int haystack_index = 0;

		boolean found_needle = false;

		while(haystack_index < haystack.length()) { //Va iterando---> O(1)
			// Compara las letras que aun no fueron revisadas con las de la aguja
			if(needle.charAt(needle_index) == haystack.charAt(haystack_index)) {
				found_needle = true;
				while(needle_index < needle.length()) { //Va iterando sobre la aguja---> O(2)
					// Si algun caracter de la aguja no coincide con la palabra completa terminara el ciclo
					if(needle.charAt(needle_index) != haystack.charAt(haystack_index + needle_index)) {				
						found_needle = false;
						break;
					}	
					needle_index++;
				}
				// Si se encontro la aguja dentro del pajar, indicara la posicion 
				if(found_needle) {
					System.out.println("Posicion: "+ needle + " en " + haystack_index);
					return true;
				}
			}
			needle_index = 0;
			haystack_index++;
		}
		return false;
	}
	/* Calculando el tiempo computacional:
	 * Explicacion: Se busca la subcadena en la posicion 1 y en esa posicion busca 
	 * la siguiente cadena. Es decir, en la primera posicion de la palabra busca 
	 * la secuencia de la aguja posicion por posicion e itera hasta que la encuentra 
	 * o que los caracteres de la palabra sean menores que los caracteres de la aguja
	 * 
	 * Quedaria:
	 * 
	 * n * O(needle.length) = O(haystack.length * needle.length)
	 * 
	 * Answer: La complejidad es de O(haystack.length * needle.length)
	 */
	
}

