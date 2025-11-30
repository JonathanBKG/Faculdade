/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_de_gestao_de_biblioteca;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Jonathan
 */
public class Sistema_de_Gestao_de_Biblioteca {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Bibliotecario> bibliotecarios = new ArrayList<>();
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        ArrayList<Reserva> reservas = new ArrayList<>();
        
//-----------ADICIONANDO EXEMPLOS PRE ADICIONADOS-------------------------------------
        // Dados iniciais
        //Livros
        livros.add(new Livro(0, "Clean Code", "Robert Martin",
                "Prentice Hall", "Programacao", "LIV001", "disponivel"));
        livros.add(new Livro(1, "Domain-Driven Design", "Eric Evans",
                "Addison-Wesley", "Engenharia", "LIV002", "emprestado"));

        // Usuarios
        usuarios.add(new Usuario(0, "Ana Silva", "ana@email.com",
                "11999990000", "Aluno"));
        usuarios.add(new Usuario(1, "Carlos Souza", "carlos@email.com",
                "11888880000", "Professor"));

        // Bibliotecario
        bibliotecarios.add(new Bibliotecario(0, "Joao Bibliotecario",
                "joao", "1234"));

        // Emprestimo inicial: livro 1 para usuario 0
        Emprestimo empInicial = new Emprestimo(
                0,
                "01/06/2025",
                "10/06/2025",
                "Ativo",
                0.0,
                livros.get(1),
                usuarios.get(0)
        );
        emprestimos.add(empInicial);
        // Reserva inicial: usuario 1 reservando livro 0
        Reserva resInicial = new Reserva(
                0,
                usuarios.get(1),
                livros.get(0),
                "02/06/2025",
                "Ativa"
        );
        reservas.add(resInicial);
//-------------------------------------------------------------------------------------
        int opcao;

        do {
            System.out.println("-----------------------MENU-----------------------");
            System.out.println("1- Registrar novo Livro");
            System.out.println("2- Registrar novo Emprestimo");
            System.out.println("3- Adicionar Reserva");
            System.out.println("4- Cadastrar Usuario");
            System.out.println("5- Cadastrar Bibliotecario");
            System.out.println("6- Registrar Devolucao de Emprestimo");
            System.out.println("7- Mostrar Listas");
            System.out.println("0- Sair");
            System.out.println("--------------------------------------------------");
            System.out.print("Escolha uma opcao: ");
            opcao = teclado.nextInt();
            teclado.nextLine(); // consumir o ENTER

            switch (opcao) {
                case 1:
                    System.out.println("=== Cadastro de novo livro ===");

                    System.out.print("Informe o titulo: ");
                    String titulo = teclado.nextLine();

                    System.out.print("Informe o autor: ");
                    String autor = teclado.nextLine();

                    System.out.print("Informe a editora: ");
                    String editora = teclado.nextLine();

                    System.out.print("Informe a categoria: ");
                    String categoria = teclado.nextLine();

                    System.out.print("Informe o codigo identificador: ");
                    String codigoIdentificador = teclado.nextLine();

                    String status = "disponivel";

                    Livro novoLivro = new Livro(
                        livros.size(), // id gerado automaticamente
                        titulo,
                        autor,
                        editora,
                        categoria,
                        codigoIdentificador,
                        status
                    );

                    livros.add(novoLivro);

                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("=== Registrar novo emprestimo ===");
                    
                    // Listar usuarios
                    System.out.println("\nUsuarios cadastrados:");
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println(i + " - " + usuarios.get(i).getNome());
                    }

                    System.out.print("\nInforme o id do usuario: ");
                    int idUsuarioEmp = teclado.nextInt();
                    teclado.nextLine();

                    // Listar livros disponiveis
                    System.out.println("\nLivros disponiveis:");
                    boolean temLivroDisponivel = false;
                    for (int i = 0; i < livros.size(); i++) {
                        if (livros.get(i).isDisponivel()) {
                            System.out.println(i + " - " + livros.get(i).getTitulo() + " (" + livros.get(i).getAutor() + ")");
                            temLivroDisponivel = true;
                        }
                    }

                    if (!temLivroDisponivel) {
                        System.out.println("Nenhum livro disponivel para emprestimo.");
                        break;
                    }

                    System.out.print("\nInforme o id do livro: ");
                    int idLivroEmp = teclado.nextInt();
                    teclado.nextLine();

                    if (idUsuarioEmp < 0 || idUsuarioEmp >= usuarios.size()
                        || idLivroEmp < 0 || idLivroEmp >= livros.size()) {
                        System.out.println("Usuario ou livro nao encontrado.");
                        break;
                    }

                    Usuario usuarioEmp = usuarios.get(idUsuarioEmp);
                    Livro livroEmp = livros.get(idLivroEmp);

                    if (!livroEmp.isDisponivel()) {
                        System.out.println("Livro nao esta disponivel para emprestimo.");
                        break;
                    }

                    System.out.print("Informe a data do emprestimo: ");
                    String dataEmp = teclado.nextLine();

                    System.out.print("Informe a data de devolucao: ");
                    String dataDev = teclado.nextLine();

                    Emprestimo novoEmprestimo = new Emprestimo(
                        emprestimos.size(), // id
                        dataEmp,
                        dataDev,
                        "Ativo",
                        0.0,
                        livroEmp,
                        usuarioEmp
                    );

                    emprestimos.add(novoEmprestimo);
                    livroEmp.marcarComoEmprestado();

                    System.out.println("Emprestimo registrado com sucesso!");
                    break;

                case 3:
                    System.out.println("=== Adicionar reserva ===");

                    // Listar usuarios
                    System.out.println("\nUsuarios cadastrados:");
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println(i + " - " + usuarios.get(i).getNome());
                    }

