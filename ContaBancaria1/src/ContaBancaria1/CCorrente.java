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
public class CCorrente {
    private int numero_conta;
    private double saldo;
    private String cliente; // Futuranmente será implementa a classe Cliente e criaremos um relacionamento entre a CCorrente e o Clinete.

    public CCorrente(int numeroConta, double saldo, String cliente) {
        this.numero_conta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numero_conta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numero_conta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public String sacar(double valor){
        if(valor <= this.saldo){
            this.saldo = this.saldo - valor;
            return "_Sucesso_";
        }else{
            return "_Saldo Insuficiente_";
        }
    };
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    
    @Override
    public String toString(){
        return ("Conta: "+this.numero_conta+"\nCliente: "+this.cliente+"\nSaldo: "+(float)this.saldo);
    }
    
}
