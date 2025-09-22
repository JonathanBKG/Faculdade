# Faça um algoritmo que lê 5 valores para uma variável 
# do tipo vetor e determine o maior e o menor valor 
# armazenado no vetor.

import numpy as np

#Variável
maior = 0
menor = 999999999999999

#Define o tamanho do Array
N = 5

#Preenche o array com zeros (0)
x = np.zeros(N)

#Preenche o array com valores que o usuário preferir
for i in range(N):
    x [i] = int(input(f'Informe um valor para V {i}: '))

for elemento in x:
    if elemento < menor:
        menor = elemento

    if elemento > maior:
        maior = elemento

print(f'O menor número é: {menor}')
print(f'O maior número é: {maior}')