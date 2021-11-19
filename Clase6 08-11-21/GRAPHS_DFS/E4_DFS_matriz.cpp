#include <iostream>
/* 
 * Ejercicio 4 DFS Matriz
 * Autor: Fabiola Tapara Quispe
 * Description: Matriz delimitada a un espacio que elige una ficha al azar 
                mediante el algoritmo de DFS y se expande alrededor
 * Date: 08/11/21 
 */

using namespace std;
// clase que arma la matriz que delimita el espacio 
void print(char matriz[][6],int filas, int columnas){
   for(int i=0;i<filas;i++){ //recorre las filas de la matriz
      for(int j=0;j<columnas;j++){ // recorre las columnas de la matriz
         cout<<matriz[i][j]<<" ";
      }
      cout<<endl;
   }
}
// clase que llena la matriz, recibe un vector de tamanio de columnas de 6, el numero
// de filas y columnas y sus posiciones asi como su desplazamiento x,y

void llenadoPri(char matriz[][6],int& filas, int& columnas, int& posx,int& posy,int avax,int avay){
   if(matriz[avax+posx][avay+posy]!='#' && matriz[avax+posx][avay+posy]!='o'){
     //si las posiciones de la matriz es diferente de 1 y diferente de dos, 
      posx=avax+posx;//al elemento de la posicion x se le agrega una posicion x
      posy=avay+posy;//al elemento de la posicion y se le agrega una posicion y
      matriz[posx][posy]='o';//la matriz recorre las posiciones "x" y "y"
      cout<<endl;
      print(matriz,6,6); //imprime la posicion final de la matriz de tamanio 6x6

      llenadoPri(matriz,filas,columnas,posx ,posy,-1,0);//
      llenadoPri(matriz,filas,columnas,posx ,posy,0,1);
      llenadoPri(matriz,filas,columnas,posx ,posy,1,0);   
      llenadoPri(matriz,filas,columnas,posx ,posy,0,-1);

   }else{
      return ;
   }
}

//se utiliza el llenado por DFS
void llenado(char matriz[][6],int filas, int columnas, int posx,int posy){
   llenadoPri(matriz,filas,columnas,posx ,posy,0,0);
}

//clase main para realizar los casos de prueba
int main(){ 
   char matriz[][6]={{'#','#','#','#','#','#'},
                     {'#','-','-','-','-','#'},
                     {'#','-','-','-','-','#'},
                     {'#','-','-','-','-','#'},
                     {'#','-','-','-','#','-'},
                     {'#','#','#','#','-','-'}};
  //matriz que indica "0" aun no ha sido visitado y "1" que ya ha sido visitado
   print(matriz,6,6); 
   llenado(matriz,6,6,1,1);//imprime la matriz con los numeros completos

   return 0;
}
