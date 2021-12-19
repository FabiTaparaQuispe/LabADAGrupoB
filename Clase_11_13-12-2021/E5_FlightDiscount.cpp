#include <bits/stdc++.h>
 /* 
 * Ejercicio 5 Flight Discount
 * Autor: Fabiola Tapara Quispe
 * Descripcion: Su tarea es encontrar una ruta de vuelo de precio mínimo
 * desde Syrjälä a Metsälä. Tiene un cupón de descuento, con el que puede 
 * reducir a la mitad el precio de cualquier vuelo durante la ruta. 
 * Sin embargo, solo puede usar el cupón una vez.
 * Solucion: Usaremos el Algoritmo Dijkstra
 * Fecha: 13/12/21 
 */
#define int long long
#define MOD 1000000007
#define MAX 1e15 //infinito
#define MIN -1e13
 
using namespace std;

int n, m;// n, cantidad de ciudades que existen, m, cantidad de vuelos entre las ciudades
vector<array<int, 2>> G[100005], G_rev[100005];// Creamos un arreglo bidimensional que representa un Grafo
int costs[100005], costs_rev[100005];//Creamos un arreglo estandar para costos entre ciudades

void dijstra(vector<array<int, 2>> G[], int costs[], int root) {
    set<int> visited;

    priority_queue<array<int, 3>, vector<array<int, 3>>, greater<array<int, 3>> > pq;// Creamos una cola de prioridad para los costos
    for(int i = 0; i < G[root].size(); i++) { //Establecemos el Costo para llegar a Syrjälä en 0 
        pq.push({G[root][i][1], root, G[root][i][0]});//asi como sus vertices de origen en '0' y vertice de destino '1' 
    }

    for(int i = 0; i < n; i++) {
        costs[i] = MAX;// Rellenamos los arreglos para las distancias y costos entre ciudades con infinito
    }

    costs[root] = 0;
    visited.insert(root);

    while(!pq.empty()) {// Iteraremos mientras que la cola de prioridad no este vacia
        auto top = pq.top();//desencolamos
        pq.pop();
        if(visited.find(top[2]) == visited.end()) {//Si la ciudad de Destino es Syrjälä solo evaluamos que su descuento registrado sea menor a su costo 
            costs[top[2]] = min(costs[top[2]], top[0]);//en este caso seria '0' para ambos
        }
        else continue;//continuamos con las otras Ciudades

        visited.insert(top[2]);
        for(int i = 0; i < G[top[2]].size(); i++) {
            pq.push({costs[top[2]] + G[top[2]][i][1], top[2], G[top[2]][i][0]});
        }
    }
}


void dijkstra() {
    cin >> n >> m;// Recibimos o leemos valores para variables n y m
    int a, b, x;
    vector<array<int, 3>> edge;
    for(int i = 0; i < m; i++) {//En caso de no haber sido visitado antes
        cin >> a >> b >> x;
        a--;b--;
        //evaluamos su costo para llegar a dicha ciudad usando el descuento
        edge.push_back({a, b, x});
        G[a].push_back({b, x});
        G_rev[b].push_back({a, x});
    }

    dijstra(G, costs, 0);
    dijstra(G_rev, costs_rev, n - 1);

    int cost = MAX;

    for(int i = 0; i < m; i++) {// El descuento se establece aplicando al ultimo viaje
        cost = min(cost, costs[edge[i][0]] + costs_rev[edge[i][1]] + edge[i][2] / 2);
    }

    cout << cost << endl;// Imprimimos el mejor precio
}
 
int32_t main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    dijkstra();//devuelve una ruta de vuelo de precio mínimo desde Syrjälä a Metsälä
    return 0;
}
