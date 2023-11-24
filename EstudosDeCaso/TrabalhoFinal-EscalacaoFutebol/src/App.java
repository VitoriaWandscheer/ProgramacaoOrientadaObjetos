
public class App {

    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("--> Trabalho Final <--");
        System.out.println("----------------------");
        System.out.println();


        // Cria Treinadores
        Treinador treinador1 = new Treinador("34343434343", "Felipão", "09/11/1948", "Luiz Felipe Scolari, também conhecido como Felipão, é um treinador e ex-futebolista brasileiro que atuava como zagueiro. Atualmente comanda o Atlético Mineiro. Foi campeão do mundo de futebol como técnico da Seleção Brasileira em 2002 na Copa do Mundo do Japão e Coreia do Sul.");
        Treinador treinador2 = new Treinador("56565656565", "Rudi Voller", "13/04/1960", "Rudolf Völler (Rudi), é um ex-futebolista e ex-treinador alemão");


        //Cria Times
        Time time1 = new Time("Brasil", "Estadio do Brasil", treinador1);
        Time time2 = new Time("Alemanha", "Estadio da Luz", treinador2);


        // Cria Jogadores do Brasil
        Jogador jb1 = new Jogador("11111111111", "Marcos", "24/04/2002", "goleiro", "10",time1);
        Jogador jb2 = new Jogador("22222222222", "Lúcio", "01/04/2000", "zagueiro", "8", time1);
        Jogador jb3 = new Jogador("33333333333", "Edmílson", "24/04/2002", "zagueiro", "7", time1);
        Jogador jb4 = new Jogador("44444444444", "Roque Júnior", "01/04/2000", "zagueiro",  "10", time1);
        Jogador jb5 = new Jogador("55555555555", "Cafu", "24/04/2002", "lateral-direito", "10",time1);
        Jogador jb6 = new Jogador("66666666666", "Gilberto Silva", "01/04/2000", "volante", "8", time1);
        Jogador jb7 = new Jogador("77777777777", "Kléberson", "24/04/2002", "volante", "7", time1);
        Jogador jb8 = new Jogador("88888888888", "Ronaldinho Gaúcho", "01/04/2000", "meia",  "10", time1);
        Jogador jb9 = new Jogador("99999999999", "Roberto Carlos", "01/04/2000", "lateral-esquerdo",  "10", time1);
        Jogador jb10 = new Jogador("12121212112", "Rivaldo", "01/04/2000", "meia-atacante",  "10", time1);
        Jogador jb11 = new Jogador("23232323232", "Ronaldo ", "01/04/2000", "atacante",  "10", time1);

        // Cria Jogadores da Alemanha
        Jogador ja1 = new Jogador("11111111111", "Oliver Kahn", "24/04/2002", "goleiro", "10",time2);
        Jogador ja2 = new Jogador("22222222222", "Thomas Linke", "01/04/2000", "zagueiro", "8", time2);
        Jogador ja3 = new Jogador("33333333333", "Carsten Ramelow", "24/04/2002", "zagueiro", "7", time2);
        Jogador ja4 = new Jogador("44444444444", "Christian Ziege", "01/04/2000", "zagueiro",  "10", time2);
        Jogador ja5 = new Jogador("55555555555", "Dietmar Hamann", "24/04/2002", "meia", "10",time2);
        Jogador ja6 = new Jogador("66666666666", "Carsten Jancker", "01/04/2000", "atacante", "8", time2);
        Jogador ja7 = new Jogador("77777777777", "Miroslav Klose", "24/04/2002", "atacante", "7", time1);
        Jogador ja8 = new Jogador("88888888888", "Michael Ballack", "01/04/2000", "meia",  "10", time2);
        Jogador ja9 = new Jogador("99999999999", "Bernd Schneider", "01/04/2000", "meia",  "10", time2);
        Jogador ja10 = new Jogador("12121212112", "Christoph Metzelder", "01/04/2000", "zagueiro",  "10", time2);
        Jogador ja11 = new Jogador("23232323232", "Torsten Frings", "01/04/2000", "meia",  "10", time2);


        // Cria Escalação
        Escalacao escalacao1 = new Escalacao(time1);
        escalacao1.addJogador(jb1);
        escalacao1.addJogador(jb2);

        Escalacao escalacao2 = new Escalacao(time2);
        escalacao2.addJogador(ja3);
        escalacao2.addJogador(ja4);

        // Cria Partida
        Partida partida1 = new Partida("30/06/2002 20:00", "Estadio da Alegria", escalacao1, escalacao2);

        System.out.println(partida1);

        System.out.println();


        // FIM =)
    }

}