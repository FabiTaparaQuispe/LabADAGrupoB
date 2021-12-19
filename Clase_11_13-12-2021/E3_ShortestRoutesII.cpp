#include <bits/stdc++.h>
/* 
 * Ejercicio 3 Shortest Routes II
 * Autor: Fabiola Tapara Quispe
 * Descripcion: 
 *  Hay n ciudades y m carreteras entre ellas. Se nos pide procesar 
 *  consultas "q" en las que tienes que determinar la longitud de la ruta
 *  más corta entre dos ciudades determinadas.
 * Solucion:    Para la solucion usaremos el algoritmo de Dikjstra, 
 *              se considerara como un grafo no dirigido
 * Fecha: 13/12/21 
 */
#define int long long
#define MOD 1000000007
#define MAX 1e14 // valor infinito
 
using namespace std;
 
void dijkstra() {
    int n, m, q; //n ciudades, m carreteras y q consultas
    cin >> n >> m >> q;// Recibimos o leemos los valores para 'n', 'm' y 'q'
    int x, y, z;//variables auxiliares, a partir de ellos crea el arreglo bidimensional para Dijkstra 
    int graph[n][n];//creamos un arreglo bidimensional de [n][n]
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            graph[i][j] = MAX;//valor infinito como inicio 
        }
        graph[i][i] = 0;//la distancia de la Ciudad i hacia la Ciudad i sera igual a 0
    }

    for(int i = 0; i < m; i++) {
        cin >> x >> y >> z;
        x--; y--;
        graph[x][y] = min(z, graph[x][y]);
        graph[y][x] = min(z, graph[y][x]);
    }

    for(int k = 0; k < n; k++) {//Iteraremos sobre las posiciones del arreglo bidimensional
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                graph[i][j] = min(graph[i][j], graph[i][k] + graph[k][j]);//k=costo
            }
        }
    }


    for(int i = 0; i < q; i++) {//recibimos la cantidad de consultas que se desean realizar
        cin >> x >> y;// Leemos o recibimos sus valores del input ingresado
        if(graph[x - 1][y - 1] >= MAX) {
            cout << -1 << endl;// no existe una ruta entre las Ciudades "x" y "y", devolvemos -1
        }
        else cout << graph[x - 1][y - 1] << endl;//En caso ser diferente de infinito, hay una ruta minima
    }   
}
 
int32_t main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    dijkstra();//retorna las rutas de minimo coste y las 'q' consultas que se hacen
    return 0;
}
