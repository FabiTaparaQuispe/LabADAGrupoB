#Modificar el programa anterior para definir el número de espacios entre el marco y las palabras

palabra = input("Ingrese texto\n> ")
space = int(input("Ingrese espacio con el marco\n> "))
largo = (len(palabra) + space * 2) + 3

print("*" * largo)
for i in range((2 * space) + 1):
    if (i == (space)):
        print(" " + " " * space + palabra + " " * space + "")
    else:
        print("*" + " " * (largo) + "*")

print("*" * largo)
