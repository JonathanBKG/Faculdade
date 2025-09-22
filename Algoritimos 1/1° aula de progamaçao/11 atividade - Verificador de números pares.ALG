Algoritmo "Verificador de numeros pares"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Jonathan
// Data atual  : 18/03/2023
Var
// Seção de Declarações das variáveis 
num : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite um número para saber se ele é par:")
leia(num)
         se num mod 2 = 0 entao
            escreval("O número ", num, " é par!")
         senao
            escreval("O número ", num, " é ímpar!")
         fimse
Fimalgoritmo