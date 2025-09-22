# Listas
lista1 = []
lista2 = []
lista3 = []
lista2inv = []
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

# Invertendo a Lista 2.
i = 0
while i < 5:
    x = 4 - i 
    num = lista2[x]
    lista2inv.append(num)
    i += 1

print('Lista 1: ',lista1)
print('Lista 2 invertida: ',lista2inv)

# Multiplicando a lista 1 pelo -inverso- da lista 2 (A*-B)
i = 0
while i < 5:
    num1 = lista1[i]
    num2 = lista2inv[i]

    result = num1 * num2
    lista3.append(result)
    i += 1

print('Lista resultado: ', lista3)