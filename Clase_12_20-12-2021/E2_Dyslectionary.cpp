#include <bits/stdc++.h>
/* 
 * Ejercicio 2 Dyslectionary
 * Autor: Fabiola Tapara Quispe
 * Descripcion:  La distilencia es como un diccionario ordinario, 
 * excepto que ordena palabras basadas en cómo terminan en lugar
 * de cómo comienzan. Si dos palabras tienen el mismo sufijo, la 
 * palabra más corta se ordena anteriormente
 * Fecha: 20/12/21 
 */
#include <algorithm>
#include <iostream>
#include <vector>
#include <string>

using namespace std;

void process(vector<string>& v) {
    // Encuentra la longitud máxima para cada cadena 
    int maxlen = 0;
    for(auto i : v) {
        if(i.length() > maxlen) {
            maxlen = i.length();
        }
    }

    // Invierta cada cadena, ordena, voltea hacia atrás.
    for(auto& i : v) {
        reverse(i.begin(), i.end());
    }
    sort(v.begin(), v.end());
    for(auto& i : v) {
        reverse(i.begin(), i.end());
    }

    // justifica todas las cacenas con espacios.
    for(auto& i : v) {
        string temp;
        temp.resize(maxlen - i.length(), ' ');
        temp += i;
        swap(i, temp);
    }

    // Print the strings
    for(auto i : v) {
        cout << i << endl;
    }
}

int main() {
    string s;
    vector<string> v;
    while(getline(cin, s)) {
        if(s == "") {
            process(v);

            cout << endl;
            v.clear();
            continue;
        }

        v.push_back(s);
    }
    process(v);
}
