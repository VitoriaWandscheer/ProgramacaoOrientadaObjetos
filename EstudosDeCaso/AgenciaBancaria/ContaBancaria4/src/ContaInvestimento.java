/**
 *
 * @author Vitória =)
 * */
import java.util.Calendar;
public class ContaInvestimento extends ContaCorrente{
    private int diaInvestimento, periodo;

    public ContaInvestimento(int numeroConta, double saldo, int diaInvestimento, int periodo) {
        super(numeroConta, saldo);
        this.diaInvestimento = diaInvestimento;
        this.periodo = periodo;
    }

    public int getDiaInvestimento() {
        return diaInvestimento;
    }

    public void setDiaInvestimento(int diaInvestimento) {
        this.diaInvestimento = diaInvestimento;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public String sacar(double valor) {
        return "Não é possivel realizar o saque de contas de investimento.\nEntre em contato com seu gerente para saber mais.";
    }

    public String atualizarSaldo() {
        Calendar dataAtual = Calendar.getInstance();
        int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
        if (dia == (this.diaInvestimento + periodo)){
            super.setSaldo(super.getSaldo()*1.2);
            return "_Sucesso_";
        } else {
            return "_Não é o dia de atualizar o saldo_";
        }
    }

    @Override
    public double calculaTributos(){
        return 0;
    };

    @Override
    public String toString() {
        return "Conta Investimento: " + super.getNumeroConta() +
                " Saldo: " + super.getSaldo();
    }
}
