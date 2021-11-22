'''
Ejercicio 6 Merge Sorted Lists
Autor: Fabiola Tapara Quispe
Description: Se utiliza una cola de prioridad para ordenar los elementos desencolados j mostrar la informacion en orden ascendente
Date: 15/11/21 
'''
import queue

pQ = queue.PriorityQueue()
#datos de prueba
#print("LISTAS INGRESADAS: ")
list = [[1,4,5],[1,3,4],[2,6]]

#Iterar sobre la cola de prioridad
for i in range(len(list)):
    for j in range(len(list[i])):
        pQ.put(list[i][j])

for i in range(pQ.qsize()):
    #print("Cola de prioridad: ")
    print(pQ.get(), end=", ")
