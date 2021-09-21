/*Leer 3 números y mostrarlos en orden ascendente*/

import java.util.Scanner;
public class Ejercicio4 {
	int a, b, c;
	Scanner entrada = new Scanner(System.in);
	public void ingresarnumeros() {
		System.out.println("Por favor ingrese 3 numeros");
		System.out.print("Ingrese numero 1: ");
		a = entrada.nextInt();
		System.out.print("Ingrese numero 2: ");
		b = entrada.nextInt();
		System.out.print("Ingrese numero 3: ");
		c = entrada.nextInt();     
	}

	public void ordenar() {
		if(a>b) {
			if(a>c) {
				if(b>c) {
					System.out.println("Orden Ascendente: " + c + " " + b + " " + a);             
				}else {
					System.out.println("Orden Ascendente: " + a + " " + c + " " + b);
				}
			}else {
				System.out.println("Orden Ascendente: " + b + " " + a + " " + c);
			}
		}else {
			if(b>c) {
				if(a>c) {
					System.out.println("Orden Ascendente: " + c + " " + a + " " + b);
				}else {
					System.out.println("Orden Ascendente: " + a + " " + c + " " + b);
				}              
			}else {
				System.out.println("Orden Ascendente: " + a + " " + b + " " + c);
			}
		}
	}

	public static void main(String[] args) {
		Ejercicio4 ascendente = new Ejercicio4();
		ascendente.ingresarnumeros();
		ascendente.ordenar();
	}
}
