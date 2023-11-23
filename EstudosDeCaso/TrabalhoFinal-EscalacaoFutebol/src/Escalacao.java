import java.util.ArrayList;

public class Escalacao {
    private int idEscalacao;
    private Partida partida;
    private Treinador treinador;
    private Time time;
    private ArrayList<Jogador> jogadores;

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

    public int getIdEscalacao() {
        return idEscalacao;
    }

    public void setIdEscalacao(int idEscalacao) {
        this.idEscalacao = idEscalacao;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public String toString() {
        return " => Escalacao: \nData e Hora: " + this.partida.getDataHora() + "\nTreinador = " + this.treinador.getNome() + "\nJogadores: " + this.jogadores +" ]";
    }
    
    
}
