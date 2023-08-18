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
public class Mainn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Questão 1
        System.out.println("\n------------------------------------------ QUESTÃO 1 ------------------------------------------");
        Empregado esperanca = new Empregado("Esperança", "esperanca@email.com", 5000.00, 420);
        System.out.println("--------- Classe Empregado: ");
        System.out.println(esperanca+"\n");
        esperanca.aumentoSalarial(10);
        System.out.println("--------- Classe Empregado após o aumento salarial de 10%: ");
        System.out.println(esperanca+"\n");
        
        Chefe chefia = new Chefe("Fulano", "fulano@email.com", 10000.00, 22, 5000.00);
        System.out.println("--------- Classe Chefe: ");
        System.out.println(chefia+"\n");
        chefia.aumentoSalarial(15);
        System.out.println("--------- Classe Chefe após o aumento salarial de 15%: ");
        System.out.println(chefia+"\n");
        
        Estagiario sofrido = new Estagiario("Naftali", "naftali@email.com", 1320.00, 666, 100.00);
        System.out.println("--------- Classe Estagiário: ");
        System.out.println(sofrido+"\n");
        sofrido.aumentoSalarial(8);
        System.out.println("--------- Classe Estagiário após o aumento salarial de 8%: ");
        System.out.println(sofrido+"\n");
        
        System.out.println("\n------------------------------------------ QUESTÃO 2 ------------------------------------------");
        Ingresso opcao1 = new Ingresso(20.00);
        System.out.println("--------- Classe Ingresso | Metódo imprimeValor: ");
        System.out.println(opcao1.imprimeValor()+"\n");
        System.out.println("--------- Classe Ingresso | Método toString: ");
        System.out.println(opcao1+"\n");
        
        Vip opcao2 = new Vip(20.00, 15.00);
        System.out.println("--------- Classe Ingresso Vip | Metódo imprimeValor: ");
        System.out.println(opcao2.imprimeValor()+"\n");
        System.out.println("--------- Classe Ingresso VIP | Método toString: ");
        System.out.println(opcao2+"\n");
        
        Normal opcao3 = new Normal(20.00);
        System.out.println("--------- Classe Ingresso Normal: ");
        System.out.println(opcao3.imprimeTipo()+"\n");
        
        CamaroteInferior opcao4 = new CamaroteInferior(13, 20.00, 15.00);
        System.out.println("--------- Classe Ingresso Vip CamaroteInferior | Método imprimePoltrona:");
        System.out.println(opcao4.imprimePoltrona()+"\n");
        System.out.println("--------- Classe Ingresso Vip CamaroteInferior | Método toString:");
        System.out.println(opcao4+"\n");
        opcao4.alteraPoltrona(23);
        System.out.println("--------- Classe Ingresso Vip CamaroteInferior após alteração | Método imprimePoltrona:");
        System.out.println(opcao4.imprimePoltrona()+"\n");
        System.out.println("--------- Classe Ingresso Vip CamaroteInferior após alteração | Método toString:");
        System.out.println(opcao4+"\n");
        
        CamaroteSuperior opcao5 = new CamaroteSuperior(5.0, 20.0, 15.0);
        System.out.println("--------- Classe Ingresso Vip CamaroteSuperior | Método imprimeValor:");
        System.out.println(opcao5.imprimeValor()+"\n");
        System.out.println("--------- Classe Ingresso Vip CamaroteSuperior | Método toString:");
        System.out.println(opcao5+"\n");
        
        System.out.println("\n------------------------------------------ QUESTÃO 3 ------------------------------------------");
    }
    
}