                    System.out.print("Informe o id do usuario: ");
                    int idUsuarioRes = teclado.nextInt();
                    teclado.nextLine();

                    // Listar livros disponiveis
                    System.out.println("\nLivros disponiveis:");
                    temLivroDisponivel = false;
                    for (int i = 0; i < livros.size(); i++) {
                        if (livros.get(i).isDisponivel()) {
                            System.out.println(i + " - " + livros.get(i).getTitulo() + " (" + livros.get(i).getAutor() + ")");
                            temLivroDisponivel = true;
                        }
                    }

                    if (!temLivroDisponivel) {
                        System.out.println("Nenhum livro disponivel para emprestimo.");
                        break;
                    }

                    System.out.print("Informe o id do livro: ");
                    int idLivroRes = teclado.nextInt();
                    teclado.nextLine();

                    if (idUsuarioRes < 0 || idUsuarioRes >= usuarios.size()
                        || idLivroRes < 0 || idLivroRes >= livros.size()) {
                        System.out.println("Usuario ou livro nao encontrado.");
                        break;
                    }

                    Usuario usuarioRes = usuarios.get(idUsuarioRes);
                    Livro livroRes = livros.get(idLivroRes);

                    System.out.print("Informe a data da reserva: ");
                    String dataReserva = teclado.nextLine();

                    Reserva novaReserva = new Reserva(
                        reservas.size(), // id
                        usuarioRes,
                        livroRes,
                        dataReserva,
                        "Ativa"
                    );

                    reservas.add(novaReserva);

                    System.out.println("Reserva cadastrada com sucesso!");
                    break;

                case 4:
                    System.out.println("=== Cadastro de usuario ===");

                    System.out.print("Informe o nome: ");
                    String nomeUsuario = teclado.nextLine();

                    System.out.print("Informe o email: ");
                    String email = teclado.nextLine();

                    System.out.print("Informe o telefone: ");
                    String telefone = teclado.nextLine();

                    System.out.print("Informe o tipo (Aluno, Professor ou Visitante): ");
                    String tipo = teclado.nextLine();

                    Usuario novoUsuario = new Usuario(
                        usuarios.size(), // id
                        nomeUsuario,
                        email,
                        telefone,
                        tipo
                    );

                    usuarios.add(novoUsuario);

                    System.out.println("Usuario cadastrado com sucesso!");
                    break;

                case 5:
                    System.out.println("=== Cadastro de bibliotecario ===");

                    System.out.print("Informe o nome: ");
                    String nomeBiblio = teclado.nextLine();

                    System.out.print("Informe o login: ");
                    String loginBiblio = teclado.nextLine();

                    System.out.print("Informe a senha: ");
                    String senhaBiblio = teclado.nextLine();

                    Bibliotecario novoBibliotecario = new Bibliotecario(
                        bibliotecarios.size(), // id
                        nomeBiblio,
                        loginBiblio,
                        senhaBiblio
                    );

                    bibliotecarios.add(novoBibliotecario);

                    System.out.println("Bibliotecario cadastrado com sucesso!");
                    break;

                case 6:
                    System.out.println("=== Registrar devolucao de emprestimo ===");
                    if (emprestimos.isEmpty()) {
                        System.out.println("Nao ha emprestimos cadastrados.");
                        break;
                    }

                    System.out.println("\nEmprestimos cadastrados:");
                    for (int i = 0; i < emprestimos.size(); i++) {
                        Emprestimo e = emprestimos.get(i);
                        System.out.println(i + " - Livro: " + e.getLivro().getTitulo()
                                + " | Usuario: " + e.getUsuario().getNome()
                                + " | Status: " + e.getStatus()
                                + " | Data emprestimo: " + e.getDataEmprestimo()
                                + " | Data devolucao: " + e.getDataDevolucao());
                    }

                    System.out.print("Informe o id do emprestimo: ");
                    int idEmpDev = teclado.nextInt();
                    teclado.nextLine();

