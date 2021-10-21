package Clase4 18-10-21;

public class E3_twoSum {
	public static void main( String[] args )  {
		int[] numeros = new int[] { 1,2,3,4,5,6};
		twoSum(numeros);
	
	}
	public static boolean twoSum(int[]a) {
	for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a.length; y++) {

				if ( x !=y&&a[x] +a[y]==10 ) {
					return true; 	

				}
				System.out.println("\n");
			}
		}
	return false;
	}
}
