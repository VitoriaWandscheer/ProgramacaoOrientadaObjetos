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
public class CamaroteSuperior extends Vip{
    private double adicionalSuperior;

    public CamaroteSuperior(double adSup, double val, double ad) {
        super(val, ad);
        this.adicionalSuperior = adSup;
    }
    public double imprimeValor(){
        return (this.valor + this.adicional + this.adicionalSuperior);
    }
    
@Override
    public String toString(){
        return ("| Valor do Ingresso VIP Camarote Superior: R$"+this.imprimeValor()+" |");
    }
}
