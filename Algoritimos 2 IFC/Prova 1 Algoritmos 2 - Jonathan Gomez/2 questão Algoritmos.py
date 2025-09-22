valores = []

for i in range(25):
    valor = int(input("Digite um valor: "))
    valores.append(valor)

resultado = [-valor for valor in reversed(valores)]

print ("Vetor Resultado:")
print(resultado)