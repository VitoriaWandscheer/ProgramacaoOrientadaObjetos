/**
 *
 * @author Vitória =)
 * */
public class ContaEspecial extends ContaCorrente{
    private double limite;

    public ContaEspecial(int numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String sacar(double valor){
        double totalDisponivel = super.getSaldo() + this.limite;
        if (valor <= totalDisponivel){
            super.setSaldo(super.getSaldo()-valor);
            return "_Sucesso_";
        } else {
            return "_Saldo Insuficiente_";
        }
    }

    @Override
    public String toString() {
        return "Conta Especial: " + super.getNumeroConta() +
                " Saldo: " + super.getSaldo();
    }
}
