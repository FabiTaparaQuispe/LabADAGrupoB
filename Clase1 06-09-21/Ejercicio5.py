#Colocar un marco a un texto. Ingresar una serie de palabras y colocarlas en un marco.
palabra=input("Ingrese texto\n> ")
espaciado=3
altura=7
largo=len(palabra)+6

print("*" * largo)
for i in range(altura):
    if(i==(altura//2)):
        print(""+" " * 2+palabra+" " *2+"")
    else:
        print("*"+ ""+" "*(largo-2)+"*")
    
print( "*" * largo)
