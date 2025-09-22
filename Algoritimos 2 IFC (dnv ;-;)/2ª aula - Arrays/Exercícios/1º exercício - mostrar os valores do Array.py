# Faça um algoritmo que lê 10 valores para uma 
# variável do tipo vetor de nome x
# e mostra os 10 valores armazenados na estrutura.

import numpy as np
#Define o tamanho do Array
N = 10

#Preenche o array com zeros (0)
X = np.zeros(N)

#Preenche o array com valores que o usuário preferir
for i in range(N):
    X [i] = int(input(f'Informe um valor para V {i}: '))

print(X)