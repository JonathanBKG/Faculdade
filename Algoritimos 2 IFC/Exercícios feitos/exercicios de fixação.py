# Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
# O usuário deve informar de qual numero ele deseja ver a tabuada.
contador = 0
num = int (input("Digite o número desejado para a tabuada.\n"))
while (contador <= 10) :
    resultado = contador * num 
    print(f"{contador} * {num} = {resultado}")
    contador = contador + 1
else:
    print("Tabuada Finalizada.")