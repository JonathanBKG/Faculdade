algoritmo "média dos alunos"
// Função : calcular a média dos alunos matriculados
// Quantidade de alunos: 15

// Autor : Jonathan Gomez
// Data : 29/03/2023
// Seção de Declarações 
var
nota1, nota2, nota3    :real
NOTAF1, NOTAF2, NOTAF3 :real
media1, media2, media3 :real
Alunos                 :inteiro
cont                   :inteiro
inicio
// Seção de Comandos
escreval("Informe a quantidade de Alunos Matriculados: ")
leia(Alunos)
cont <- 1
NOTAF1 <-0
NOTAF2 <-0
NOTAF3 <-0
enquanto (cont <= Alunos) faca
  escreval("Aluno Nº", cont)
  escreval("Qual a nota da 1º prova?")
  leia(nota1)
  escreval("Qual a nota da 2º prova?")
  leia(nota2)
  escreval("Qual a nota da 3º prova?")
  leia(nota3)

  NOTAF1 <- NOTAF1 + nota1
  NOTAF2 <- NOTAF2 + nota2
  NOTAF3 <- NOTAF3 + nota3
  

  escreval(" ")
  cont<- cont + 1
fimenquanto

media1<- NOTAF1 / Alunos
  escreval("A média da Turma na 1º prova é: ", media1)
  escreval(" ")
media2<- NOTAF2 / Alunos
  escreval("A média da Turma na 2º prova é: ", media2)
  escreval(" ")
media3<- NOTAF3 / Alunos
  escreval("A média da Turma na 3º prova é: ", media3)
  escreval(" ")
fimalgoritmo
