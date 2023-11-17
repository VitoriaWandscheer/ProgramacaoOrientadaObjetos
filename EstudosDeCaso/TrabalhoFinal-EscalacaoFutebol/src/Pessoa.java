public abstract class Pessoa {
    String cpf, nome, dataNascimento;

    public Pessoa(String cpf, String nome, String dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public abstract String apresentacao();

}
