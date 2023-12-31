/**
 *
 * @author Vitória
 */
public class CPoupanca extends CCorrente{
    private double saldo_minimo;

    public CPoupanca(double saldoMinimo, int numeroConta, double saldo, String cliente) {
        super(numeroConta, saldo, cliente);
        this.saldo_minimo = saldoMinimo;
    };
    
    public double getSaldoMinimo() {
        return saldo_minimo;
    };

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldo_minimo = saldoMinimo;
    };
    @Override
    public String sacar(double valor){
        if(valor <= super.getSaldo()){
            super.setSaldo(super.getSaldo() - valor);
            if(super.getSaldo() < this.saldo_minimo){
                this.saldo_minimo = super.getSaldo();
            }
            return "_Sucesso_";
        }else{
            return "_Saldo Insuficiente_";
        }
    };
    
    public String atualizarSaldo(){
        super.setSaldo(super.getSaldo()+(this.saldo_minimo * 0.05));
        this.saldo_minimo = super.getSaldo();
        return "_Sucesso no Rendimento_";
    };
    
    @Override
    public String toString(){
        return (super.toString()+"\nSaldo Mínimo: "+(float)this.saldo_minimo);
    };
}
