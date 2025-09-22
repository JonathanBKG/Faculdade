algoritmo "Soma de valores"
// Função :Somar os valores oferecidos até que seja digitado "0"
// Autor :Jonathan
// Data : 30/03/2023
// Seção de Declarações 
var
entrada :real
soma    :real

inicio
// Seção de Comandos
repita
escreval("Digite o valor do produto:")
  leia(entrada)
soma<- soma + entrada
ate(entrada=0)
escreval(" ")
escreval(" ")
escreval(" ")
escreval("O total dos valores inseridos é", soma)
fimalgoritmo
