/**
 *
 * @author Vitória
 */
public class Administrativo extends Assistente {
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, String endereco, String email, String telefone, int numeroMatricula, String turno, double adicionalNoturno) {
        super(nome, endereco, email, telefone, numeroMatricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() {
        return turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public boolean verificaTurno() {
        String lowerTurno = this.turno.toLowerCase();
        return lowerTurno.equals("noturno");

    }

    @Override
    public String toString() {
        if(verificaTurno() == true){
            return ("| Nome: "+this.nome+" | Email: "+this.email+" | Endereço: "+this.endereco+" | Telefone: "+this.telefone+" | Matrícula: "+this.numeroMatricula+" | Turno: "+this.turno+" | Adicional Noturno: R$"+this.adicionalNoturno+" |");
        }else{
            return ("| Nome: "+this.nome+" | Email: "+this.email+" | Endereço: "+this.endereco+" | Telefone: "+this.telefone+" | Matrícula: "+this.numeroMatricula+" | Turno: "+this.turno+" |");
        }
    }
}
