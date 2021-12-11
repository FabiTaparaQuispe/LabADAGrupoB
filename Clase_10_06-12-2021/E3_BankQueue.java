package Clase_10_06-12-2021;
/* 
 * Ejercicio 3 BankQueue
 * Autor: Fabiola Tapara Quispe
 * Descripcion: Un Banco presenta demasiados clientes esperando en cola.
 * Se quiere atender a los cliente que generen mayor ganancia para el banco 
 * Sin embargo los clientes tienen un tiempo de espera determinado en la fila, 
 * Devuelve el valor maximo que ganara el banco.
 * Fecha: 6/12/21 
 */
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class E3_BankQueue {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();//cantidad de personas o clientes en cola
		int T = s.nextInt();//cantidad de tiempo para que el banco cierre sus puertas
		// PriorityQueue de los clientes en orden inverso, queremos los clientes que dan mas ganancia
		PriorityQueue<Persona> pq = new PriorityQueue<Persona>(N, Collections.reverseOrder());
		for (int i = 0; i < N; i++) {//agregamos a la cola los clientes
			pq.add(new Persona(s.nextInt(), s.nextInt()));
		}
		System.out.println(recaudacionTotal(pq, N, T));//cantidad maximo de dinero que podemos recaudar
	}
	public static int recaudacionTotal(PriorityQueue<Persona> pq, int N, int T) {
		int totalMoney = 0;// total de dinero a recaudar
		int time = 0;//tiempo de espera
		boolean[] pos = new boolean[T];// ayuda a establecer las pos ocupadas por clientes
		Persona client;//variable auxiliar
		while(time < N && !pq.isEmpty()) {
			//itera mientras que el tiempo de espera sea menor a la cantidad de clientes y
			//mientras haya clientes en la cola
			client = pq.poll();//desencola un cliente de la cola
			int inicio = client.time;//se establece el tiempo de inicio
			while(inicio >= 0 && pos[inicio]) {// se itera desde el cliente actual
				inicio--;// pasa a una posicion anterior
			}
			if(inicio != -1) {//si es -1 cierra el Banco se acabo el tiempo de atencion
				time++;//se incrementa el tiempo
				pos[inicio] = true;//unidad de tiempo
				totalMoney += client.money;//recauda el dinero del cliente
			}
		}
		return totalMoney;//devuelve el valor maximo que ganara el banco
	}	
}
class Persona implements Comparable<Persona> {//interface Comparable para la pq
	int money;//dinero del cliente
	int time;//tiempo de espera maximo del cliente
	public Persona(int money, int time) {
		this.money = money;
		this.time = time;
	}
	
	public int compareTo(Persona p) {//establece un orden para Persona
		int pmoney = p.money;//atributo de la persona
		int ptime = p.time;//atributo de la persona
		if (money < pmoney) {//compara la cantidad de dinero del cliente en cola y el actual 
			return -1;
		}
		if (money > pmoney) {
			return 1;
		}			
		if (time < ptime) {//compara el tiempo de espera del cliente en cola y el actual 
			return -1;
		}
		if (time > ptime) {
			return 1;
		}
		return 0;// ambas personas tienen igual tiempo de espera y dinero
	}
}
