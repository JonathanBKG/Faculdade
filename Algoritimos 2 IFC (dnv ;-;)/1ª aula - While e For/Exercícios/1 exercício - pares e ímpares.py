#Variaveis
num = 1
contPar = 0
contImpar = 0

while num != 0:
    num = int(input("Insira os valores para definir quais são ímpares ou pares:"))
    #Filtro se for digitado 0
    if num == 0:
        break

    #Filtro par
    if num % 2 == 0:  
        contPar = contPar + 1
    
    #O resto é ímpar    
    else:
        contImpar = contImpar + 1

print("Números Pares:", contPar, " pares." )
print("Números Ímpares:", contImpar, " ímpares." )