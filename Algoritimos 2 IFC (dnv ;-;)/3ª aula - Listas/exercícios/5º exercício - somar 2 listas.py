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

# Juntando 2 listas
lista3 = lista1 + lista2
print(lista3)