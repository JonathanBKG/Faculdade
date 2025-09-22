Algoritmo "Aprovado ou Reprovado"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Jonathan
// Data atual  : 18/03/2023
Var
// Seção de Declarações das variáveis 
ATV1 : real
AP   : real
AF   : real
media: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite a nota da ATV1:")
leia(ATV1)
escreval("Digite a nota da AP:")
leia(AP)
escreval("Digite a nota da AF:")
leia(AF)
media <- (ATV1+AP+AF) /3
        se media >= 7 entao
           escreval("Você foi Aprovado! :D ")

        senao
           escreval("Você foi Reprovado. :(")
        fimse

Fimalgoritmo