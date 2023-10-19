/**
 *
 * @author Vitória
 */
public class Main {

    public static void main(String[] args) {
        /** Testes da Classe Bola */
        System.out.println("-- BOLA");
        Bola bolinha = new Bola("amarela", "algodão", 3.2);
        System.out.println("A cor da bola é "+ bolinha.mostraCor());
        bolinha.trocaCor("rosa");
        System.out.println("A cor da bola é "+ bolinha.mostraCor());
        System.out.println("");
        
        /** Testes da Classe Quadrado */
        System.out.println("-- QUADRADO");
        Quadrado quadradinho = new Quadrado(3);
        System.out.println("O lado do quadrado é "+quadradinho.mostraLado());
        System.out.println("A área do quadrado é "+quadradinho.calculaArea());
        quadradinho.trocaLado(5);
        System.out.println("O lado do quadrado após a troca é "+quadradinho.mostraLado());
        System.out.println("A área do quadrado após a troca é "+quadradinho.calculaArea());
        System.out.println("");
        
        /** Testes da Classe Pessoa */
        System.out.println("-- PESSOA");
        Pessoa vitoria = new Pessoa("Vitória", 19, 51, 160);
        System.out.println("Idade antes de envelhecer: "+vitoria.getIdade());
        System.out.println("Altura antes de envelhecer: "+vitoria.getAltura());
        vitoria.envelhecer();
        System.out.println("Idade após envelhecer: "+vitoria.getIdade());
        System.out.println("Altura após envelhecer: "+vitoria.getAltura());
        vitoria.envelhecer();
        System.out.println("Idade após envelhecer: "+vitoria.getIdade());
        System.out.println("Altura após completar 21 anos: "+vitoria.getAltura());
        System.out.println("Peso antes engordar: "+vitoria.getPeso());
        vitoria.engordar(0.3);
        System.out.println("Peso após engordar: "+vitoria.getPeso());
        System.out.println("Peso antes de emagrecer: "+vitoria.getPeso());
        vitoria.emagrecer(0.5);
        System.out.println("Peso após emagrecer: "+vitoria.getPeso());
        System.out.println("");
        
        /** Testes da Classe TV */
        System.out.println("-- TV");
        TV quarto = new TV(7, 3);
        System.out.println("Canal atual: "+quarto.getCanal());
        quarto.setCanal(3);
        System.out.println("Canal após mudança: "+quarto.getCanal());
        System.out.println("Volume antes de aumentar: "+quarto.getVolume());
        quarto.aumentaVolume();
        System.out.println("Volume após aumentar: "+quarto.getVolume());
        quarto.diminuiVolume();
        System.out.println("Volume após diminuir: "+quarto.getVolume());
        System.out.println("");
        
        /** Testes da Classe Tamagushi */
        System.out.println("-- Tamagushi");
        Tamagushi bichinho = new Tamagushi("Mary", 3, 5, 3);
        System.out.println("A "+bichinho.getNome()+" tem "+bichinho.getIdade()+" anos e está "+bichinho.humor());
        bichinho.setNome("Mary Jane");
        bichinho.setIdade(4);
        bichinho.setFome(1);
        bichinho.setSaude(4);
        System.out.println("Após a alteração, a "+bichinho.getNome()+" tem "+bichinho.getIdade()+" anos e está "+bichinho.humor());
        System.out.println("");
        
        /** Testes da Classe Bomba de Combustível */
        System.out.println("-- Bomba de Combustível");
        bombaCombustivel bomba1 = new bombaCombustivel("aditivado", 4.20, 100);
        bombaCombustivel bomba2 = new bombaCombustivel("comum", 4.00, 200);
        bomba1.abastecerPorValor(100);
        bomba1.abastecerPorLitro(50);
        bomba1.abastecerPorLitro(45);
        bomba2.abastecerPorValor(100);
        bomba2.abastecerPorLitro(50);
        bomba2.abastecerPorValor(300);
        bomba2.abastecerPorLitro(100);
        
        /** FIM */
        System.out.println("\n=)\n");
    }
}