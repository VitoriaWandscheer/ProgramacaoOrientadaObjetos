public abstract class Pessoa {
    private String cpf, nome, dataNascimento;

    public Pessoa(String cpf, String nome, String dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public abstract String getCpf();

    public abstract void setCpf(String cpf);

    public abstract String getNome();

    public abstract void setNome(String nome);

    public abstract String getDataNascimento();

    public abstract void setDataNascimento(String dataNascimento);

}
