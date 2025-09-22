# Inicialize um vetor com 3 posições
vetor = []
for i in range(3):
    valor = int(input(f"Digite o valor {i+1} do vetor: "))
    vetor.append(valor)

# Inicialize uma matriz 3x3
matriz = []
for i in range(3):
    linha = []
    for j in range(3):
        valor = int(input(f"Digite o valor da matriz na posição [{i+1}][{j+1}]: "))
        linha.append(valor)
    matriz.append(linha)

# Inicialize uma matriz resultado com zeros
resultado = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]

# Realize as multiplicações e preencha a matriz resultado
for i in range(3):
    for j in range(3):
        resultado[i][j] = vetor[i] * matriz[j][i]

# Mostre a matriz resultado
print("Matriz Resultado:")
for linha in resultado:
    print(linha)
