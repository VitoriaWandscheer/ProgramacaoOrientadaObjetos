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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Testa Cliente
        Cliente c1 = new Cliente("010.101.010-01","Rafael");
        System.out.println(c1);
        CCorrente cc1 = new CCorrente(1,1000,c1);
        System.out.println(cc1);
        
//        // Testa o Construtor.
//        System.out.println("------------------------");
//        System.out.println("-- Testa o construtor --");
//        System.out.println("------------------------");
//        CCorrente conta1 = new CCorrente(1,1000,"Sem Criatividade");
//        System.out.println(conta1);
//        System.out.println("");
//        CEspecial conta2 = new CEspecial(600,2,500,"Seguimos");
//        System.out.println(conta2);
//        System.out.println("");
//        CPoupanca conta3 = new CPoupanca(50,3,168,"Esperança");
//        System.out.println(conta3);
//        System.out.println("");
//        CInvestimento conta4 = new CInvestimento(8,10,4,724,"Investidor");
//        System.out.println(conta4);
//        System.out.println("");
//        CInvestimento conta5 = new CInvestimento(22, 7, 5, 700, "Aiai");
//        System.out.println(conta5);
//        System.out.println("");
//        
//        // Testa o método depositar.
//        System.out.println("------------------------------");
//        System.out.println("-- Testa o método depositar --");
//        System.out.println("------------------------------");
//        conta1.depositar(3.72);
//        System.out.println(conta1);
//        System.out.println("");
//        conta2.depositar(3.72);
//        System.out.println(conta2);
//        System.out.println("");
//        conta3.depositar(3.72);
//        System.out.println(conta3);
//        System.out.println("");
//        conta4.depositar(3.72);
//        System.out.println(conta4);
//        System.out.println("");
//        
//        // Testa os método sacar e atualizar saldo, quando houver.
//        System.out.println("--------------------------");
//        System.out.println("-- Testa o método sacar --");
//        System.out.println("--------------------------");
//        System.out.println(conta1.sacar(1004));
//        System.out.println(conta1);
//        System.out.println("--------------------------");
//        System.out.println(conta1.sacar(3.72));
//        System.out.println(conta1);
//        System.out.println("--------------------------");
//        System.out.println(conta1.sacar(1000));
//        System.out.println(conta1);
//        System.out.println("--------------------------");
//        System.out.println(conta2.sacar(1103.73));
//        System.out.println(conta2);
//        System.out.println("--------------------------");
//        System.out.println(conta2.sacar(50));
//        System.out.println(conta2);
//        System.out.println("--------------------------");
//        System.out.println(conta2.sacar(637));
//        System.out.println(conta2);
//        System.out.println("--------------------------");
//        System.out.println(conta3.sacar(171.73));
//        System.out.println(conta3);
//        System.out.println("--------------------------");
//        System.out.println(conta3.sacar(50));
//        System.out.println(conta3);
//        System.out.println("--------------------------");
//        System.out.println(conta3.sacar(110));
//        System.out.println(conta3);
//        System.out.println("--------------------------");
//        System.out.println(conta3.atualizarSaldo());
//        System.out.println(conta3);
//        System.out.println("--------------------------");
//        System.out.println(conta4.sacar(724));
//        System.out.println(conta4);
//        System.out.println("--------------------------");
//        System.out.println(conta4.atualizarSaldo());
//        System.out.println(conta4);
//        System.out.println("--------------------------");
//        System.out.println(conta5.sacar(724));
//        System.out.println(conta5);
//        System.out.println("--------------------------");
//        System.out.println(conta5.atualizarSaldo());
//        System.out.println(conta5);
//        System.out.println("--------------------------");
    
    }
    
}
