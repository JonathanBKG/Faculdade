numeros_positivos = []
numeros_negativos = []

for i in range(8):
    numero = int(input("Digite um número inteiro: "))
    if numero > 0:
        numeros_positivos.append(numero)
    elif numero < 0:
        numeros_negativos.append(numero)

print("Numeros positivos:", numeros_positivos)
print("Números negativos:", numeros_negativos)