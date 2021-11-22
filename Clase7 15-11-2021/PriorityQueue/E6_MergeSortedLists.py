'''
Ejercicio 6 Merge Sorted Lists
Autor: Fabiola Tapara Quispe
Description: Se utiliza una cola de prioridad para ordenar los elementos desencolados j mostrar la informacion en orden ascendente
Date: 15/11/21 
'''
import queue
#Iterar sobre la cola de prioridad
def mergeSortedList(list):
    pQ = queue.PriorityQueue()
    lista = []#inicia vacio
    for i in list:
        for j in i:
            pQ.put(j)
    while not pQ.empty():
        lista.append(pQ.get())

    #print("Cola de prioridad: ")
    return lista
    
#datos de prueba
print("LISTAS INGRESADAS: ")
print("[[1,4,5],[1,3,4],[2,6]]")
print(mergeSortedList([[1,4,5],[1,3,4],[2,6]]))
