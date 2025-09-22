#Lê o nome do usuário
nome = input("Digite seu nome: ")

#Converte o nome para letras maiúsculas [.upper()] 
nome_maiusculo = nome.upper()

# Exibe o nome na vertical em forma de escada
for i in range(1, len(nome_maiusculo) + 1):
    print(nome_maiusculo[:i])
