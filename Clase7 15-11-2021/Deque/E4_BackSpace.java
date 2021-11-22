package Deque;
import java.util.LinkedList;
/* 
 * Ejercicio 4 BackSpace
 * Autor: Fabiola Tapara Quispe
 * Description:  Implementar un teclado especial con el caracter '#'
 * indica eliminar el caracter anterior usando la estructura Deque.
 * Date: 15/11/21 
 */
class Solution {
	public static void main(String[] args) {
		String texto = "abc#de##f#ghi#jklmn#op#";
		System.out.println(build(texto));
	}

    private static String build(String s) {
    	LinkedList<Character> myDeque = new LinkedList<Character>();
	
        for (char especialCh: s.toCharArray()) {
            if (especialCh != '#') {
                myDeque.push(especialCh);
            } else if (!myDeque.isEmpty()) {
                myDeque.pop();
            }
        }
    	System.out.println("Texto al reves: " + myDeque + "\n");
        System.out.println("Respuesta: ");
        StringBuilder sb = new StringBuilder();
        while (!myDeque.isEmpty()) {
            sb.append(myDeque.pop());
        }
        
        return sb.reverse().toString();
    }
}
