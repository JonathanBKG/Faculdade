/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_de_pesquisa_time_de_futebol;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
/**
 *
 * @author Jonathan
 */
public class Projeto_de_pesquisa_Time_de_Futebol {
    static int     opcaoMenu = 99;
    static boolean infoCorreta;
    static String  entrada;

    static List<Jogador> jogadores = new ArrayList<>();
    static List<Treinador> treinadores = new ArrayList<>();
    static List<Jogo> jogos = new ArrayList<>();
    static List<Escalacao> escalacoes = new ArrayList<>();

    public static void main(String[] args) {
        while (opcaoMenu != 0){
            Scanner teclado = new Scanner(System.in);
            menu();
            opcaoMenu = teclado.nextInt();
            teclado.nextLine();

            switch (opcaoMenu){
                case 1:  // Adicionar Jogador.
                    infoCorreta = false;
                    while(infoCorreta == false){
                        System.out.println("Nome do Jogador:");
                        String nomeJogador = teclado.nextLine();

                        System.out.println("CPF do Jogador (Somente numeros*):");
                        String cpfJogador = teclado.nextLine();

                        // Validação de CPF antes de adicionar
                        String cpfFormatado = formatarCpf(cpfJogador);
                        if (cpfFormatado.equals("CPF inválido")) {
                            System.out.println("CPF inválido! Digite novamente.");
                            continue; // volta para preencher os dados do jogador
                        }

                        System.out.println("Posicao do Jogador:");
                        String posiJogador = teclado.nextLine();

                        System.out.println("Numero da camisa do Jogador:");
                        int numCam = teclado.nextInt();
                        teclado.nextLine();

                        System.out.println("Status do Jogador (Ativo, Reserva):");
                        String statusJog = teclado.nextLine();

                        System.out.println("Verifique se os dados estao corretos:");
                        System.out.println("Nome ---------: "+ nomeJogador);
                        System.out.println("CPF ----------: "+ formatarCpf(cpfJogador));
                        System.out.println("Posicao ------: "+ posiJogador);
                        System.out.println("Numero camisa : "+ numCam);
                        System.out.println("Status Jogador: "+ statusJog);

                        System.out.println("Os dados estao corretos? (Y/N)");
                        entrada = teclado.nextLine();

                        if (entrada.equalsIgnoreCase("Y")){
                            infoCorreta = true;
                            Jogador jogador = new Jogador(nomeJogador, cpfJogador, posiJogador, numCam, statusJog);
                            jogadores.add(jogador);
                        }
                    }
                    System.out.println("Jogador adicionado com Sucesso!");
                    break;
                case 2: // Adicionar Treinador.
                    infoCorreta = false;
                    while(infoCorreta == false){
                        System.out.println("Nome do Treinador:");
                        String nomeTreinador = teclado.nextLine();

                        System.out.println("CPF do Treinador (Somente numeros*):");
                        String cpfTreinador = teclado.nextLine();

                        System.out.println("Anos de experiencia do Treinador:");
                        int anosExp = teclado.nextInt();
                        teclado.nextLine();

                        System.out.println("Cargo do Treinador:");
                        String cargoTrei = teclado.nextLine();

                        System.out.println("Verifique se os dados estao corretos:");
                        System.out.println("Nome ---------------: "+ nomeTreinador);
                        System.out.println("CPF ----------------: "+ formatarCpf(cpfTreinador));
                        System.out.println("Anos de Experiencia : "+ anosExp);
                        System.out.println("Cargo --------------: "+ cargoTrei);

                        System.out.println("Os dados estao corretos? (Y/N)");
                        entrada = teclado.nextLine();

                        if (entrada.equalsIgnoreCase("Y")){
                            infoCorreta = true;
                            Treinador treinador = new Treinador(
                                nomeTreinador,
                                cpfTreinador,
                                anosExp,
                                cargoTrei
                            );
                            treinadores.add(treinador);
                            System.out.println("Treinador adicionado com Sucesso!");
                        }
                    }
                    break;
                    
                case 3: // Criar Escalaçao
                    if (jogos.isEmpty()) {
                        System.out.println("Nao existe nenhum jogo cadastrado! Cadastre pelo menos um jogo antes de criar uma escalacao.");
                        break; // Sai do case 3 e volta ao menu principal
                    }               
                    if (treinadores.isEmpty()) {
                        System.out.println("Nao existe nenhum treinador cadastrado! Cadastre pelo menos um treinador antes de criar uma escalacao.");
                        break; // Sai do case 3 e volta ao menu principal
                    }               
                    if (jogadores.isEmpty()) {
                        System.out.println("Nao existe nenhum jogador cadastrado! Cadastre pelo menos um jogador antes de criar uma escalacao.");
                        break; // Sai do case 3 e volta ao menu principal
                    }
                    
                    System.out.println("Criando nova escalacao...");

                    // Selecionar o jogo
                    System.out.println("Selecione o ID do Jogo:");
                    for (int i = 0; i < jogos.size(); i++) {
                        System.out.println(i + " - " + jogos.get(i).getTimeCasa() + " vs " + jogos.get(i).getTimeVisitante());
                    }
                    int idJogo = teclado.nextInt();
                    teclado.nextLine();
                    Jogo jogoSelecionado = jogos.get(idJogo);

                    // Selecionar o treinador
                    System.out.println("Selecione o ID do Treinador:");
                    for (int i = 0; i < treinadores.size(); i++) {
                        System.out.println(i + " - " + treinadores.get(i).getNome()); 
                    }
                    int idTreinador = teclado.nextInt();
                    teclado.nextLine();
                    Treinador treinadorSelecionado = treinadores.get(idTreinador);

                    // Selecionar jogadores
                    List<Jogador> listaJogadoresEscalados = new ArrayList<>();
                    System.out.println("Quantos jogadores quer escalar?");
                    int numEscalados = teclado.nextInt();
                    teclado.nextLine();
                    for (int i = 0; i < numEscalados; i++) {
                        System.out.println("Selecione o ID do jogador #" + (i+1) + ":");
                        for (int j = 0; j < jogadores.size(); j++) {
                            System.out.println(j + " - " + jogadores.get(j).getNome());
                        }
                        int idJogador = teclado.nextInt();
                        teclado.nextLine();
                        listaJogadoresEscalados.add(jogadores.get(idJogador));
                    }

                    // Definir data/hora atual
                    LocalDateTime momento = java.time.LocalDateTime.now();

                    // Criar objeto escalação
                    Escalacao novaEscalacao = new Escalacao(
                        escalacoes.size(), // id simples, pode ser ajustado depois
                        jogoSelecionado,
                        treinadorSelecionado,
                        listaJogadoresEscalados,
                        momento
                    );
                    escalacoes.add(novaEscalacao);
                    System.out.println("Escalação criada com sucesso!");
                    break;

                case 4: // Adicionar um Jogo novo
                    infoCorreta = false;
                    LocalDateTime dataHora = null;
                    boolean dataValida = false;
                    while(!infoCorreta) {
                        System.out.println("Time da casa:");
                        String timeCasa = teclado.nextLine();
                
                        System.out.println("Time visitante:");
                        String timeVisitante = teclado.nextLine();
                
                        while(!dataValida) {
                            System.out.println("Data e hora do jogo (ex: 2024-06-05T16:00):");
                            String dataHoraStr = teclado.nextLine();
                            try {
                                dataHora = LocalDateTime.parse(dataHoraStr);
                                dataValida = true;
                            } catch(DateTimeParseException e) {
                                System.out.println("Formato inválido! Tente novamente seguindo o exemplo.");
                            }
                        }                       
                
                        System.out.println("Local do jogo:");
                        String local = teclado.nextLine();
                
                        System.out.println("Verifique os dados:");
                        System.out.println("Time da casa: " + timeCasa);
                        System.out.println("Time visitante: " + timeVisitante);
                        System.out.println("Data/hora: " + dataHora);
                        System.out.println("Local: " + local);
                        System.out.println("Está correto? (Y/N):");
                        entrada = teclado.nextLine();
                
                        if (entrada.equalsIgnoreCase("Y")) {
                            infoCorreta = true;
                            Jogo jogo = new Jogo(
                                jogos.size(), // id
                                timeCasa,
                                timeVisitante,
                                dataHora,
                                local
                            );
                            jogos.add(jogo);
                            System.out.println("Jogo adicionado com sucesso!");
                        }
                    }
                    break;

                case 5: // Mostrar menu de listas (Jogadores, Treinadores, Escalacoes, Jogos)
                    int opcaoMenu5 = 99;
                    while(opcaoMenu5 != 0){
                        menu5();
                        opcaoMenu5 = teclado.nextInt();
                        teclado.nextLine();

                        switch (opcaoMenu5){
                            case 1:
                                if (jogadores.isEmpty()) {
                                    System.out.println("Nenhum jogador cadastrado.");
                                } else {
                                    System.out.println("Lista de Jogadores:");
                                    for (int i = 0; i < jogadores.size(); i++) {
                                        Jogador j = jogadores.get(i);
                                        System.out.println(i + " - Nome: " + j.getNome() +
                                                           ", CPF: " + formatarCpf(j.getCpf()) +
                                                           ", Posição: " + j.getPosicao() +
                                                           ", Camisa: " + j.getNumCamisa() +
                                                           ", Status: " + j.getStatus());
                                    }
                                }
                                break;

                            case 2:
                                if (treinadores.isEmpty()) {
                                    System.out.println("Nenhum treinador cadastrado.");
                                } else {
                                    System.out.println("Lista de Treinadores:");
                                    for (int i = 0; i < treinadores.size(); i++) {
                                        Treinador t = treinadores.get(i);
                                        System.out.println(i + " - Nome: " + t.getNome() +
                                                           ", CPF: " + formatarCpf(t.getCpf()) +
                                                           ", Anos de experiência: " + t.getAnosExp() +
                                                           ", Cargo: " + t.getCargo());
                                    }
                                }
                                break;


                            case 3:
                                if (escalacoes.isEmpty()) {
                                    System.out.println("Nenhuma escalação cadastrada.");
                                } else {
                                    System.out.println("Lista de Escalações:");
                                    for (int i = 0; i < escalacoes.size(); i++) {
                                        Escalacao e = escalacoes.get(i);
                                        System.out.println(i + " - Jogo: " + e.getJogo().getTimeCasa() + " vs " + e.getJogo().getTimeVisitante() +
                                                           ", Treinador: " + e.getTreinador().getNome() +
                                                           ", Data/Hora: " + e.getDataHora());
                                        System.out.println("    Jogadores escalados:");
                                        for (Jogador j : e.getJogadores()) {
                                            System.out.println("      - " + j.getNome() + ", Camisa: " + j.getNumCamisa());
                                        }
                                    }
                                }
                                break;

                            case 4:
                                if (jogos.isEmpty()) {
                                    System.out.println("Nenhum jogo cadastrado.");
                                } else {
                                    System.out.println("Lista de Jogos:");
                                    for (int i = 0; i < jogos.size(); i++) {
                                        Jogo jg = jogos.get(i);
                                        System.out.println(jg.getId() + " - " + jg.getTimeCasa() + " vs " + jg.getTimeVisitante() +
                                                           ", Data/Hora: " + jg.getDataHora() +
                                                           ", Local: " + jg.getLocal());
                                    }
                                }
                                break;

                        }
                    }
            }
        }
    }

