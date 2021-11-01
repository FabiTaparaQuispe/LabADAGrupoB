package Lab5;

public class E4_find_needle {
	public static void main( String[] args )  {
		int[] numeros = new int[] { 1,2,3,4,5,6};
		System.out.println("¿Existe una suma que da 10? " + find_needle(numeros));
		
	
	}
	public find_needle(String[] h, String[] m) {
		
	//Este metodo itera por cada elemento del arreglo y 
	//verifica si existe una suma que den una suma de 10
	for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a.length; y++) {

				if(x != y && (a[x] + a[y] == 10)) {
					System.out.println("La suma que se encontro: " + a[x] + " + "
							+ a[y] + " = " + (a[x] + a[y]));
					return true; 	

				}
			}
		}
	return false;
	}
}
