/**
 *
 * @author Vitória
 */

public class Pessoa {
    protected String nome;
    protected int idade;
    protected Universidade universidade;

    public Pessoa(String nome, int idade, Universidade universidade) {
        this.nome = nome;
        this.idade = idade;
        this.universidade = universidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return "| Nome: "+this.nome+" | Idade: "+this.idade+" |";
    }
}
