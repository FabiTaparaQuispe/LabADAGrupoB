#include <bits/stdc++.h>
/* 
 * Ejercicio 2 Shortest Routes I
 * Autor: Fabiola Tapara Quispe
 * Descripcion: Hay n ciudades y m vuelos, determinar la longitud de la ruta 
 *              más corta desde Syrjälä (ciudad 1) a cada ciudad. 
 * Solucion:    Para la solucion usaremos el algoritmo de Dikjstra  
 * Fecha: 13/12/21 
 */
#define int long long
#define MOD 1000000007
#define MAX 1e14 //para infinito en dijkstra
 
using namespace std;

vector<array<int, 2>> G[100005];//Lista de Adyancencia vecino, peso de arista
int n, m;//n ciudades y m vuelos

void dijkstra(vector<array<int, 2>> G[], int distance[], int origin) {
    // Se establece las distancias como infinito ya que aun no han sido visitados
    set<int> visited;

    priority_queue<array<int, 3>, vector<array<int, 3>>, greater<array<int, 3>> > pq; //ordenamos segun el peso usando cola de prioridad
    for(int i = 0; i < G[origin].size(); i++) {
        pq.push({G[origin][i][1], origin, G[origin][i][0]});// Agregamos a la priority queue el vertice de origen distacia = 0
    }

    for(int i = 0; i < n; i++) {
        distance[i] = MAX;
    }

    distance[origin] = 0;//La distancia del Vertice de origen se establece en cero
    visited.insert(origin);

    while(!pq.empty()) {// se itera mientras la priority queue no este vacia
        auto top = pq.top();//desencolar un valor de la priority queue ultimo elemento insertado
        pq.pop();
        if(visited.find(top[2]) == visited.end()) {
            distance[top[2]] = min(distance[top[2]], top[0]);
        }
        else continue;//distancia desde vertice origen hacia el mismo vertice de origen

        visited.insert(top[2]);//ultimo elemento insertado
        for(int i = 0; i < G[top[2]].size(); i++) {
            pq.push({distance[top[2]] + G[top[2]][i][1], top[2], G[top[2]][i][0]});//adicionar a la priority queue
        }
    }
}
 
void solve() {
    cin >> n >> m;// Recibimos o leemos los valores para n y m
    int x, y, z;
    for(int i = 0; i < m; i++) {//itera sobre m 
        cin >> x >> y >> z;//siguientes m lineas a leer
        x--; y--;
        G[x].push_back({y, z});
    }

    int dist[n];
    dijkstra(G, dist, 0);//se usa dijkstra desde 0

    for(int i = 0; i < n; i++) {//imprimimos los resultados obtenidos
        cout << dist[i] << " ";
    }
    cout << endl;
    
}
 
int32_t main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    solve();
    return 0;
}
