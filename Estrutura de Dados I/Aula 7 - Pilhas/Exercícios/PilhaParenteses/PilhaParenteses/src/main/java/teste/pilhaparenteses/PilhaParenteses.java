package teste.pilhaparenteses;

import java.util.Scanner;

/**
 *
 * @author Prof_Marcelo_Rauber
 */
public class PilhaParenteses {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a expressão: ");
        //String expressao = teclado.nextLine();
        //String expressao = "(2+4/(8*5)<(3))";
        String expressao = "(2+4))";

        if (verificarParenteses(expressao)) {
            System.out.println("Os parênteses estão balanceados.");
        } else {
            System.out.println("Os parênteses NÃO estão balanceados.");
        }
    }

    static boolean verificarParenteses(String expressao) {
        int tamanho = expressao.length();
        char pilha[] = new char[tamanho];
        int topo = -1;

        for (int i = 0; i < tamanho; i++) {
            char c = expressao.charAt(i);
            if (c == '(') {
                topo = empilharPush(pilha, c, topo);
                if (topo == -1) {
                    //System.out.println("Estouro de pilha, tela azul kkk");
                    return false; // Pilha cheia, erro
                }
            } else if (c == ')') {
                topo = desempilharPop(pilha, topo);
                if (topo < -1) {
                    return false; // Pilha vazia, erro
                }
            }
        }
        return topo == -1; // Se a pilha estiver vazia, está balanceado
    }

    static int empilharPush(char pilha[], char elemento, int topo) {
        int tamanho = pilha.length;
        if (topo == tamanho - 1) {
            return -1; // Pilha cheia
        }
        topo += 1;
        pilha[topo] = elemento;
        return topo;
    }

    static int desempilharPop(char pilha[], int topo) {
        //System.out.println("Removendo da pilha o seguinte elemento: " + pilha[topo]);
        topo = topo - 1;
        return topo;
    }
}
