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
		String texto = "abc$d@ef$@g$"; //caso de prueba
		capsLock(texto);
	}

	public static void capsLock(String str) {
		Queue<Character> myQueue = enQueue(str);
		System.out.println("Texto: " + myQueue);//imprimimos la cola y su contenido
		String rpta = "", text = ""; //vacio en un inicio
		boolean toUpperCase = false;// mayusculas desactivadas
		while(!myQueue.isEmpty()) {
			Character specialCh = myQueue.poll(); //desencola
			if(specialCh == '$') { //desactiva
				if(toUpperCase) { //devolver en mayuscula
					text = text.toUpperCase();
				} 
				rpta += text;//acumula el texto liberado con $
				text = "";
				System.out.println("Resultado: " + rpta);
			} else if(specialCh == '@') { //lo vuelve en mayuscula
				toUpperCase = !toUpperCase;
			} else {
				text += specialCh;
			}
		}
	}

	public static Queue<Character> enQueue(String str) { //metodo que devuelve la cola resultante
		Queue<Character> queue = new LinkedList<Character>();
		for(Character c : str.toCharArray()) {
			queue.add(c);
		}
		return queue;
	}
}
