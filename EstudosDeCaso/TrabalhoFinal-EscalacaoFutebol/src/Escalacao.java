import java.util.ArrayList;

public class Escalacao {
    int idEscalacao;
    Partida partida;
    Treinador treinador;
    Time time;
    ArrayList<Jogador> jogadores;

    public Escalacao(int idEscalacao, Partida partida, Treinador treinador, Time time) {
        this.idEscalacao = idEscalacao;
        this.partida = partida;
        this.treinador = treinador;
        this.time = time;
        this.jogadores = new ArrayList<Jogador>();
    }

    public void addJogador(Jogador jogador){
        this.jogadores.add(jogador);
    }
    
}
