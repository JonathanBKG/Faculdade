# Lista criada
x = []

# Variáveis
i = 1
n = 0
# Pergunta quais são os valores para colocar na lista
while i <= 5:
    n = int(input(f'Digite o {i}º valor: '))
    x.append(n)
    i += 1

print(x)