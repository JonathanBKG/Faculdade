algoritmo "semnome"
// Função :
// Autor :
// Data : 29/03/2023
// Seção de Declarações 
var
entrada : inteiro
menor   : inteiro
maior   : inteiro
inicio
// Seção de Comandos
entrada<-1
menor<-999999999
maior<-0
  enquanto (entrada <>0) faca
    leia(entrada)
    se (entrada <> 0) entao
      se (entrada < menor) entao
        menor <- entrada
      fimse
      
      se (entrada > maior) entao
        maior <- entrada
      fimse
    fimse
    fimenquanto
    escreval(" O menor número é: ", menor, " e o maior é: ", maior)
fimalgoritmo
