# Faça um programa que leia e valide as seguintes informações:
# Nome: maior que 3 caracteres;
# Idade: entre 0 e 150;
# Salário: maior que zero;
# Sexo: 'f' ou 'm';
# Estado Civil: 's', 'c', 'v', 'd';


#Nome maior que 3 letras;

nome = str(input ("Digite seu nome completo:\n"))
while (len(nome)<= 3):
    print("Nome muito curto! Digite novamente.\n")
    nome = str(input ("Digite seu nome completo:\n"))

#Idade entre 0 e 150;

idade = int(input ("Digite sua idade:\n"))
while (idade > 150 or idade < 18):
    print("Você precisa ser maior de 18 anos! Digite novamente:\n")
    idade = int(input ("Digite sua idade:\n"))

#Salário: maior que zero;

salario = float(input("Digite seu salário:\n"))
while (salario < 600):
    print("Pobre.")
    salario = float(input("Digite seu salário VERDADEIRO.\n"))
if (salario < 1200):
    print("Pobre.\n")
        
sexo = str(input("Qual seu gênero? 'm' ou 'f'\n"))
while (sexo != 'm' and sexo != 'f'):
    print("SAI DAQ MILITANTE, TO FALANDO BIOLOGICAMENTE.\n")
    sexo = str(input("Qual seu gênero? 'm' ou 'f'\n"))

estadoC = str(input("Qual seu estado civil?'s', 'c', 'v', 'd'\n"))
while  (estadoC != "s" and estadoC != "c" and estadoC != "v" and estadoC != "d"):
    print("Digite um estado civil válido.\n")
    estadoC = str(input("Qual seu estado civil?'s', 'c', 'v', 'd'\n"))

print('-' * 18)
print("Seu nome:")
print(nome)

print("Sua idade:")
print(idade)
print()

print("Seu salário:")
print(salario)

print("Seu sexo:")
print(sexo)
print()

print("Seu estado civil:")
print(estadoC)
print('-' * 18)