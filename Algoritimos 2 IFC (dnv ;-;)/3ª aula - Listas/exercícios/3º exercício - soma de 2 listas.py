# Listas
lista1 = []
lista2 = []
lista3 = []

# Variáveis
i = 1

# Preenchendo lista 1
while i <= 5:
    n = int(input(f'Digite o {i}º valor da lista 1: '))
    lista1.append(n)
    i += 1

# Preenchendo lista 2
i = 1
while i <= 5:
    n = int(input(f'Agora digite o {i}º valor da lista 2: '))
    lista2.append(n)
    i += 1

# Somando as listas
i = 0
while i < 5:
    num1 = lista1[i]
    num2 = lista2[i]

    soma = num1 + num2
    lista3.append(soma)
    i += 1


print(lista3)