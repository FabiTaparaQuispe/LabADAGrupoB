/* 
 * Ejercicio 2 Book Shop
 * Autor: Fabiola Tapara Quispe
 * Descripcion: Estás en una librería que vende "n" libros diferentes. 
 * Sabes el precio y el número de páginas de cada libro. Ha decidido
 * que el precio total de sus compras será como máximo "x". 
 * Cual es el maximo número de páginas que puedes comprar? 
 * Puedes comprar cada libro como máximo una vez. 
 * Fecha: 29/11/21 
 */
import java.util.*;
public class BookShop {
	public static void main(String[] args) {
		//Se uso Scanner para que la pagina de prueba haga las revisiones 
		Scanner s = new Scanner(System.in);
		//System.out.println("Ingrese la cantidad de libros: ");
		int booksNumber = s.nextInt();
		//System.out.println("Ingrese el precio maximo: ");
		int maxPrice = s.nextInt();
		//System.out.println("La cantidad de paginas maxima a comprar es: "+bookshop(n, x));
		int [] priceBook = new int [booksNumber + 1];    
		int [] pagesBook = new int [booksNumber + 1];
		for(int i = 0; i < booksNumber; i++) {
			//System.out.println("Ingrese el precio del libro: ");
			priceBook[i] = s.nextInt();
		}
		for(int i = 0; i < booksNumber; i++) {
			//System.out.println("Ingrese el numero de paginas del libro: ");
			pagesBook[i] = s.nextInt();
		}
		fillTable(booksNumber, maxPrice, priceBook, pagesBook);
	}

	public static void fillTable(int booksNumber, int maxPrice, int [] priceBook,int [] pagesBook) {
		/*Este metodo recibe el max num. de libros, monto max a pagar, precios de los libros y numero de paginas 
		 *Devuelve la cantidad maxima de paginas.*/
		int [][] matriz = new int [booksNumber + 1][maxPrice + 1];
		for (int i = 0; i < booksNumber; i++) { 
			for (int j = 0; j <= maxPrice; j++) { 
				matriz[i + 1][j] = matriz[i][j];
				if(priceBook[i]<=j){ // Comparación si el valor del libro es menor a la cantidad que se desea cambiar
					matriz[i+1][j] = Math.max(matriz[i+1][j], matriz[i][j-priceBook[i]] + pagesBook[i]); 
				} 
			} 
		}
		System.out.println(matriz[booksNumber][maxPrice]);
	}
}

