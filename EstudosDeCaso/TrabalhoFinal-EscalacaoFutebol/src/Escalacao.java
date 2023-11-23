import java.util.ArrayList;

public class Escalacao {
    private Time time;
    private ArrayList<Jogador> jogadores;

    public Escalacao(Time time) {
        this.time = time;
        this.jogadores = new ArrayList<Jogador>();
    }

    public void addJogador(Jogador jogador){
        this.jogadores.add(jogador);
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

        String listaJogadores = "";

        for (Jogador jogador : this.jogadores){
            listaJogadores = listaJogadores + "  (" + jogador.getNumero() + ") " + jogador.getNome() + ": " + jogador.getPosicao() + "\n";
        }

        return " => " + this.time.getNome() +"\nTreinador: " + this.time.getTreinador().getNome() + "\nJogadores:\n" + listaJogadores;
    }
    
}
