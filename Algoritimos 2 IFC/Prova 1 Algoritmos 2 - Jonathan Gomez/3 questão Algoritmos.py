valores = []

for i in range(100):
    valor = int(input("Digite um valor: "))
    valores.append(valor)

contagem_pares = 0
soma_impares = 0

for valor in valores:
    if valor % 2 == 0:
        contagem_pares += 1
    else:
        soma_impares += valor

media_impares = soma_impares / max(valores.count(1), 1)

print("Quantidade de valores pares: ", contagem_pares)
print("Média dos valores ímpares: ", media_impares)