                    if (idEmpDev < 0 || idEmpDev >= emprestimos.size()) {
                        System.out.println("Emprestimo nao encontrado.");
                        break;
                    }

                    Emprestimo emprestimoDev = emprestimos.get(idEmpDev);

                    System.out.print("Informe a data de devolucao: ");
                    String dataDevReal = teclado.nextLine();

                    System.out.print("Informe o valor da multa (0 se nao houver): ");
                    double multaDev = teclado.nextDouble();
                    teclado.nextLine();

                    emprestimoDev.registrarDevolucao(dataDevReal, multaDev);

                    System.out.println("Devolucao registrada com sucesso!");
                    break;

                case 7:
                    System.out.println("=== Listas ===");
                    System.out.println("1- Listar Livros");
                    System.out.println("2- Listar Emprestimos");
                    System.out.println("3- Listar Reservas");
                    System.out.println("4- Listar Usuarios");
                    System.out.println("5- Listar Bibliotecarios");
                    System.out.print("Escolha uma opcao: ");
                    int opcLista = teclado.nextInt();
                    teclado.nextLine();
                
                    switch (opcLista) {
                        case 1:
                            System.out.println("=== Lista de livros cadastrados ===");
                            if (livros.isEmpty()) {
                                System.out.println("Nenhum livro cadastrado.");
                            } else {
                                for (Livro l : livros) {
                                    System.out.println("----------------------------");
                                    System.out.println("Id: " + l.getId());
                                    System.out.println("Titulo: " + l.getTitulo());
                                    System.out.println("Autor: " + l.getAutor());
                                    System.out.println("Editora: " + l.getEditora());
                                    System.out.println("Categoria: " + l.getCategoria());
                                    System.out.println("Codigo: " + l.getCodigoIdentificador());
                                    System.out.println("Status: " + l.getStatus());
                                }
                                System.out.println("----------------------------");
                            }
                            break;
                        case 2:
                            System.out.println("=== Lista de emprestimos ===");
                            if (emprestimos.isEmpty()) {
                                System.out.println("Nenhum emprestimo cadastrado.");
                            } else {
                                for (int i = 0; i < emprestimos.size(); i++) {
                                    Emprestimo e = emprestimos.get(i);
                                    System.out.println("----------------------------");
                                    System.out.println("Id: " + i);
                                    System.out.println("Livro: " + e.getLivro().getTitulo());
                                    System.out.println("Usuario: " + e.getUsuario().getNome());
                                    System.out.println("Status: " + e.getStatus());
                                    System.out.println("Data emprestimo: " + e.getDataEmprestimo());
                                    System.out.println("Data devolucao: " + e.getDataDevolucao());
                                    System.out.println("Multa: " + e.getMulta());
                                }
                                System.out.println("----------------------------");
                            }
                            break;
                        case 3:
                            System.out.println("=== Lista de reservas ===");
                            if (reservas.isEmpty()) {
                                System.out.println("Nenhuma reserva cadastrada.");
                            } else {
                                for (int i = 0; i < reservas.size(); i++) {
                                    Reserva r = reservas.get(i);
                                    System.out.println("----------------------------");
                                    System.out.println("Id: " + i);
                                    System.out.println("Livro: " + r.getLivro().getTitulo());
                                    System.out.println("Usuario: " + r.getUsuario().getNome());
                                    System.out.println("Data reserva: " + r.getDataReserva());
                                    System.out.println("Status: " + r.getStatus());
                                }
                                System.out.println("----------------------------");
                            }
                            break;
                        case 4:
                            System.out.println("=== Lista de usuarios ===");
                            if (usuarios.isEmpty()) {
                                System.out.println("Nenhum usuario cadastrado.");
                            } else {
                                for (int i = 0; i < usuarios.size(); i++) {
                                    Usuario u = usuarios.get(i);
                                    System.out.println("----------------------------");
                                    System.out.println("Id: " + i);
                                    System.out.println("Nome: " + u.getNome());
                                    System.out.println("Email: " + u.getEmail());
                                    System.out.println("Telefone: " + u.getTelefone());
                                    System.out.println("Tipo: " + u.getTipo());
                                }
                                System.out.println("----------------------------");
                            }
                            break;
                        case 5:
                            System.out.println("=== Lista de bibliotecarios ===");
                            if (bibliotecarios.isEmpty()) {
                                System.out.println("Nenhum bibliotecario cadastrado.");
                            } else {
                                for (int i = 0; i < bibliotecarios.size(); i++) {
                                    Bibliotecario b = bibliotecarios.get(i);
                                    System.out.println("----------------------------");
                                    System.out.println("Id: " + i);
                                    System.out.println("Nome: " + b.getNome());
                                    System.out.println("Login: " + b.getLogin());
                                }
                                System.out.println("----------------------------");
                            }
                            break;
                        default:
                            System.out.println("Opcao invalida.");
                    }
                    break;
            }

        } while (opcao != 0);

        teclado.close();
    }
}


