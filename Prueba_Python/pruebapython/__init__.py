import random
# creamos un número aleatorio entre 1 y 9
numero = random.randrange(1,10)
contador = 1
numUsuario = int(input("Introduzca un número: "))
while numUsuario != numero:
    print("¡¡No ha acertado!!")
    numUsuario = int(input("Vuelva a intentarlo: "))
    contador += 1
else:
    print("¡Ha acertado! En", contador, "intentos")
