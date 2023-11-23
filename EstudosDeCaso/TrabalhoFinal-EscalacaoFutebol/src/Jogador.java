public class Jogador extends Pessoa{
    private String posicao;
    private String numero;
    private Time time;

    public Jogador(String cpf, String nome, String dataNascimento, String posicao, String numero,Time time) {
        super(cpf, nome, dataNascimento);
        this.posicao = posicao;
        this.numero = numero;
        this.time = time;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Jogador [cpf = " + super.getCpf() + ", nome = " + super.getNome() + ", dataNascimento = " + super.getDataNascimento() + ", posicao = " + this.posicao + ", número = " + this.numero + ", time = " + this.time + "]";
    }
    
}
