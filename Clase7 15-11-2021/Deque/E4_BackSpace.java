package Deque;
import java.util.LinkedList;
/* 
 * Ejercicio 4 BackSpace
 * Autor: Fabiola Tapara Quispe
 * Description:  Implementar un teclado especial con el caracter '#'
 * indica eliminar el caracter anterior usando la estructura Deque.
 * Date: 15/11/21 
 */
class E4_BackSpace {
	public static void main(String[] args) {
		//caso de prueba
		String texto = "abc#de##f#ghi#jklmn#op#";
		System.out.println(backSpace(texto));
	}

    private static String backSpace(String str) {
    	LinkedList<Character> myDeque = new LinkedList<Character>();
        for (char especialCh: str.toCharArray()) {
            if (especialCh != '#') { //si es diferente a #
                myDeque.push(especialCh); //lo encola
            } else if (!myDeque.isEmpty()) {//verifica que no este vacio
                myDeque.pop();//si es "#" elimina al anterior
            }
        }
        System.out.println("Respuesta: ");
        StringBuilder str_Builder = new StringBuilder();
        while (!myDeque.isEmpty()) {
        	str_Builder.append(myDeque.pop());//recorre la cola
        }
        //toString
        return str_Builder.reverse().toString();//para imprimir la respuesta 
    }
}
