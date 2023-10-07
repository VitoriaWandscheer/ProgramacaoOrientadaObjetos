/**
 *
 * @author Alunos
 */
public abstract class Pessoa {
    protected String nome, cpf;
    protected double peso, altura;

    public Pessoa(String nome, String cpf, double peso, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
    
    
    public String andar(){
        return "Andando...";
    }
}
