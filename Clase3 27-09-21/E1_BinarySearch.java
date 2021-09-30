package Clase3 27-09-21;

//Ejercicio1
public class E1_AlgoritmoOrdenamiento {
	public int busquedaBinaria(int arreglo[], int elemento) {
		//El ejercicio realiza la busqueda binaria dividiendo por la mitad
		//el arreglo de numeros hasta encontrar el elemento 
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
		int vector2[]= {1,2,3,5,5,7,9,10,14,15,18,40,50,50};
		ordenar.mostrarArreglo(vector2);
		int indice=ordenar.busquedaBinaria(vector2,5);	
		if(indice!=-1) {
			System.out.println("Elemento 5 encontrado en el indice "+indice);
		}else {
			System.out.println("Elemento 5 no encontrado");
		}
	}


}
