algoritmo "... a ..."
// Função :
// Autor :
// Data : 24/03/2023
// Seção de Declarações 
var
num1: inteiro
num2: inteiro
inicio
// Seção de Comandos 
escreval("Escreva o 1º número:")
        leia(num1)
escreval("Escreva o 2º número:")
        leia(num2)
se (num1 > num2) entao
   escreval("Número inválido... O 1° número tem que ser menor que o 2° número")

senao
   enquanto (num1 <= num2) faca
            escreval(num1)
            num1 <- num1 + 1
fimenquanto
fimse
fimalgoritmo
