matriz = []

for i in range(6):
    linha = []
    for j in range(6):
        valor = int(input(f"Digite um valor para a posição [{i+1}][{j+1}]: "))
        linha.append(valor)
    matriz.append(linha)

matriz[1], matriz[4] = matriz [4], matriz[1]

for i in range(6):
    matriz[i][3], matriz[i][5] = matriz[i][5], matriz[i][3]

print("Matriz resultante:")
for linha in matriz:
    print(linha)