public class Jogador extends Pessoa{
    String posicao;
    String numero;
    Time time;

    public Jogador(String cpf, String nome, String dataNascimento, String posicao, String numero,Time time) {
        super(cpf, nome, dataNascimento);
        this.posicao = posicao;
        this.numero = numero;
        this.time = time;
    }

    public String apresentacao(){
        return "Olá, meu nome é " + super.nome + ", nasci em " + super.dataNascimento + " e jogo na posição de "+this.posicao+".";
    }

}
