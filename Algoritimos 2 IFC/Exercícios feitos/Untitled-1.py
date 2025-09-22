#faça com que o programa conte do 1 até o n-ézimo numero e imprima
#todos os numeros até o N

#função while

def imprime_padrao(n):
    for i in range(1, n + 1):
        linha = ' '.join(str(j) for j in range(1, i + 1))
        print(linha)

# Solicita ao usuário que informe o valor de n
n = int(input("Digite um valor inteiro n: "))

# Chama a função para imprimir o padrão
imprime_padrao(n)
