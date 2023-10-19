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

        // testa criação de um Cliente e seus métodos
//        System.out.println(c1);
//        System.out.println(c1.getCpf());
//        System.out.println(c1.getNome());

        // testa criação de uma ContaCorrente e seus métodos
//        System.out.println(cc1);
//        System.out.println(cc1.getNumeroConta());
//        System.out.println(cc1.getSaldo());

        // testa criação de uma ContaInvestimento e seus métodos
//        System.out.println(ci1);
//        System.out.println(ci1.getDiaInvestimento());
//        System.out.println(ci1.getPeriodo());
//        System.out.println(ci1.getSaldo());
//        System.out.println(ci1.atualizarSaldo());
//        System.out.println(ci1.getSaldo());
//        System.out.println(ci1.sacar(2.65));

        // testa criação de uma ContaPoupanca e seus métodos
//        System.out.println(cp1.getMenorSaldo());
//        System.out.println(cp1.getSaldo());
//        System.out.println(cp1.sacar(540));
//        System.out.println(cp1.getSaldo());
//        System.out.println(cp1.atualizarSaldo());
//        System.out.println(cp1);

        // testa criação de uma ContaPoupanca e seus métodos
//        System.out.println(ce1.getLimite());
//        System.out.println(ce1);
//        System.out.println(ce1.sacar(21000));
//        System.out.println(ce1.sacar(19999.99));
//        System.out.println(ce1.getSaldo());
//        System.out.println(ce1);

        // testa o método addConta de Cliente
        c1.addConta(cp1);
        c2.addConta(ce1);
        c3.addConta(ci1);
        c2.addConta(cc1);
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);

        // testa criação de Clientes e seus métodos
        Clientes agencia1 = new Clientes();
        agencia1.addCliente(c1);
        agencia1.addCliente(c2);
        agencia1.addCliente(c3);

        agencia1.imprimirClientes();
    }
}
