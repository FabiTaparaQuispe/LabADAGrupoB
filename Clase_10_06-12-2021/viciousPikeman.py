''''
Ejercicio 4 A Vicious Pikeman
Autor: Fabiola Tapara Quispe
Descripcion: El problema nos pide encontrar la cantidad maxima de ejercicios que tiene que resolver un concursante en menos o igual tiempo del que se le da para cada ejercicio, y la penalizacion si no lo entrega a tiempo
usar % 1000000007
'''
def viciousPikeman():
    #ingreso de datos
    N,T = map(int,input().split())
    A,B,C,t0 = map(int,input().split()) # lista con los tiempos que tomara resolver cada ejercicio al Concursante
    t = [t0] #primer valor de la lista t
    for i in range(1,N):#itera llenando la lista con los tiempos de cada ejercicio
        t.append(((A*t[-1]+B) % C) + 1)
    t = sorted(t) # sorted ordnea el arreglo   
    #Se imprime la cantidad de ejercicios resueltos y su penalizacion
    ex = 0 #cantidad de ejercicios resueltos
    tp = 0 #tiempo de penalizacion por ejercicio
    p = 0 #tiempo total de penalizacion

    for i in range(len(t)):
      #Se analiza si el time es mayor al tiempo maximo dado en el concurso
        if tp + t[i] <= T:
            tp += t[i]
            p = (p + tp) % 1000000007 #nuevo valor para la penalidad recibida
            ex+=1#Agrega el tiempo al total
        else:
            break

    print(ex," ",p)#devuelve la cantidad maxima de ejercicios resueltos y la penalidad
viciousPikeman()
