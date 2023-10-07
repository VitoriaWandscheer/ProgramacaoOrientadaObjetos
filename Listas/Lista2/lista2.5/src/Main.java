/**
 *
 * @author Vitória
 */
public class Main {
    public static void main(String[] args) {
        /** QUESTÃO 5 **/
        System.out.println("-- Classe Pesoa");
        Pessoa p1 = new Pessoa("Raul", 34);
        System.out.println(p1);

        System.out.println();
        System.out.println("-- Classe Miserável");
        Miseravel p2 = new Miseravel("Fulano", 26);
        System.out.println(p2.mendiga());

        System.out.println();
        System.out.println("-- Classe Trabalhador");
        Trabalhador p3 = new Trabalhador("Luis", 64);
        System.out.println(p3.trabalha());
        System.out.println(p3);

        System.out.println();
        System.out.println("-- Classe Rico");
        Rico p4 = new Rico("João", 19, 842678.00);
        System.out.println(p4.fazCompras(1320.00));
        System.out.println(p4);

         /** FIM */
         System.out.println("\n=)\n");
    }
}
