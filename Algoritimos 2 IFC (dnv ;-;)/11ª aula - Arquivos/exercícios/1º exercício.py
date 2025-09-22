with open ("nomes.txt", "w") as nomes:
    nome = input("Digite o nome para ser gravado no arquivo:\n")
    nomes.write(f"{nome}\n")