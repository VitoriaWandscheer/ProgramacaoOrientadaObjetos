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
public class Estagiario extends Empregado {
    private double descontos;

    public Estagiario(String nom, String mail, double sal, int cod, double desc) {
        super(nom, mail, sal, cod);
        this.descontos = desc;
    }
    public void aumentoSalarial(int percent){
        this.salario = (this.salario + ((this.salario * percent)/100)) - this.descontos;
    }
@Override
    public String toString(){
        return ("| Nome: "+this.nome+" | Email: "+this.email+" | Salário: "+this.salario+" | Código: "+this.codigo+" | Descontos: "+this.descontos+" |");
    }
}
