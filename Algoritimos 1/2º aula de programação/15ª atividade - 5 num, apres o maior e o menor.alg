algoritmo "semnome"
// Função :
// Autor :
// Data : 30/03/2023
// Seção de Declarações 
var
num     :inteiro
entrada :inteiro
maior   :inteiro
menor   :inteiro
cont    :inteiro
inicio
// Seção de Comandos
menor<-99999999
maior<-0
cont <-1

para num de 1 ate 5 faca
  escreval("Escreva o ",cont ,"º número")
  leia(entrada)
  cont <- cont + 1
  
    se (entrada > maior) entao
      maior <- entrada
    fimse
    se (entrada < menor) entao
        menor <- entrada
    fimse
fimpara

escreval("O menor número é ", menor)
escreval(" ")
escreval(" ")
escreval("O maior número é ", maior)
  
fimalgoritmo
