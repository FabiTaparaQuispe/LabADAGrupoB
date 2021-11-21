#!/usr/bin/python

##  Ejercicio 1 reverse Polish Notation
##  Autor: Fabiola Tapara Quispe
##  Description: Mediante el siguiente metodo recibe un string con datos y signos con operaciones basicas (+, -, *, /) usando una Pila como estructura.
##  * Date: 15/11/21 

def sum (a, b):
    return a + b

def resta (a, b):
    return a - b

def multipli (a, b):
    return a * b

def division (a, b):
    return a // b

## Funcion Notacion  
def polishReverse(input):
    operadores = "+-*/"
    string = []
    list = input.split(" ")
    for  i in list:  
        if (i in operadores):
            num2 = string.pop()
            num1 = string.pop()
            if (i == "+"):
                string.append(sum(num1, num2))
            elif (i == "-"):
                string.append(resta(num1, num2))
            elif (i == "*"):
                string.append(multipli(num1, num2))
            else:
                string.append(division(num1, num2))
            
        else:
            string.append(int(i))
            continue
            
    return string[0]

## Casos de prueba vistos en clase

input = "2 1 + 3 *"
print("Primer Input : " + input)
print(polishReverse(input))

input = "4 13 5 / +"
print("Segundo Input : " + input)
print(polishReverse(input))

input = "10 6 9 3 + -11 * / * 17 + 5 +"
print("Tercer Input : " + input)
print(polishReverse(input))
