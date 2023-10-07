/**
 *
 * @author Vitória
 */
public class Assistente extends Funcionario{
    protected int numeroMatricula;

    public Assistente(String nome, String endereco, String email, String telefone, int numeroMatricula) {
        super(nome, endereco, email, telefone);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

@Override
    public String toString() {
        return ("| Nome: "+this.nome+" | Email: "+this.email+" | Endereço: "+this.endereco+" | Telefone: "+this.telefone+" | Matrícula: "+this.numeroMatricula+" |");
    }
}
