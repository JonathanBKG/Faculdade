algoritmo "semnome"
// Função :
// Autor :
// Data : 29/03/2023
// Seção de Declarações 
var
entrada : caractere
continua: inteiro
inicio
// Seção de Comandos
continua<-1
escreval("Informe o Sexo (M ou F)")

enquanto (continua = 1) faca

  continua <- 0
  leia(entrada)
  se (entrada = "M") entao
    escreval("Você inseriu Masculino")
  senao
    se(entrada = "F") entao
      escreval("Você inseriu Feminino")
    senao
      escreval("Caractere inválida, digite novamente...")
      continua<-1
    fimse
  fimse


fimenquanto
fimalgoritmo
