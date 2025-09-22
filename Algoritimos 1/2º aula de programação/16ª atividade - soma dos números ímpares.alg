algoritmo "soma dos números ímpares somente"
// Função :
// Autor : Jonathan
// Data : 30/03/2023
// Seção de Declarações 
var
entrada : inteiro
soma    : inteiro
num     : inteiro
dif     : real
inicio
// Seção de Comandos 
escreval("Calculadora de números ímpares")
escreval(" ")

soma <- 0

para num de 1 ate 8 faca
  escreval("Digite o ",num ,"º número:")
  leia(entrada)
    se (entrada mod 2 > 0) entao
      soma <- soma + entrada
    fimse

fimpara

escreval("A soma dos números ímpares é ",soma)
fimalgoritmo
