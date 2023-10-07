import java.util.Calendar;

/**
 *
 * @author Vitória
 */
public class CInvestimento extends CCorrente{
    private int dia_investimento, periodo;

    public CInvestimento(int numeroConta, double saldo, Cliente cliente,int dia_investimento, int periodo) {
        super(numeroConta, saldo, cliente);
        this.dia_investimento = dia_investimento;
        this.periodo = periodo;
    };

    public int getDia_investimento() {
        return dia_investimento;
    };

    public void setDia_investimento(int dia_investimento) {
        this.dia_investimento = dia_investimento;
    };

    public int getPeriodo() {
        return periodo;
    };

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    };
    
    public String sacar(double valor){
        return "Não é possivel realizar o saque pois esta é uma conta de investimento.\nEntre em contato com seu gerente para saber mais.";
    }

    public String atualizarSaldo(){
        Calendar dataAtual = Calendar.getInstance();
        int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
        if (dia == (this.dia_investimento+periodo)){
            super.setSaldo(super.getSaldo()*1.2);
            return "Sucesso!";
        } else {
            return "Não é o dia de atualizar o saldo.";
        }
    };
    
    @Override
    public String toString(){
        return (super.toString()+"\nDia Investimento: "+this.dia_investimento+"\nPeriodo: "+this.periodo);
    };
}
