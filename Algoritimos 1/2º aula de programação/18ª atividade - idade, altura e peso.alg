algoritmo "Pesquisa"
// Função :
// Autor : Jonathan
// Data : 30/03/2023
// Seção de Declarações
Var

  i, idade, altura, peso, somaAlturas, qtdPessoas, qtdMaiores30, qtdAcima60kg: inteiro
  mediaAlturas: real
   
Inicio

  somaAlturas <- 0
  qtdPessoas <- 0
  qtdMaiores30 <- 0
  qtdAcima60kg <- 0

  Para i <- 1 ate 10 faca
    escreval("Digite a idade da pessoa ", i, ": ")
    leia(idade)

    escreval("Digite a altura da pessoa ", i, ": ")
    leia(altura)

    escreval("Digite o peso da pessoa ", i, ": ")
    leia(peso)

    se (idade > 30) entao
      qtdMaiores30 <- qtdMaiores30 + 1
    fimse

    se (idade >= 20) e (idade <= 30) entao
      somaAlturas <- somaAlturas + altura
      qtdPessoas <- qtdPessoas + 1
    fimse

    se (peso > 60) entao
      qtdAcima60kg <- qtdAcima60kg + 1
    fimse

  fimpara

  se qtdPessoas > 0 entao
    mediaAlturas <- somaAlturas / qtdPessoas
  fimse

  escreval("Número de pessoas com idade maior que 30 anos: ", qtdMaiores30)
  escreval(" ")
  escreval("Média das alturas das pessoas entre 20 e 30 anos: ", mediaAlturas)
  escreval(" ")
  escreval("Porcentagem de pessoas acima de 60 Kg: ", (qtdAcima60kg * 100) / 10, "%")

Fimalgoritmo
