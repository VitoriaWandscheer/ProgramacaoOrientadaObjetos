/**
 *
 * @author Vitória =)
 * */
public class ContaPoupanca extends ContaCorrente{
    private double menorSaldo;

    public ContaPoupanca(int numeroConta, double saldo, double menorSaldo) {
        super(numeroConta, saldo);
        this.menorSaldo = menorSaldo;
    }

    public double getMenorSaldo() {
        return menorSaldo;
    }

    public void setMenorSaldo(double menorSaldo) {
        this.menorSaldo = menorSaldo;
    }

    @Override
    public String sacar(double valor){
        if (valor <= super.getSaldo()) {
            super.setSaldo(super.getSaldo() - valor);
            if (super.getSaldo() < this.menorSaldo){
               this.menorSaldo = super.getSaldo();
            }
            return "_Sucesso_";
        } else {
            return "_Saldo Insuficiente_";
        }
    }

    public String atualizarSaldo(){
        super.setSaldo(super.getSaldo()+(this.menorSaldo * 0.05));
        this.menorSaldo = super.getSaldo();
        return "_Sucesso no Rendimento_";
    }

    @Override
    public double calculaTributos(){
        return 0;
    };

    @Override
    public String toString() {
        return "Conta Poupança: " + super.getNumeroConta() +
                " Saldo: " + super.getSaldo();
    }
}
