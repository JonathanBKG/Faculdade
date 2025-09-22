algoritmo "semnome"
// Função :
// Autor :
// Data : 29/03/2023
// Seção de Declarações 
var
entrada, mem: real
soma             : real
Cont             : inteiro
inicio
// Seção de Comandos
Cont <- 1

enquanto (Cont = 1) faca

escreval("Informe qualquer número")
leia(entrada)

  se (entrada > 1) e (entrada < 100) entao
    soma<- (mem + entrada)
    escreval("A soma dos 2 valores é: ", soma)
    Cont <- 0
    senao
      mem<- entrada
    fimse
fimenquanto
fimalgoritmo
