/**
 *
 * @author Vitória
 */
public class Main {
    public static void main(String[] args){
        System.out.println("=)");

        // testa a criação de um cofrinho e a contagem de moedas no cofrinho vazio
        Cofrinho c1 = new Cofrinho("Cofrinho do Jan");
        System.out.println(c1.nMoedas());
        System.out.println("");

        // testa a criação de algumas moedas e suas respectivas adições à classe Moeda.
        Moeda m1 = new Moeda(0.50, "cinquenta centavos");
        c1.addMoeda(m1);

        Moeda m2 = new Moeda(0.25, "vinte e cinco centavos");
        c1.addMoeda(m2);

        Moeda m3 = new Moeda(0.50, "cinquenta centavos");
        c1.addMoeda(m3);

        Moeda m4 = new Moeda(1, "um real");
        c1.addMoeda(m4);

        Moeda m5 = new Moeda(0.05, "cinco centavos");
        c1.addMoeda(m5);

        System.out.println("");

        // testa a implementação dos métodos: nMoedas, nMoedasValor, maiorValor
        System.out.println(c1.nMoedas());
        System.out.println("");
        System.out.println(c1.nMoedasValor(0.50));
        System.out.println(c1.nMoedasValor(0.05));
        System.out.println(c1.nMoedasValor(0.10));
        System.out.println(c1.nMoedasValor(0.25));
        System.out.println("");
        System.out.println(c1.maiorValor());
    }
}
