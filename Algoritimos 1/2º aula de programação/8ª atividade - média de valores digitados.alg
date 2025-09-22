algoritmo "semnome"
// Função :
// Autor :
// Data : 24/03/2023
// Seção de Declarações 
var
entrada: inteiro
Soma, Cont: inteiro

inicio
// Seção de Comandos
Cont<-0
Soma<-0
entrada<-1
enquanto (entrada<>0) faca
  leia (entrada)
  se (entrada mod 2 = 0) entao
    Soma <- Soma + entrada
    Cont <- Cont + 1
  fimse
fimenquanto
escreval("A média dos valores é: ", Soma / Cont)
fimalgoritmo
