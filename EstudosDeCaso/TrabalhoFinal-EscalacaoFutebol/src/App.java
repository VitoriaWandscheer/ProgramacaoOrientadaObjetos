
public class App {

    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("--> Trabalho Final <--");
        System.out.println("----------------------");
        System.out.println();


        // Cria Treinadores
        Treinador treinador1 = new Treinador("22222222222", "Rafael", "01/06/1999", "Já treinou diversos times, e até a seleção brasileira.");

        Treinador treinador2 = new Treinador("44444444444", "Luis", "21/05/1956", "Surfista se aventurando no futebas");


        //Cria Times
        Time time1 = new Time(1111, "Esperança", "Estadio da Alegria", treinador1);

        Time time2 = new Time(2222, "Sol", "Estadio da Luz", treinador2);


        // Cria Jogadores
        Jogador j1 = new Jogador("11111111111", "Vitoria", "24/04/2002", "Goleira", "10",time1);

        Jogador j2 = new Jogador("33333333333", "Dayane", "01/04/2000", "Atacante", "8", time1);

        Jogador j3 = new Jogador("55555555555", "Estevam", "24/04/2002", "Goleiro", "7", time2);

        Jogador j4 = new Jogador("66666666666", "Pedro", "01/04/2000", "Atacante",  "10", time2);


        // Cria Escalação
        Escalacao escalacao1 = new Escalacao(time1);
        escalacao1.addJogador(j1);
        escalacao1.addJogador(j2);

        Escalacao escalacao2 = new Escalacao(time2);
        escalacao2.addJogador(j3);
        escalacao2.addJogador(j4);

        // Cria Partida
        Partida partida1 = new Partida("17/11/2023 20:00", "Estadio da Alegria", escalacao1, escalacao2);

        System.out.println(partida1);

        System.out.println();


        // FIM =)
    }

}