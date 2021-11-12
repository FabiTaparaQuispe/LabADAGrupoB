#include <iostream>

using namespace std;

void print(int matriz[][6],int filas, int columnas){
   for(int i=0;i<filas;i++){
      for(int j=0;j<columnas;j++){
         cout<<matriz[i][j]<<" ";
      }
      cout<<endl;
   }
}

void llenadoPri(int matriz[][6],int& filas, int& columnas, int& posx,int& posy,int avax,int avay){
   if(matriz[avax+posx][avay+posy]!=1 && matriz[avax+posx][avay+posy]!=2){
      posx=avax+posx;
      posy=avay+posy;
      matriz[posx][posy]=2;
      cout<<endl;
      print(matriz,6,6);

      llenadoPri(matriz,filas,columnas,posx ,posy,-1,0);
      llenadoPri(matriz,filas,columnas,posx ,posy,0,1);
      llenadoPri(matriz,filas,columnas,posx ,posy,1,0);   
      llenadoPri(matriz,filas,columnas,posx ,posy,0,-1);

   }else{
      return ;
   }
}

void llenado(int matriz[][6],int filas, int columnas, int posx,int posy){
   llenadoPri(matriz,filas,columnas,posx ,posy,0,0);
}


int main(){
   int matriz[][6]={{1,1,1,1,1,1},{1,0,0,0,0,1},{1,0,0,0,0,1},{1,0,0,0,0,1},{1,0,0,0,0,1},{1,1,1,1,1,1}};
   print(matriz,6,6);
   llenado(matriz,6,6,1,1);

   return 0;
}
