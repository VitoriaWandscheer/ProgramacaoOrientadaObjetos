/**
 *
 * @author Vitória =)
 * */

public class Main {
    public static void main(String[] args){
        System.out.println("=)");

        // Cria algumas instâncias úteis para os testes.
        Cliente c1 = new Cliente("252.252.252-25","Vitória W. Pereira");
        Cliente c2 = new Cliente("353.353.353-35","Luis Otávio");
        Cliente c3 = new Cliente("454.454.454-45","Dayane Helene");
        ContaCorrente cc1 = new ContaCorrente(37, 1320.37);
        ContaInvestimento ci1 = new ContaInvestimento(38,1000,2,4);
        ContaPoupanca cp1 = new ContaPoupanca(39,13000,12769);
        ContaEspecial ce1 = new ContaEspecial(40,15000,5000);
        c1.addConta(cp1);
        c2.addConta(ce1);
        c3.addConta(ci1);
        c2.addConta(cc1);
        Clientes agencia1 = new Clientes();

        // testa a Interface Tributável
        System.out.println(cc1.calculaTributos()); // Conta Corrente
        System.out.println(ce1.calculaTributos()); // Conta Especial
        System.out.println(cp1.calculaTributos()); // Conta Poupança
        System.out.println(ci1.calculaTributos()); // Conta Investimento

    }
}
