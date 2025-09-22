Algoritmo "Calculadora de Vendas"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Jonathan
// Data atual  : 18/03/2023
Var
// Seção de Declarações das variáveis 
fabr : real
dist : real
impo : real
venda: real
Pdist: real
Pimpo: real
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Qual o preço de fábrica do carro selecionado?")
leia(fabr)

dist <- fabr * 28/100
Pdist <- fabr + dist

impo <- fabr * 45/100
Pimpo <- fabr + impo

venda <- fabr + dist + impo
escreval("O preço para distribuidora será de R$ ",Pdist)
escreval("O Valor de Imposto será de R$ ", Pimpo)
escreval("O preço de venda será de R$ ",venda)
Fimalgoritmo