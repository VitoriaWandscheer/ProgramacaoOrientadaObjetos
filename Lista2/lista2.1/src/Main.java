public class Main {
    public static void main(String[] args) {
        
        /** Questão 1 */
        System.out.println("\n---- QUESTÃO 1 ----");
        Empregado esperanca = new Empregado("Esperança", "esperanca@email.com", 5000.00, 420);
        System.out.println("-- Classe Empregado:");
        System.out.println(esperanca+"\n");
        esperanca.aumentoSalarial(10);
        System.out.println("-- Classe Empregado após o aumento salarial de 10%: ");
        System.out.println(esperanca+"\n");
        
        Chefe chefia = new Chefe("Fulano", "fulano@email.com", 10000.00, 22, 5000.00);
        System.out.println("-- Classe Chefe: ");
        System.out.println(chefia+"\n");
        chefia.aumentoSalarial(15);
        System.out.println("-- Classe Chefe após o aumento salarial de 15%: ");
        System.out.println(chefia+"\n");
        
        Estagiario sofrido = new Estagiario("Naftali", "naftali@email.com", 1320.00, 666, 100.00);
        System.out.println("-- Classe Estagiário: ");
        System.out.println(sofrido+"\n");
        sofrido.aumentoSalarial(8);
        System.out.println("-- Classe Estagiário após o aumento salarial de 8%: ");
        System.out.println(sofrido+"\n");

        /** FIM */
        System.out.println("\n=)\n");
    }
}
