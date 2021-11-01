package Clase5 25-10-21;

public class E5_pick_resume {
	/* 
	 * Ejercicio 5 pick_resume
	 * Autor: Fabiola Tapara Quispe
	 * Description: Reduccion de una cadena separando sus elemetos
	 * Question: What is the complexity in terms of O()?
	 * Answer: La complejidad es de O(log2(n))
	 */
	public static void main(String[] args) {
		String word = "anything"; // caso de prueba
		pick_resume(word);
	}

	public static void pick_resume(String resumes) {
		String eliminate = "top";
		while(resumes.length() > 1) {//while se da hasta que la longitud resumes sea mayor a 1
			System.out.println("Word: " + resumes);
			if (eliminate.equals("top")) {
				resumes = resumes.substring(resumes.length() / 2, resumes.length());
				eliminate = "bottom";
			}
			else if (eliminate.equals("bottom")) {
				resumes = resumes.substring(0, resumes.length() / 2);
				eliminate = "top";
			}
		}
		System.out.println("Summary: " + resumes);
	}

	/* Explicacion:
	 * En cada ejecucion la cantidad de caracteres de una palabra se reduce a su mitad,
	 * debido a que el while dura hasta que la longitud "resume" sea mayor a 1.
	 * Seria como un arbol con profundidad 2: log_2(n)
	 * Calculos como se vio en el Ejercicio 7 de los ejercicios de Time Complexity	
	  
	  	i       
		------------------------
		1       
		1 * 2 = 2
		2 * 2 = 2^2
		2 * 2^2 = 2^3
		.    
		.    
		.    
		2^k
		El valor inicial es i = 1, se va multiplicando por 2 sucesivamente
		hasta llegar a 2^k

		Assume i >= n
		Therefore i = 2^k
	    	2^k >= n
	    	2^k = n
	   		  k = log_2(n)
		complexity = O(log_2(n))
	 * Answer: La complejidad es de O(log2(n))
	 */
}