    public static void menu(){
        System.out.println("--------------------------------------------------------");
        System.out.println("Seja bem-vindo ao programa de Escalação de times!");
        System.out.println("Selecione a opcao desejada:");
        System.out.println(" ");
        System.out.println("1 - Adicionar Jogador.");
        System.out.println("2 - Adicionar Treinador.");
        System.out.println("3 - Criar Escalacao.");
        System.out.println("4 - Adicionar um Jogo novo.");
        System.out.println("5 - Mostrar listas.");
        System.out.println(" ");
        System.out.println("0 - Sair.");
        System.out.println("--------------------------------------------------------");
    } 

    public static void menu5(){
        System.out.println("--------------------------------------------------------");
        System.out.println("Selecione qual lista voce gostaria de visualizar.");
        System.out.println("1 - Listar Jogadores.");
        System.out.println("2 - Listar Treinadores.");
        System.out.println("3 - Listar Escalacoes.");
        System.out.println("4 - Listar Jogos.");
        System.out.println(" ");
        System.out.println("0 - Sair.");
        System.out.println("--------------------------------------------------------");
    }

    public static String formatarCpf(String cpf){
        // Remove tudo que não é número
        cpf = cpf.replaceAll("\\D", "");
        if(cpf.length() != 11) {
            return "CPF inválido";
        }
        return cpf.substring(0, 3) + "." + 
               cpf.substring(3, 6) + "." + 
               cpf.substring(6, 9) + "-" + 
               cpf.substring(9, 11);
        
    }
}
