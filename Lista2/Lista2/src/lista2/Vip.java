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
public class Vip extends Ingresso {
    protected double adicional;

    public Vip(double val, double ad) {
        super(val);
        this.adicional = ad;
    }
    
    public double imprimeValor() {
        return (valor + this.adicional);
    }
    
@Override
    public String toString(){
        return ("| Valor do Ingresso VIP: R$"+this.imprimeValor()+" |");
    }
    
    
}
