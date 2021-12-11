''''
Ejercicio 5 Watering Grass
Autor: Fabiola Tapara Quispe
Descripcion: Se pide calcular la cantidad minima de aspersores usados para el riego de una franja de pasto
'''
import sys
from math import sqrt
def main():
    lines = 0  # contador de lineas en 0
    for line in sys.stdin:# Por cada linea enviada al input iteraremos
        if lines == 0: # Para la primera linea del input se guardan los valores
            #w= ancho, l= largo 
            n, l, w = map(int, line.split()) # se cambio input por line dado que se lee toda la linea
            aspersores = []
            lines = n #Se establece como n var aux
            medioCuadrado = (w / 2) ** 2 #area elevada al cuadrado de la mitad del ancho            
        else:
            lines -= 1 # Se reduce en una unidad cada vez que registremos los datos de un aspersor
            h, r = map(int, line.split())# se lee los datos horizontales de toda la linea y su zona de riego 
            if (2 * r) > w:# Si el tamanio del aspersor es mayor 
                d = sqrt((r ** 2) - medioCuadrado)#distancia de rango de riego
                aspersores.append((h - d, h + d))# Agregamos su area de riego a la lista de aspersores
            if lines == 0:#Se ordena con sorted para elegir mejor
                aspersores = sorted(aspersores) 
                print(AspersoresUse(aspersores, l, len(aspersores))) # Imprimimos los aspersores que necesitamos
def AspersoresUse(aspersores, l, n): 
    aspersorUse, aspersorActual, lengthActual = 0, 0, 0
    # aspersorUse: Aspersores usados
    # lengthActual : largo del cesped regado
    while True: 
        masLejos = -1 #masLejos es el valor de la mayor disntacia usada seria -1 
        while aspersorActual < n and aspersores[aspersorActual][0] <= lengthActual:
        # mientras aun haya aspersores y la longitud del aspersor actual
        # no sea mayor a la longitud ya regada
            masLejos = max(masLejos, aspersores[aspersorActual][1])
            aspersorActual += 1
        if masLejos == -1:
            return -1 # se retornara para evitar pasarnos deltiempo computacional
        aspersorUse += 1
        lengthActual = masLejos # establecermos el nuevo valor de length
        if lengthActual >= l: 
            return aspersorUse
if __name__ == "__main__":
    main()
