/**
 *
 * @author Vitória
 */
public class Tecnico extends Assistente{
    private double bonusSalarial;

    public Tecnico(String nome, String endereco, String email, String telefone, int numeroMatricula,
            double bonusSalarial) {
        super(nome, endereco, email, telefone, numeroMatricula);
        this.bonusSalarial = bonusSalarial;
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }

@Override
    public String toString() {
        return ("| Nome: "+this.nome+" | Email: "+this.email+" | Endereço: "+this.endereco+" | Telefone: "+this.telefone+" | Matrícula: "+this.numeroMatricula+" | Bônus Salarial: "+this.bonusSalarial+" |");
    }
    
}
