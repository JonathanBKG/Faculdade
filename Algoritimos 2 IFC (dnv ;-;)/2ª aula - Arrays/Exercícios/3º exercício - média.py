# Faça um algoritmo que lê 5 valores para uma variável 
# do tipo vetor e determine a média de todos os valores 
# armazenados no vetor.
import numpy as np

#Variável
soma = 0

#Define o tamanho do Array
N = 5

#Preenche o array com zeros (0)
x = np.zeros(N)

#Preenche o array com valores que o usuário preferir
for i in range(N):
    x [i] = int(input(f'Informe um valor para V {i}: '))

#Loop para somar todos os valores do Array
for elemento in x:
    soma += elemento

#Calculo da média
media = soma / N

#resultado
print(f'A média dos valores inseridos é: {media}')