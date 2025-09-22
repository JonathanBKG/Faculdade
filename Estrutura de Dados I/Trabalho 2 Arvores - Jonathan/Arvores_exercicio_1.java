/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arvores_exercicio_1;
import java.util.Scanner;
/**
 *
 * @author Jonathan
 */
class No{
    String texto;
    No A;
    No B;
    No C;

    No(String texto){
        this.texto = texto;
    }
}


public class Arvores_exercicio_1 {


static void menu(){
    System.out.println("==========================================");
    System.out.println("Seja bem-vindo ao Robin Hood RPG!");
    System.out.println("==========================================\n");
    System.out.println("    1 - Iniciar novo jogo.");
    System.out.println("    0 - Sair.\n");
}

    public static void main(String[] args) {
        int opcao;
        boolean loop = true;
        Scanner teclado = new Scanner(System.in);
        
        while (loop == true){
            menu();
            opcao = teclado.nextInt();
            if (opcao == 1){

                No inicio = new No("""
                        Voce e Robin Hood, o fora-da-lei mais procurado da Inglaterra.
                        Seu objetivo e claro: roubar dos ricos e dar aos pobres,
                        enquanto desafia o poder tiranico do Principe Joao.

                        Mas o caminho que voce escolhe pode mudar a historia. . .

                        ---------------------------------------------------------------------

                        Voce e seus companheiros estao escondidos na floresta de Sherwood. 
                        O povo esta sofrendo com os altos impostos. 
                        
                        Qual sera sua primeira acao?

                            A. Atacar uma caravana real carregando ouro.
                            B. Espalhar panfletos incentivando a rebeliao popular.
                            C. Se infiltrar no castelo como espiao disfarcado.
                        """);
                
                No cena1A = new No("""
                        Sucesso! 
                        Voce consegue ouro e ganha a confianca dos pobres!

                        O povo te ama, mas o xerife de Nottingham dobrou a seguranca.
                        ---------------------------------------------------------------------

                        O que fazer?
                            A. Criar um esconderijo secreto para os refugiados.
                            B. Enfrentar o xerife diretamente numa emboscada.
                            C. Usar o ouro para subornar informantes do castelo.

                        """);
                No cena1B = new No("""
                        O povo se anima, mas os guardas ficam em alerta.
                        Os nobres estao com medo. 
                        ---------------------------------------------------------------------

                        O povo esta do seu lado, mas sem recursos. Você…
                            A. Ensina o povo a lutar e se defender.
                            B. Rouba mantimentos e armas de um mosteiro rico.
                            C. Pede ajuda a Lady Marian para organizar um motim.
                        """);

                No cena1C = new No("""
                        Voce descobre que o Principe Joao pretende assassinar o Rei Ricardo 
                        em seu retorno da cruzada. 
                        ---------------------------------------------------------------------
                        
                        O que faz?

                            A. Volta para a floresta e planeja um resgate do rei.
                            B. Tenta assassinar o Principe Joao antes.
                            C. Alerta os nobres fieis ao rei.
                        """);

                // Ligando a camada 0 na camada 1
                inicio.A = cena1A;
                inicio.B = cena1B;
                inicio.C = cena1C;

                No cena_2A = new No("""
                        Os refugiados sao protegidos, mas o xerife ameaca queimar Sherwood.
                        O esconderijo em Sherwood abriga dezenas de pobres fugindo da opressao.

                        Mas o xerife descobre pistas sobre a localizacao.
                        ---------------------------------------------------------------------

                        O que você faz para proteger o esconderijo?
                            A. Cria armadilhas na floresta para deter os guardas.
                            B. Engana o xerife enviando pistas falsas.
                            C. Ordena a evacuacao do esconderijo para um local mais remoto.
                        """);

                No cena_2B = new No("""
                        A emboscada falha e voce e capturado

                        =========================
                        FINAL RUIM:
                        Enforcado na praca
                        =========================

                        final 10/33.
                        """);

                No cena_2C = new No("""
                        Os informantes dizem que havera uma coleta extraordinaria de impostos
                        em um vilarejo pobre para pagar um baile nobre.

                        ---------------------------------------------------------------------
                        O que voce faz com essa informacao?
                            A. Ataca a comitiva dos coletores e devolve os impostos.
                            B. Se disfarca de coletor e se infiltra para roubar durante o baile.
                            C. Convoca o povo para impedir a coleta publicamente.
                        """);

                No cena_2D = new No("""
                        O povo começa a resistir, mas ha muitas baixas.

                        Voce treina jovens e camponeses.

                        A resistencia comeca a crescer, mas o xerife declara guerra aberta 
                        contra Sherwood

                        ---------------------------------------------------------------------
                        Como voce reage?
                            A. Organiza guerrilhas rápidas para atacar e recuar.
                            B. Constroi barricadas e defende Sherwood ate o fim.
                            C. Tenta fazer uma alianca com bandidos rivais.
                        """);

                No cena_2E = new No("""
                        Os monges denunciam voce — cacado como criminoso religioso.

                        =========================
                        FINAL RUIM
                        =========================

                        final 27/33
                        """);

                No cena_2F = new No("""
                        Lady Marian convence os cavaleiros de York a se unirem a Robin, 
                        mas o exército ainda é pequeno.

                        ---------------------------------------------------------------------
                        Qual o plano para derrubar o Principe Joao?
                            A. Atacar o castelo de Nottingham com tudo.
                            B. Esperar o retorno do Rei Ricardo e preparar terreno.
                            C. Raptar o Principe João e forçar negociações.
                        """);
                
                No cena_2G = new No("""
                        Voce instercepta os assassinos e salva Ricardo.

                        =========================
                        FINAL HEROICO

                        Voce salva o rei, 
                        os impostos sao cancelados,
                        o povo e livre!
                        =========================
                        
                        final 31/33
                        """);

                No cena_2H = new No("""
                        Voce falha e e executado.

                        =========================
                        FINAL TRAGICO

                        Voce e morto,
                        mas vira lenda.
                        O povo continua a luta.
                        =========================

                        final 32/33
                        """);

                No cena_2I = new No("""
                        Os nobres te traem.

                        =========================
                        FINAL RUIM

                        Emboscado e morto.
                        =========================

                        final 33/33
                        """);

                cena1A.A = cena_2A;
                cena1A.B = cena_2B;
                cena1A.C = cena_2C;

                cena1B.A = cena_2D;
                cena1B.B = cena_2E;
                cena1B.C = cena_2F;

                cena1C.A = cena_2G;
                cena1C.B = cena_2H;
                cena1C.C = cena_2I;

                No cena_3A = new No("""
                        As armadilhas funcionam contra os soldados, 
                        mas ferem alguns refugiados. 
                        
                        O povo começa a desconfiar da sua liderança.

                        ---------------------------------------------------------------------
                        Como você recupera a confiança do povo?
                            A. Organiza uma cerimonia de homenagem as vitimas e reforça a seguranca.
                            B. Da recompensas em comida e ouro para as familias afetadas.
                            C. Culpa um aliado e o expulsa para manter sua imagem.
                        """);
                No cena_3B = new No("""
                        O xerife manda suas tropas para o norte, 
                        enquanto voce fortalece Sherwood no sul.

                        ---------------------------------------------------------------------
                        Como aproveitar a distracao?
                            A. Ataca os cofres reais enquanto estao vazios de guardas.
                            B. Resgata prisioneiros politicos da masmorra.
                            C. Sabota as provisões militares do xerife.
                        """);
                No cena_3C = new No("""
                        Durante a fuga, parte do grupo e capturado.

                        ---------------------------------------------------------------------
                        O que fazer?

                            A. Tentar resgatar os prisioneiros com uma missao suicida.
                            B. Negociar sua rendicao em troca da liberdade deles.
                            C. Sacrificar os capturados para salvar os demais.
                        """);

                cena_2A.A = cena_3A;
                cena_2A.B = cena_3B;
                cena_2A.C = cena_3C;  
                
                No cena_3D = new No("""
                        Você vira heroi local, mas o xerife envia reforços para captura-lo.

                        ---------------------------------------------------------------------
                        Como resistir ao contra-ataque?
                            A. Usa o ouro roubado para armar milicianos.
                            B. Foge para outra regiao e espalha sua lenda.
                            C. Se entrega para poupar os outros.
                        """);

                No cena_3E = new No("""
                        O plano da certo voce consegue roubar os documents secretos,
                        mas você quase é pego.
                        
                        ---------------------------------------------------------------------
                        O que fazer com os documentos?
                            A. Divulga publicamente, envergonhando a nobreza.
                            B. Usa como chantagem para proteger os camponeses.
                            C. Leva ao rei Ricardo em segredo.
                        """);

                No cena_3F = new No("""
                        A revolta se espalha, mas civis sao feridos.
                        A multidao bloqueia a entrada do vilarejo. 
                        Guardas comecam a atacar civis.

                        ---------------------------------------------------------------------
                        Como conter o conflito?
                            A. Luta com os guardas mesmo em desvantagem.
                            B. Faz um discurso tentando apelar a honra dos soldados.
                            C. Ordena retirada imediata para evitar mortes.
                        """);
                cena_2C.A = cena_3D;
                cena_2C.B = cena_3E;
                cena_2C.C = cena_3F;

                No cena_3G = new No("""
                        Você ataca comboios e se esconde. 
                        Sua fama cresce, mas a fome se espalha entre seus aliados.

                        ---------------------------------------------------------------------
                        Como alimentar seu povo?
                            A. Rouba dos mosteiros que apoiam o principe.
                            B. Tenta plantar em areas secretas na floresta.
                            C. Pede ajuda a França como aliado do rei Ricardo.                
                        """);

                No cena_3H = new No("""
                        Sherwood vira campo de batalha, com muitas perdas.
                        Voce esta cercado.

                        ---------------------------------------------------------------------
                        Ultima cartada?
                            A. Convoca uma ultima batalha epica.
                            B. Tenta fugir com seus lideres.
                            C. Provoca uma queimada na floresta para forcar recuo.                
                        """);

                No cena_3I = new No("""
                        Os bandidos te traem.

                        =========================
                        FINAL RUIM

                        Emboscado e capturado.
                        =========================

                        final 26/33
                        """);

                cena_2D.A = cena_3G;
                cena_2D.B = cena_3H;
                cena_2D.C = cena_3I;

                No cena_3J = new No("""
                        O ataque e heroico, mas suicida.

                        =========================
                        FINAL TRAGICO
                        =========================

                        final 28/33
                        """);

                No cena_3K = new No("""
                        O rei retorna e, com sua ajuda, toma o trono de volta.

                        =========================
                        FINAL HEROICO
                        =========================

                        final 29/33
                        """);

                No cena_3L = new No("""
                        O sequestro gera caos, e o povo se levanta — revolucao!

                        =========================
                        FINAL REVOLUCIONARIO
                        =========================

                        final 30/33
                        """);

                cena_2F.A = cena_3J;
                cena_2F.B = cena_3K;
                cena_2F.C = cena_3L;

                No cena_4A = new No("""
                        O povo te perdoa e voce vira um lider mais humano.

                        =========================
                        FINAL NOBRE
                        ========================= 

                        final 1/33
                        """);

                No cena_4B = new No("""
                        Alguns aceitam, outros te chamam de manipulador.

                        =========================
                        FINAL INSTAVEL
                        =========================

                        final 2/33
                        """);
                
                No cena_4C = new No("""
                        Voce perde apoio dos seus aliados.

                        =========================
                        FINAL TRAGICO:

                        Traicao interna
                        =========================
                        final 3/33
                        """);

                cena_3A.A = cena_4A;
                cena_3A.B = cena_4B;
                cena_3A.C = cena_4C;

                No cena_4D = new No("""
                        Voce financia uma revolucao!

                        =========================
                        FINAL REVOLUCIONARIO!
                        =========================

                        final 4/33
                        """);

                No cena_4E = new No("""
                        Ganha aliados poderosos que espalham sua causa.

                        =========================
                        FINAL HEROICO!
                        =========================

                        final 5/33
                        """);

                No cena_4F = new No("""
                        Causa fome no exercito inimigo, 
                        vencendo pelo desgaste.

                        =========================
                        FINAL ESTRATEGICO
                        =========================

                        final 6/33
                        """);

                cena_3B.A = cena_4D;
                cena_3B.B = cena_4E;
                cena_3B.C = cena_4F;

                No cena_4G = new No("""
                        Voce morre como martir.

                        =========================
                        FINAL TRAGICO

                        ...porem inspirador!
                        =========================

                        final 7/33
                        """);
                
                No cena_4H = new No("""
                        Voce e preso, 
                        mas os prisioneiros sao libertos.

                        =========================
                        FINAL NOBRE
                        =========================

                        final 8/33
                        """);

                No cena_4I = new No("""
                        O povo te abandona.

                        =========================
                        FINAL SOMBRIO

                        Voce vira o vilao aos
                        olhos do povo...
                        =========================

                        final 9/33
                        """);

                cena_3C.A = cena_4G;
                cena_3C.B = cena_4H;
                cena_3C.C = cena_4I;

                No cena_4J = new No("""
                        Vira lider de uma revolucao armada.

                        =========================
                        FINAL EVOLUCIONARIO
                        =========================

                        final 11/33
                        """);

                No cena_4K = new No("""
                        Sua historia inspira outros rebeldes!

                        =========================
                        FINAL LENDARIO!
                        =========================

                        final 12/33
                        """);
                        
                No cena_4L = new No("""
                        Voce morre como heroi.

                        =========================
                        FINAL TRAGICO

                        ... mas honrado!
                        =========================

                        final 13/33
                        """);

                cena_3D.A = cena_4J;
                cena_3D.B = cena_4K;
                cena_3D.C = cena_4L;

                No cena_4M = new No("""
                        Revolta popular explode.

                        =========================
                        FINAL REVOLUCIONARIO
                        =========================

                        final 14/33
                        """);

                No cena_4N = new No("""
                        Protege o povo, mas mantem o sistema.

                        =========================
                        FINAL DIPLOMATICO
                        =========================

                        final 15/33
                        """);

                No cena_4O = new No("""
                        Rei retorna e restaura a ordem.

                        =========================
                        FINAL HEROICO
                        =========================

                        final 16/33
                        """);

                cena_3E.A = cena_4M;
                cena_3E.B = cena_4N;
                cena_3E.C = cena_4O;

                No cena_4P = new No("""
                        Vence, mas com muitas perdas.

                        =========================
                        FINAL TRAGICO

                        ... porem justo
                        =========================

                        final 17/33
                        """);

                No cena_4Q = new No("""
                        Alguns soldados desistem e se juntam a voce.

                        =========================
                        FINAL HEROICO
                        =========================

                        final 18/33
                        """);    
                        
                No cena_4R = new No("""
                        O povo se frusta e te abandona.

                        =========================
                        FINAL RUIM
                        =========================

                        final 19/33
                        """);

                cena_3F.A = cena_4P;
                cena_3F.B = cena_4Q;
                cena_3F.C = cena_4R;

                No cena_4S = new No("""
                        Consegue comida,
                        mas vira alvo da igreja.

                        =========================
                        FINAL POLEMICO
                        =========================

                        final 20/33
                        """);

                No cena_4T = new No("""
                        Sobrevive com dignidade

                        =========================
                        FINAL RESILIENTE
                        =========================

                        final 21/33
                        """);

                No cena_4U = new No("""
                        A Franca envia reforcos.

                        =========================
                        FINAL INTERNACIONAL

                        e VITORIOSO!
                        =========================

                        final 22/33
                        """);

                cena_3H.A = cena_4S;
                cena_3H.B = cena_4T;
                cena_3H.C = cena_4U;

                No cena_4V = new No("""
                        Morre com honra.

                        =========================
                        FINAL TRAGICO

                        ...mas LENDARIO!
                        =========================

                        final 23/33
                        """);

                No cena_4W = new No("""
                        Sobrevive como fugitivo.

                        =========================
                        FINAL SOLITARIO
                        =========================

                        final 24/33
                        """);

                No cena_4X = new No("""
                        Derrota os soldados, mas perde Sherwood.

                        =========================
                        FINAL AMBIGUO
                        =========================

                        final 25/33
                        """);
                
                cena_3H.A = cena_4V;
                cena_3H.B = cena_4W;
                cena_3H.C = cena_4X;

                No carrinho = inicio;
                teclado.nextLine();// limpa buffer

                while (carrinho != null){
                    System.out.println(carrinho.texto);

                    // Se for folha, termina o jogo
                    if (carrinho.A == null && carrinho.B == null && carrinho.C == null) {
                        break; // ou carrinho = null;
                    }

                    
                    String escolha = teclado.nextLine().toUpperCase();
                    
                    Boolean loop2 = true;

                    while(loop2){
                        if (escolha.equals("A")){
                            carrinho = carrinho.A;
                            loop2 = false;
                        }else if (escolha.equals("B")){
                            carrinho = carrinho.B;
                            loop2 = false;
                        }else if (escolha.equals("C")){
                            carrinho = carrinho.C;
                            loop2 = false;
                        }else{
                            System.out.println("Opcao invalida! Tente novamente.");
                            escolha = teclado.nextLine().toUpperCase();
                        }
                    }
                }

            }else if (opcao == 0){
            loop = false;
            System.out.println("Obrigado por jogar!\n");
            System.out.println("Jogo feito por: Jonathan Gomez\n\n");
            System.out.println("...Saindo!");
            }
        }

    }
}
