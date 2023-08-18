/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

/**
 *
 * @author Vitória
 */
public class Ingresso {
    protected double valor;

    public Ingresso(double val) {
        this.valor = val;
    }

    public double imprimeValor() {
        return this.valor;
    }
    
@Override
    public String toString(){
        return ("| Valor do Ingresso: R$"+this.valor+" |");
    }
}
