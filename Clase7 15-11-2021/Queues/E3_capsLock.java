/* 
 * Ejercicio 3 Caps Lock
 * Autor: Fabiola Tapara Quispe
 * Descripcion: Ingresar una cadena con caracteres especiales'$' para guardarlo 
 * en la salida, y '@' para transformar el caracter en mayuscula usando una cola. 
 * Date: 15/11/21 
 */

import java.util.LinkedList;
import java.util.Queue;

public class E3_capsLock {
	public static void main(String[] args) {
		String texto = "abc$d@ef$@g$";
		capsLock(texto);
	}

	public static void capsLock(String str) {
		Queue<Character> myQueue = enQueue(str);
		System.out.println("Texto: " + myQueue);
		String rpta = "", buffer = "";
		boolean toUpperCase = false;
		while(!myQueue.isEmpty()) {
			Character specialCh = myQueue.poll();
			if(specialCh == '$') {
				if(toUpperCase) {
					buffer = buffer.toUpperCase();
				} 
				rpta += buffer;
				buffer = "";
				System.out.println("Resultado: " + rpta);
			} else if(specialCh == '@') { 
				toUpperCase = !toUpperCase;
			} else {
				buffer += specialCh;
			}
		}
	}

	public static Queue<Character> enQueue(String str) {
		Queue<Character> queue = new LinkedList<Character>();
		for(Character c : str.toCharArray()) {
			queue.add(c);
		}
		return queue;
	}
}
