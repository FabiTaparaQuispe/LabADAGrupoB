''''
 * Ejercicio 2 MinimumAddtoMakeParenthesesValid
 * Autor: Fabiola Tapara Quispe
 * Description: Verificar el ingreso correcto de parentesis, apertura y cierre,
 * mostrar la cantidad de aquellos que no lo estan usando una Pila.
 * Date: 15/11/21 
'''
abreParentesis = ["("]
cierraParentesis = [")"]

def parenthesisValid(str):
    lista = []
    for i in str:
        print(i)
        if(i in abreParentesis):#si es "("
            lista.append(i)
        elif(i in cierraParentesis):
            if(len(lista) == 0 or lista[-1] in cierraParentesis):
                lista.append(i)
            elif(lista[-1] in abreParentesis):
                lista.pop()
    return lista
        
        

## caso de prueba
input1 = parenthesisValid("())")
print(len(input1))

input2 = parenthesisValid("(()))(")
print(len(input3))

input3 = parenthesisValid("()))((")
print(len(input3))
