// Aluna: Vitória Wandscheer Pereira
// 2023.2

public class App {

    public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("--------> Trabalho Final <------");
        System.out.println("--------------------------------");
        System.out.println();


        // Cria Treinadores
        Treinador treinador1 = new Treinador("34343434343", "Maurício Barbieri", "30/09/1981", "Maurício Nogueira Barbieri é um treinador de futebol brasileiro. Atualmente está sem clube.");
        Treinador treinador2 = new Treinador("56565656565", "Vítor Pereira", "26/07/1968", "Vítor Manuel de Oliveira Lopes Pereira é um treinador e ex-futebolista português que atuava como volante. Atualmente está sem clube.");


        //Cria Times
        Time time1 = new Time("Vasco", "Estádio São Januário", treinador1);
        Time time2 = new Time("Flamengo", "Estadio Maracanã", treinador2);


        // Cria Jogadores do Vasco
        Jogador jb1 = new Jogador("11111111111", "Léo Jardim", "20/03/1995", "goleiro", "1",time1);
        Jogador jb2 = new Jogador("22222222222", "Puma Rodríguez", "29/02/1970", "lateral direito", "2", time1);
        Jogador jb3 = new Jogador("33333333333", "Capasso", "29/02/1970", "zagueiro direito", "22", time1);
        Jogador jb4 = new Jogador("44444444444", "Léo", "29/02/1970", "zagueiro esquerdo",  "3", time1);
        Jogador jb5 = new Jogador("55555555555", "Lucas Piton", "29/02/1970", "lateral esquerdo", "36",time1);
        Jogador jb6 = new Jogador("66666666666", "Marlon Gomes", "29/02/1970", "meio campo", "25", time1);
        Jogador jb7 = new Jogador("77777777777", "Andrey Santos", "29/02/1970", "volante", "18", time1);
        Jogador jb8 = new Jogador("88888888888", "Barros", "29/02/1970", "volante",  "88", time1);
        Jogador jb9 = new Jogador("99999999999", "Figueiredo", "29/02/1970", "atacante",  "15", time1);
        Jogador jb10 = new Jogador("12121212112", "Pedro Raul", "29/02/1970", "atacante",  "9", time1);
        Jogador jb11 = new Jogador("23232323232", "Nenê ", "29/02/1970", "meio campo",  "10", time1);


        // Cria Jogadores da Flamengo
        Jogador ja1 = new Jogador("67676767676", "Santos", "29/02/1970", "goleiro", "1",time2);
        Jogador ja2 = new Jogador("78787878787", "Matheuzinho", "29/02/1970", "lateral direito", "34", time2);
        Jogador ja3 = new Jogador("89898989898", "Pablo", "29/02/1970", "zagueiro direito", "30", time2);
        Jogador ja4 = new Jogador("21212121221", "Fabrício Bruno", "29/02/1970", "zagueiro esquerdo",  "15", time2);
        Jogador ja5 = new Jogador("32323232323", "Ayrton Lucas", "29/02/1970", "lateral esquerdo", "6",time2);
        Jogador ja6 = new Jogador("43434343434", "Everton", "29/02/1970", "atacante", "11", time2);
        Jogador ja7 = new Jogador("54545454545", "Matheus Gonçalves", "29/02/1970", "meio campo", "40", time1);
        Jogador ja8 = new Jogador("65656565656", "Gerson", "29/02/1970", "volante",  "20", time2);
        Jogador ja9 = new Jogador("76767676767", "Matheus França", "29/02/1970", "meio campo",  "42", time2);
        Jogador ja10 = new Jogador("12121212112", "Arrascaeta", "29/02/1970", "meio campo",  "14", time2);
        Jogador ja11 = new Jogador("23232323232", "Gabriel", "29/02/1970", "atacante",  "10", time2);


        // Cria Escalação 1 e adiciona os jogadores
        Escalacao escalacao1 = new Escalacao(time1);
        escalacao1.addJogador(jb1);
        escalacao1.addJogador(jb2);
        escalacao1.addJogador(jb3);
        escalacao1.addJogador(jb4);
        escalacao1.addJogador(jb5);
        escalacao1.addJogador(jb6);
        escalacao1.addJogador(jb7);
        escalacao1.addJogador(jb8);
        escalacao1.addJogador(jb9);
        escalacao1.addJogador(jb10);
        escalacao1.addJogador(jb11);


        // Cria Escalação 2 e adiciona os jogadores
        Escalacao escalacao2 = new Escalacao(time2);
        escalacao2.addJogador(ja1);
        escalacao2.addJogador(ja2);
        escalacao2.addJogador(ja3);
        escalacao2.addJogador(ja4);
        escalacao2.addJogador(ja5);
        escalacao2.addJogador(ja6);
        escalacao2.addJogador(ja7);
        escalacao2.addJogador(ja8);
        escalacao2.addJogador(ja9);
        escalacao2.addJogador(ja10);
        escalacao2.addJogador(ja11);


        // Cria Partida 1
        Partida partida1 = new Partida("15/12/2023 18:10", "Maracanã", escalacao1, escalacao2);
        System.out.println(partida1);
        System.out.println();
        System.out.println("=)");
    
    }

}
