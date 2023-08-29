/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaBancaria1;

/**
 *
 * @author Vitória
 */
public class CEspecial extends CCorrente{
    private double limite;

    public CEspecial(double limite, int numeroConta, double saldo, String cliente) {
        super(numeroConta, saldo, cliente);
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
        //quando não há saldo em uma conta especial é permitido retirar o valor do limite disponível
        double total_disponivel = super.getSaldo() + this.limite;
        if(valor <= total_disponivel){
            super.setSaldo(super.getSaldo()-valor);
            return "_Sucesso_";
        }else{
            return "_Saldo Insuficiente_";
        }
    };
    
    @Override
    public String toString(){
        return (super.toString()+"\nLimite: "+(float)this.limite);
    };
}
