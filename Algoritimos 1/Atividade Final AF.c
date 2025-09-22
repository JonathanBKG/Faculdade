#include <stdio.h>
#include <stdlib.h>

typedef struct {
    char codigo[20];
    char nome[50];
    int quantidade;
    float valor;
} Produto;

int main() {
    Produto* produtos = NULL;
    int numProdutos = 0;

    char clienteNome[50];
    char clienteEndereco[100];
    char clienteTelefone[15];
    char clienteData[20];

    printf("Dados do cliente:\n");
    printf("Nome: ");
    scanf(" %[^\n]s", clienteNome);

    printf("Endereço: ");
    scanf(" %[^\n]s", clienteEndereco);

    printf("Telefone: ");
    scanf(" %[^\n]s", clienteTelefone);

    printf("Data: ");
    scanf(" %[^\n]s", clienteData);

    int opcao;

    do {
        printf("\n--- Menu ---\n");
        printf("1. Adicionar produto\n");
        printf("2. Editar produto\n");
        printf("3. Excluir produto\n");
        printf("4. Mostrar orçamento\n");
        printf("5. Sair\n");

        printf("\nEscolha uma opção: ");
        scanf("%d", &opcao);

        if (opcao == 1) {
            produtos = (Produto*)realloc(produtos, (numProdutos + 1) * sizeof(Produto));

            Produto* novoProduto = &produtos[numProdutos];

            printf("Nome: ");
            scanf(" %[^\n]s", novoProduto->nome);

            printf("Código: ");
            scanf(" %[^\n]s", novoProduto->codigo);

            printf("Quantidade: ");
            scanf("%d", &(novoProduto->quantidade));

            printf("Valor: ");
            scanf("%f", &(novoProduto->valor));

            numProdutos++;
        } else if (opcao == 2) {
            int index;

            printf("Digite o número do produto que deseja editar: ");
            scanf("%d", &index);
            index--;

            if (index >= 0 && index < numProdutos) {
                Produto* produto = &produtos[index];

                printf("Nome: ");
                scanf(" %[^\n]s", produto->nome);

                printf("Código: ");
                scanf(" %[^\n]s", produto->codigo);

                printf("Quantidade: ");
                scanf("%d", &(produto->quantidade));

                printf("Valor: ");
                scanf("%f", &(produto->valor));
            } else {
                printf("Número de produto inválido.\n");
            }
        } else if (opcao == 3) {
            int index;

            printf("Digite o número do produto que deseja excluir: ");
            scanf("%d", &index);
            index--;

            if (index >= 0 && index < numProdutos) {
                Produto* produto = &produtos[index];

                for (int i = index; i < numProdutos - 1; i++) {
                    produtos[i] = produtos[i + 1];
                }

                produtos = (Produto*)realloc(produtos, (numProdutos - 1) * sizeof(Produto));
                numProdutos--;

                printf("O produto \"%s\" foi removido.\n", produto->nome);
            } else {
                printf("Número de produto inválido.\n");
            }
        } else if (opcao == 4) {
            printf("\n--- Dados do cliente ---\n");
            printf("Nome: %s\n", clienteNome);
            printf("Endereço: %s\n", clienteEndereco);
            printf("Telefone: %s\n", clienteTelefone);
            printf("Data: %s\n\n", clienteData);

            printf("--- Orçamento ---\n");
            float valorTotal = 0;

            for (int i = 0; i < numProdutos; i++) {
                printf("\nProduto #%d:\n", i + 1);
                printf("Nome: %s\n", produtos[i].nome);
                printf("Código: %s\n", produtos[i].codigo);
                printf("Quantidade: %d\n", produtos[i].quantidade);
                printf("Valor: R$%.2f\n", produtos[i].valor);

                valorTotal += produtos[i].valor * produtos[i].quantidade;
            }

            printf("\nValor total do orçamento: R$%.2f\n", valorTotal);
        } else if (opcao == 5) {
            printf("\n--- Resumo do orçamento ---\n");
            printf("Cliente: %s\n", clienteNome);

            float valorTotal = 0;

            for (int i = 0; i < numProdutos; i++) {
                printf("Produto: %s\n", produtos[i].nome);
                printf("Código: %s\n", produtos[i].codigo);
                printf("Valor total: R$%.2f\n\n", produtos[i].valor * produtos[i].quantidade);

                valorTotal += produtos[i].valor * produtos[i].quantidade;
            }

            printf("Valor total do orçamento: R$%.2f\n", valorTotal);

            break;
        } else {
            printf("Opção inválida. Tente novamente.\n");
        }
    } while (opcao != 5);

    

    return 0;
}
