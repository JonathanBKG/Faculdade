# Variáveis
totalSal = 0
cont     = 1
medSal   = 0
medNumF  = 0
porcent  = 0
numFTotal= 0
MaiorSal = 0
contSalM = 0
Tam      = 100

while cont <= Tam:
    # A média de salário das 100 pessoas
    contSal = int(input(f"Digite o salário da pessoa nº {cont}: "))
    totalSal += contSal

    # A média do número de filhos
    contNumF = int(input(f"Quantos filhos a pessoa nº {cont} tem? "))
    numFTotal += contNumF

    # O maior salário
    if contSal >= MaiorSal:
        MaiorSal = contSal

    # A percentagem de pessoas com salários até R$ 1500,00
    if contSal <= 1500:
        contSalM += 1

    # Próxima pessoa
    cont += 1 

# Cálculos finais
medSal = totalSal / Tam
medNumF = numFTotal / Tam
porcent = (contSalM / Tam) * 100

# Exibição dos resultados
print(f"A média de salários é de: R$ {medSal:.2f}")
print(f"A média de filhos entre essas pessoas é de: {medNumF:.2f} filhos.")
print(f"O maior salário entre essas 100 pessoas é: R$ {MaiorSal:.2f}")
print(f"A porcentagem de pessoas com salários até R$1.500,00 é de: {porcent:.2f}%")