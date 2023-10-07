/**
 *
 * @author Vitória
 */
public class Cliente {
    private String cpf, nome;

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
    @Override
    public String toString(){
        return ("Nome: "+this.nome+"\nCpf: "+this.cpf);
    }
}
