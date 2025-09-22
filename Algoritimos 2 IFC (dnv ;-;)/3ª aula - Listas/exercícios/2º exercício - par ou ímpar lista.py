# Declaro a lista
lista = []

# Variáveis
i = 1
num = 0

# Pegando os valores do Usuário.
while i <= 10:
    n = int(input(f'Digite o {i}º valor: '))
    lista.append(n)
    i += 1

# Percorrendo a lista para verificar se o 
# numero é ímpar ou par.
i = 0
while i < 10:
    num = lista[i] 
    # se o numero for par:
    if num % 2 == 0:
        num = num * i
        lista[i] = num
    # se o numero for ímpar
    else:
        num = i
        lista[i] = num
    # avanço para a próxima casa da lista    
    i += 1

# Mostra a lista no Terminal        
print(lista)