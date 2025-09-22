# Solicita que o usuário insira um nome
nome = input("Digite o seu nome: ")

# Nome do arquivo onde o nome será salvo
nome_arquivo = "nome.txt"

# Abre o arquivo em modo de escrita (modo 'w')
with open(nome_arquivo, "w") as arquivo:
    # Escreve o nome no arquivo
    arquivo.write(nome)

# Exibe uma mensagem para informar que o nome foi salvo
print(f"Nome '{nome}' salvo com sucesso no arquivo '{nome_arquivo}'!")

# Abre o arquivo em modo de leitura (modo 'r')
with open(nome_arquivo, "r") as arquivo:
    conteudo = arquivo.read()  # Lê todo o conteúdo do arquivo

# Exibe o conteúdo do arquivo
print("Conteúdo do arquivo:")
print(conteudo)
