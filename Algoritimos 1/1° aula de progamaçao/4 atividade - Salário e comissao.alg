algoritmo "semnome"
// Função :
// Autor :
// Data : 17/03/2023
// Seção de Declarações 
var
     Nome     : caractere
     Salario  : real
     Vendas   : real
     Comissao : real
     Total    : real
     
inicio
// Seção de Comandos 
   escreval("Qual seu nome?")
   leia(Nome)
   escreval(Nome,", Qual seu salário?")
   leia(Salario)
   escreval(Nome, ", Qual o valor total de suas vendas?")
   leia(Vendas)
   
   Comissao <- (Vendas * 2)/ 100
   Total <- Salario + Comissao
   
   escreval(Nome,", seu salário é de: R$" ,total)
   escreval("Salário Bruto: R$ ",Salario)
   escreval("Valor das Vendas: R$ ",Vendas)
   escreval("Valor da Comissão: R$ ",Comissao)
   escreval("Total do Salário líquido: R$ ",Total)
fimalgoritmo
