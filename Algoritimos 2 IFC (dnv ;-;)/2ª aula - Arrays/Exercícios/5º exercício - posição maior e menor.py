# Faça um algoritmo que lê 10 valores para uma variável 
# do tipo vetor e mostre qual a posição está armazenado 
# o maior e o menor valor no vetor
import numpy as np

#Variável
maior = 0
menor = 999999999999999

#Define o tamanho do Array
N = 10

#Preenche o array com zeros (0)
vetor = np.zeros(N)

#Preenche o array com valores que o usuário preferir
for i in range(N):
    vetor [i] = int(input(f'Informe um valor para V {i}: '))

for i in range (0, len(vetor)):
    if vetor[i] < menor:
        menor = vetor[i]
        pos_maior = i

    if vetor[i] > maior:
        maior = vetor[i]
        pos_menor = i

print(f'A posição do menor número é: {pos_menor}')
print(f'A posição do maior número é: {pos_maior}')
