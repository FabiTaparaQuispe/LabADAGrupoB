#include <bits/stdc++.h>
/* 
 * Ejercicio 1 RoadReparation
 * Autor: Fabiola Tapara Quispe
 * Descripcion: Hay n ciudades y m carreteras entre ellas. Desafortunadamente, 
 * se nos pide encontrar un a solución donde el costo total sea lo más pequeño 
 * posible y asi reparar algunas de las carreteras para que haya una ruta decente 
 * entre dos ciudades. Se utilizo el algoritmo de Kruskal    
 * Fecha: 13/12/21 
 */
#define int long long
#define MOD 1000000007
#define MAX 1e13
 
using namespace std;

vector<array<int, 3>> roads;//representa el grafo
int n, m;//variables globales n ciudades y m carreteras
bool visitado[100005];// Creamos un arreglo visitado que representara los ya visitados
int path[100005]; // Creamos un arreglo path que representara los posibles caminos 

int find(int x) {// recibe un Vertice de origen 
    if(path[x] == x) {// En caso el valor en el Path para el Vertice 'x' sea igual a x 
        return x;//retorna el mayor Vertice donde podemos llegar a partir de x
    }
    return path[x] = find(path[x]);// Si es diferente de x significa que podemos llegar
     //mas lejos desde el Vertice inicial y se vuelve a hacer la busqueda del Vertice mas alejado
}

void unionEdge(int x, int y) { //une los vertices de origen y destino
    //guarda dentro del Path en caso que una dos puntos diferentes
    //No admite aristas que forme bucles

    int a = find(x);// Vertices mas alejados con la funcion find
    int b = find(y);// Vertices mas alejados con la funcion find
    if(a != b) {//no debe ser hacia el mismo Vertice porque seria un bucle
        path[a] = b;
    }
}

int MST() {//Arbol de cobertura Mínimo
    for(int i = 0; i < n; i++) {
        path[i] = i;
        visitado[i] = false;
    }
    sort(roads.begin(), roads.end());// Ordenamos el arreglo de aristas
    int cost = 0;// Variable auxiliar para el costo minimo del recorrido
    for(int i = 0; i < roads.size(); i++) {// Iteraremos por las aristas que tenemos en el arreglo
        if(find(roads[i][1]) != find(roads[i][2])) {
            cost += roads[i][0];
            unionEdge(roads[i][1], roads[i][2]); // Si los Vertices de la Arista se pueden unir
        }
    }
    int count = 0;
    for(int i = 0; i < n; i++) {
        if(path[i] == i) {
            count++;
        }
    }
    if(count > 1) {
        return -1;
    }
    return cost;
}
 
void solve() {

    cin >> n >> m;// Recibimos el valor de las ciudades y las rutas
    for(int i = 0; i < m; i++) {
        int a, b, c; //a= origen, b=destino, c=costo de reparacion
        cin >> a >> b >> c;// Ingresamos las carreteras de las siguiente 'm' lineas
        a--; b--;
        roads.push_back({c, a, b});
    }
    int res = MST();
    if(res == -1) {// En caso de no haber unido todos los Vertices
        cout << "IMPOSSIBLE" << endl;
    }
    else cout << res << endl;// En caso haber unido todos los vertices o ciudades
}
 
int32_t main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    solve();
    return 0;
}

