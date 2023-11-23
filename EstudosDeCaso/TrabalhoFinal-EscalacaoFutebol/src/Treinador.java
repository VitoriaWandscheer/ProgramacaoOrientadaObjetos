public class Treinador extends Pessoa{
    private String curriculo;

    public Treinador(String cpf, String nome, String dataNascimento, String curriculo) {
        super(cpf, nome, dataNascimento);
        this.curriculo = curriculo;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    @Override
    public String toString() {
        return "Treinador [cpf = " + super.getCpf() + ", nome = " + super.getNome() + ", dataNascimento = " + super.getDataNascimento() + ", curriculo = " + curriculo + "]";
    }

}
