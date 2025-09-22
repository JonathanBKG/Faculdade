Algoritmo "semnome"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Jonathan
// Data atual  : 20/03/2023
Var
// Seção de Declarações das variáveis 
NUM1, NUM2: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreva("Informe o 1º número: ")
   leia(NUM1)
   
   escreva("informe o 2º número: ")
   leia(NUM2)
   
   se (NUM1 = NUM2) entao
   escreva("Os números são iguais.")
   fimse
   
   se (NUM1>NUM2)entao
   escreva(NUM1," é maior que ",NUM2)
   
   senao
   escreva(NUM2," é maior que ",NUM1)
   fimse
Fimalgoritmo