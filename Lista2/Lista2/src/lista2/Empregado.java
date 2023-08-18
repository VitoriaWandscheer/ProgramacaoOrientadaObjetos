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
public class Empregado {
    protected String nome, email;
    protected double salario;
    protected int codigo;

    public Empregado(String nom, String mail, double sal, int cod) {
        this.nome = nom;
        this.email = mail;
        this.salario = sal;
        this.codigo = cod;
    }

    public double getSalario() {
        return salario;
    }
    
    public void aumentoSalarial(int percent){
        this.salario = this.salario + ((this.salario * percent)/100);
    }
    
@Override
    public String toString(){
        return ("| Nome: "+this.nome+" | Email: "+this.email+" | Salário: "+this.salario+" | Código: "+this.codigo+" |");
    }

}