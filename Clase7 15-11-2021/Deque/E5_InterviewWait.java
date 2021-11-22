package Deque;
import java.util.Deque;
import java.util.LinkedList;

/* 
 * Ejercicio 5 InterviewWait
 * Autor: Fabiola Tapara Quispe
 * Descripcion: El ejercicio trata sobre esperar para ser entrevistados.
 * Se guarda los tiempos que demora el entrevistador, "-1" es el numero final
 * Se iran escogiendo los menores de los extremos. Nos pide el tiempo a esperar
 * Date: 15/11/21 
 */
public class E5_InterviewWait {
	public static void main (String[]args){
		Deque<Integer> myDeque = new LinkedList<Integer>();	
		//caso de prueba visto en clase
		int [] array = {4,-1,5,2,3};
		for(int i = 0; i < array.length; i++){
			myDeque.addLast(array[i]);
		}
		//imprimimos el tiempo esperado
		System.out.println("Cantidad de tiempo: " + interviewVait(myDeque));
	}

	private static int interviewVait(Deque<Integer> myDeque){
		// Encolamos los tiempos en una cola doble
		System.out.println("Cola de entrevistados: " + myDeque);
		int acumulado = 0;
		while(true){
			if(myDeque.peek() == -1 || myDeque.peekLast() == -1){
				break;//yo soy -1, rompe pues me toca ser entrevistado
			}
			if(myDeque.peek() < myDeque.peekLast()){//extremos fin
				acumulado += myDeque.pollFirst();//extremos inicio
			}
			else {
				acumulado += myDeque.pollLast();
			}
		}
		return acumulado;
	}
}
