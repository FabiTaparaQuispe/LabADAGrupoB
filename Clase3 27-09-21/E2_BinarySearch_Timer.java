package Lab3;

//Ejercicio2
public class E1_AlgoritmoOrdenamiento {
	public int busquedaBinaria(int arreglo[], int elemento) {

		int centro,primero,ultimo,valorCentro;
		primero=0;
		ultimo=arreglo.length-1;
		while(primero<=ultimo) {
			centro=(primero+ultimo)/2;
			valorCentro= arreglo[centro];
			System.out.println("Comparando a "+ elemento +" con "+arreglo[centro]); 	
			if(elemento==valorCentro) {
				return centro;
			}else if(elemento<valorCentro) {
				ultimo=centro-1;//Dezplazarnos hacia la izquierda
			}else {
				primero=centro+1;//Desplazarnos hacia la derecha
			}
		}
		return-1;
	}
	public void mostrarArreglo(int[]arreglo) {
		int k;
		for(k=0;k<arreglo.length;k++) {
			System.out.print("["+arreglo[k]+"]");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		E1_AlgoritmoOrdenamiento ordenar=new E1_AlgoritmoOrdenamiento();
		int[] a = {1,2,3,5,5,7,9,10,14,15,18,40,50,50};
		double inicioTime = System.nanoTime();
		ordenar.mostrarArreglo(a);
		int indice=ordenar.busquedaBinaria(a,17);
		double finTime = System.nanoTime();
		System.out.println("Se demoro: " + (finTime-inicioTime)  + " nanosegundos");
		if(indice!=-1) {
			System.out.println("Elemento 17 encontrado en el indice "+indice);
		}else {
			System.out.println("Elemento 17 no encontrado");
		}
	}


}
