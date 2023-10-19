/**
 *
 * @author Vitória =)
 * */
public class ContaCorrente {
    private int numeroConta;
    private double saldo;

    public ContaCorrente(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String sacar(double valor) {
        if (valor <= this.saldo){
            this.saldo = this.saldo + valor;
            return "_Sucesso_";
        } else {
            return "_Saldo Insuficiente_";
        }
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    @Override
    public String toString() {
        return "Conta Corrente: " + this.getNumeroConta() +
                " Saldo: " + this.getSaldo();
    }
}
