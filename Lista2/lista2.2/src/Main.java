/**
 *
 * @author Vitória
 */
public class Main {
    public static void main(String[] args){
        /** Questão 2 */
        System.out.println("\n---- QUESTÃO 2 ----");
        Ingresso opcao1 = new Ingresso(20.00);
        System.out.println("-- Classe Ingresso | Metódo imprimeValor: ");
        System.out.println(opcao1.imprimeValor()+"\n");
        System.out.println("-- Classe Ingresso | Método toString: ");
        System.out.println(opcao1+"\n");
        
        Vip opcao2 = new Vip(20.00, 15.00);
        System.out.println("-- Classe Ingresso Vip | Metódo imprimeValor: ");
        System.out.println(opcao2.imprimeValor()+"\n");
        System.out.println("-- Classe Ingresso VIP | Método toString: ");
        System.out.println(opcao2+"\n");
        
        Normal opcao3 = new Normal(20.00);
        System.out.println("-- Classe Ingresso Normal: ");
        System.out.println(opcao3.imprimeTipo()+"\n");
        
        CamaroteInferior opcao4 = new CamaroteInferior(13, 20.00, 15.00);
        System.out.println("-- Classe Ingresso Vip CamaroteInferior | Método imprimePoltrona:");
        System.out.println(opcao4.imprimePoltrona()+"\n");
        System.out.println("-- Classe Ingresso Vip CamaroteInferior | Método toString:");
        System.out.println(opcao4+"\n");
        opcao4.alteraPoltrona(23);
        System.out.println("-- Classe Ingresso Vip CamaroteInferior após alteração | Método imprimePoltrona:");
        System.out.println(opcao4.imprimePoltrona()+"\n");
        System.out.println("-- Classe Ingresso Vip CamaroteInferior após alteração | Método toString:");
        System.out.println(opcao4+"\n");
        
        CamaroteSuperior opcao5 = new CamaroteSuperior(5.0, 20.0, 15.0);
        System.out.println("-- Classe Ingresso Vip CamaroteSuperior | Método imprimeValor:");
        System.out.println(opcao5.imprimeValor()+"\n");
        System.out.println("-- Classe Ingresso Vip CamaroteSuperior | Método toString:");
        System.out.println(opcao5+"\n");

        /** FIM */
        System.out.println("\n=)\n");
    }
}
