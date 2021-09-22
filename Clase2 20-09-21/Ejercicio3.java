package Clase2 20-09-21;
import java.util.Scanner;

public class Ejercicio3 {
	/* El ejercicio pide ordenar un arreglo de numeros usando ordenacion
	 * por insercion y mostrarlo ordenado */
	public static void main(String[] args) {

		Scanner s= new Scanner (System.in);
		int a[],n,k,t;
		System.out.println("Digite el numero de elementos del arreglo:  ");
		n = s.nextInt();
		a=new int[n];
		System.out.println("Digite el arreglo: ");
		for(int i=0;i<n;i++) {
			System.out.print((i+1)+". Digite un numero: ");
			a[i]=s.nextInt();
		}

		for(int i=0;i<n;i++) {
			k = i;
			t = a[i];
			while(k	>0 && a[k-1]>t) { 
				a[k]=a[k-1];
				k--;

			}
			a[k]=t;
		}
		System.out.print("\nOrden Ascendente: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" - ");
		}
		System.out.println("");
	}
}
