#include <iostream>
#include <cstdlib>
#include<fstream>
#include<bits/stdc++.h>
using namespace std;
//Primero generamos una matriz que contenga ceros para asi crear poco a poco el grafo con camino basico pseudoaleatorio
void vacio(int **Ma, int fil){
    for (int i=0; i<fil;i++)
        {
        for(int j=0; j<fil; j++)
            {
            Ma[i][j]=0;
            }
        }

}
//Creamos el grafo pseudoaleatorio considerando el camino basico, el rand()nos ayuda a llenar la matriz
void ingreso(int **Ma, int fil)
{
    int a=0,b=1;
    for(int i=0; i<fil;i++)
    {
        for(int j=0; j<fil; j++)
            {
            if(j>i)
                {
                 if(i==a &&j==b){
                   Ma[i][j]=1;
                   a++;
                   b++;
                 }
                 else{
                    Ma[i][j]=rand()%2;
                 }

                 Ma[j][i]=Ma[i][j];
                }
            }
    }
}
//Mostramos el grafo conexo pseudo aleatorio creado
void mostrar(int **Ma, int fil){
    for(int i=0; i<fil;i++)
    {
        for(int j=0; j<fil;j++){
            cout<<Ma[i][j]<<" ";
        }
        cout<<endl;
    }
}
//Creamos el archivo .dot para ver el grafo conexo
void graphviz(int **Ma, int fil)
{
    cout<<"LISTA DE ADYACENCIA"<<endl;
    ofstream f;
    f.open("E:\\CS COMPUTACION\\SEGUNDO SEMESTRE\\ED2\\LABORATORIO\\Graphviz\\bin\\grafoconexo.dot");
    f<<"graph A {"<<endl;
    cout<<"graph A {"<<endl;
    for(int i=0; i<fil;i++)
    {
        for(int j=0; j<fil; j++)
        {
            if(j>=i)
            {
                if(Ma[i][j]==1)
                    {
                        f<<i<<" -- "<<j<<";"<<endl;
                        cout<<i<<" -- "<<j<<";"<<endl;
                    }
            }
        }
    }
    f<<"}";
    cout<<"}"<<endl;
    f.close();
}
//Creamos una lista de adyacencia que usaremos para la busqueda en profundidad y en anchura
void crearlista(vector<int> adyacencia[],int& numero,int**& matriz,int& inicio,vector<int>& indices){

    for(int j=0;j<numero;j++){
        if(matriz[inicio][j]==1){
            adyacencia[0].push_back(j);
        }
    }

    bool flag=false;
    for(int i=0;i<numero;i++){
        if(i==inicio){
            flag=true;
            continue;
        }else{
            indices[0]=inicio;
            if(flag){
                indices[i]=i;
            }else{
                indices[i+1]=i;
            }
        }
        for(int j=0;j<numero;j++){
            if(matriz[i][j]==1){
                if(flag){
                    adyacencia[i].push_back(j);
                }else{
                    adyacencia[i+1].push_back(j);
                }

            }
        }
    }

}

void imprimir(vector<int> adyacencia[],int& numero,vector<int>& indices){
    cout<<"La lista de adyacencia es: "<<endl;
    for(int i=0;i<numero;i++){
        cout<<indices[i]<<" ";
        for(int j=0;j<adyacencia[i].size();j++){
            cout<<adyacencia[i][j]<<"-";
        }
        cout<<endl;
    }
}
//Para la busqueda en profundidad usamos un arreglo de vectores en donde guardaremos
//la matriz de adyacencia anterior y asi llevamos el recorrido con el vector visited.
void DFSUtil(int numero, vector<int> adj[],vector<bool> &visited)
{
    visited[numero] = true;
    for (int i=0; i<adj[numero].size(); i++){
        if (visited[adj[numero][i]] == false){
            cout<<numero<<"->"<<adj[numero][i]<<";"<<endl;
            DFSUtil(adj[numero][i], adj, visited);
        }
    }
}

void DFS(vector<int> adj[], int V,vector<int>& indices)
{
    cout<<"El recorrido por DFS es: "<<endl;
    vector<bool> visited(V, false);
    for (int u=0; u<V; u++){
        if (visited[indices[u]] == false){
            DFSUtil(indices[u], adj, visited);
        }
    }
    cout<<endl;
}

void imprimirlista(vector<bool> vec){
    for(int i=0;i<vec.size();i++){
        cout<<vec[i]<<" ";
    }
    cout<<endl;
}
int block;
//Para el recorrdo en anchura, esta vez cuidamos que en el vector visited true o false y
//y recorre mas cuando sea true en el vector de adyacencia
void BFSUtil(int& numero, vector<int> adj[],vector<bool> &visited,vector<int>& indices)
{
    vector<int> cola;
    for(int j=0;j<adj[numero].size();j++){
        if(visited[indices[adj[numero][j]]]==false){
            cola.push_back(adj[numero][j]);
            visited[indices[adj[numero][j]]]=true;
            if(adj[numero][j]!=block){
                cout <<numero<<"->"<<adj[numero][j]<<";"<<endl;
            }
        }
    }

    for (int i=0; i<cola.size(); i++)
        BFSUtil(cola[i], adj, visited,indices);
}

void BFS(vector<int> adj[], int V,vector<int>& indices)
{
    cout<<"El recorrido por BFS es: "<<endl;
    vector<bool> visited(V, false);

    vector<int> cola;
    int aux;

    visited[indices[0]]=true;
    aux=indices[0];
    block=aux;

    for(int j=0;j<adj[0].size();j++){
        cola.push_back(adj[0][j]);
        visited[indices[adj[0][j]]]=true;
        cout <<aux<<"->"<<cola[j]<<";"<<endl;
    }

    for(int j=0;j<cola.size();j++){
        BFSUtil(cola[j], adj, visited,indices);
    }

}



int main()
{
    //Parte a del laboratorio: elaborar un grafo conexo pseudo aleatorio
    int fi;
    cout<<"Ingresar numero de vertices:  "<<endl;cin>>fi;
    //int matriz[fi][col];
    int **matriz=new int *[fi]; //puntero que apunta a un array de punteros

    for(int i=0; i<fi;i++){
        matriz[i]=new int[fi];
    }
    //cout<<"Primero se crea un grafo vacio"<<endl;
    vacio(matriz, fi);
    //cout<<"Luego ingresamos un grafo"<<endl;
    ingreso(matriz, fi);
    cout<<"Mostramos el grafo"<<endl;
    mostrar(matriz, fi);
    //cout<<"Lista de adyascencia del grafo"<<endl;
    graphviz(matriz, fi);
    cout<<"Se ingreso arbol conexo "<<endl;
    int v;

    cout<<"Ingresar el vertice raiz: "<<endl;
    cin>>v;
    //Parte b: Mediante el grafo conexo formamos un arbol generador por busqueda en profundidad
    vector<int> adyacencia[fi];
    vector<int> indices(fi);

    crearlista(adyacencia,fi,matriz,v,indices);
    imprimir(adyacencia,fi,indices);
    DFS(adyacencia,fi,indices);
    //Parte c: Mediante el grafo conexo formamos un arbol generador por busqueda en abchura
    BFS(adyacencia,fi,indices);

    return 0;
}
