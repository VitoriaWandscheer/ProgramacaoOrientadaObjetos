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
public class Chefe extends Empregado{
    private double beneficio;

    public Chefe(String nom, String mail, double sal, int cod, double ben) {
    super(nom, mail, sal, cod);
    this.beneficio = ben;
    }
    public void aumentoSalarial(int percent){
        this.salario = this.salario + (((this.salario * percent)/100) + this.beneficio);
    }

@Override
    public String toString(){
        return ("| Nome: "+this.nome+" | Email: "+this.email+" | Salário: "+this.salario+" | Código: "+this.codigo+" | Benefício: "+this.beneficio+" |");
    }

}
