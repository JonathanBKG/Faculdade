vetor = []
for i in range(3):
    valor = int(input(f"Digite o valor {i+1} do vetor: "))
    vetor.append(valor)

matriz = []
for i in range(3):
    linha = []
    for j in range(3):
        valor = int(input(f"Digite o valor da matriz na posição [{i+1}][{j+1}]: "))
        linha.append(valor)
    matriz.append(linha)

resultado = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]

for i in range(3):
    for j in range(3):
        resultado[i][j] = vetor[i] * matriz[j][i]

for linha in resultado:
    print(linha)