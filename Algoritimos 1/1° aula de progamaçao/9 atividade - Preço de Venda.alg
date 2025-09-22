algoritmo "Preço de venda"
// Função :
// Autor :
// Data : 17/03/2023
// Seção de Declarações 
var
custo : real
porc  : real
venda : real

inicio
// Seção de Comandos 
escreval("Qual o Preço de custo do Produto a venda?")
leia(custo)
escreval("Qual a Porcentagem Adicional de venda do produto?")
leia(porc)
venda <- custo + custo * (porc / 100)
escreval("O preço de venda é: R$ ",venda)
fimalgoritmo
