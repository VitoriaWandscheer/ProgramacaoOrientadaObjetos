/**
 *
 * @author Vitória
 */
public class Funcionario {
    protected String nome, endereco, email, telefone;

    public Funcionario(String nome, String endereco, String email, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

@Override
    public String toString() {
        return ("| Nome: "+this.nome+" | Email: "+this.email+" | Endereço: "+this.endereco+" | Telefone: "+this.telefone+" |");
    }
}