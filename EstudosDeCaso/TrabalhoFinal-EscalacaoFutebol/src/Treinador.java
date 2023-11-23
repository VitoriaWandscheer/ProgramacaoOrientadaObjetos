public class Treinador extends Pessoa{
    private String curriculo;

    public Treinador(String cpf, String nome, String dataNascimento, String curriculo) {
        super(cpf, nome, dataNascimento);
        this.curriculo = curriculo;
    }

    public String apresentacao(){
        return "Olá, meu nome é " + super.nome + ", nasci em " + super.dataNascimento + " e sou o(a) treinador(a).";
    }

}
