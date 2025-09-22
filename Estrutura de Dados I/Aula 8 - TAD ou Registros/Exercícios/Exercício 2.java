package com.mycompany.exercicio_1_tad;

import java.util.Scanner;

class Tlivro {
    String titulo;
    String autor;
    int ano;
    String cidade;
    String editora;
}

public class Exercicio_2_TAD {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.print("Quantos livros deseja cadastrar? ");
        num = teclado.nextInt();
        teclado.nextLine(); // limpar o buffer do nextInt

        Tlivro[] livros = new Tlivro[num];

        for (int i = 0; i < num; i++) {
            livros[i] = new Tlivro();

            System.out.println("\nLivro " + (i + 1));
            System.out.print("Digite o título: ");
            livros[i].titulo = teclado.nextLine().toLowerCase();

            System.out.print("Digite o autor: ");
            livros[i].autor = teclado.nextLine();

            System.out.print("Digite o ano: ");
            livros[i].ano = teclado.nextInt();
            teclado.nextLine(); // limpar o buffer

            System.out.print("Digite a cidade: ");
            livros[i].cidade = teclado.nextLine();

            System.out.print("Digite a editora: ");
            livros[i].editora = teclado.nextLine();
        }

        boolean repetir = true;
        while (repetir) {
            System.out.print("\nDigite o nome do livro a ser buscado: ");
            String nome_livro = teclado.nextLine().toLowerCase();

            refBibliograf(livros, nome_livro);

            int resposta;
            do {
                System.out.print("\nDeseja pesquisar outro livro? (1 - Sim / 2 - Não): ");
                resposta = teclado.nextInt();
                teclado.nextLine(); // limpar o buffer

                if (resposta == 1) {
                    repetir = true;
                } else if (resposta == 2) {
                    repetir = false;
                } else {
                    System.out.println("Opção inválida!");
                }
            } while (resposta != 1 && resposta != 2);
        }

        teclado.close();
    }

    static void refBibliograf(Tlivro[] livros, String tituloBuscado) {
        boolean achou = false;

        for (Tlivro livro : livros) {
            if (livro.titulo.equals(tituloBuscado)) {
                String autor = livro.autor;
                int ultimoEspaco = autor.lastIndexOf(" ");
                String resto_nome = autor.substring(0, ultimoEspaco);
                String sobrenome = autor.substring(ultimoEspaco + 1);

                System.out.printf("\n%s, %s. %s. %s: %s, %d.\n", 
                    sobrenome.toUpperCase(),
                    resto_nome,
                    capitalizeTitulo(livro.titulo),
                    livro.cidade,
                    livro.editora,
                    livro.ano
                );
                achou = true;
                break;
            }
        }

        if (!achou) {
            System.out.println("Livro não encontrado!");
        }
    }

    static String capitalizeTitulo(String titulo) {
        String[] palavras = titulo.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String palavra : palavras) {
            if (palavra.length() > 0) {
                sb.append(Character.toUpperCase(palavra.charAt(0)))
                  .append(palavra.substring(1)).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
