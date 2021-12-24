#include <bits/stdc++.h>
using namespace std;
/* 
 * Ejercicio 4 Finding Borders
 * Autor: Fabiola Tapara Quispe
 * Descripcion: Un borde de una cadena es un prefijo que también 
 * es un sufijo de la cadena, pero no la cadena entera. Por ejemplo, 
 * los bordes de "Abcababcab" son "AB" y "ABCAB". Su tarea es encontrar todas 
 * las longitudes de borde de una cadena dada. 
 * Verifica las longitudes de los bordes 
 * Borde: prefijo y sufijo que no forma palabra completa
 * Fecha: 20/12/21 
 */

int main() {
  ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);//synchronization
  string s; cin >> s;
  int n = s.length();
  //se evalua desde el primer caracter hasta el ultimo 
  vector<int> p(n), A;
  for (int i = 1, j = 0; i < n; ++i) {
    while (j > 0 && s[i] != s[j])
    j = p[j - 1];
    if (s[i] == s[j]) //compara los extremos 
    ++j;//aumenta la cadena
    p[i] = j;
  }
  int j = p[n - 1];
  while (j > 0) {
    A.emplace_back(j);//Inserts a new element at the end of the vector
    j = p[j - 1];
  }
  reverse(A.begin(), A.end());//function is used to return an iterator pointing to the first element of the vector container
  //hasta antes de completar la palabra
  for (int len: A) {
    cout << len << " ";
  }
  cout << "\n";
  return 0;
}
