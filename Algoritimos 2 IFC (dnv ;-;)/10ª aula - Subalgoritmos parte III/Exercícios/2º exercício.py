def soma_matriz ():
    soma = 0
    for l in range(len(matriz)):
        for c in range(len(matriz)):
            soma = soma + matriz[l][c]
    return soma

mat = []