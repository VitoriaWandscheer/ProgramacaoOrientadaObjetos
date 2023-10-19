public class Main {
    public static void main(String[] args){
        System.out.println("Teste: ");
        Onibus v1 = new Onibus("ab39gd", 2021, 42);
        Caminhao v2 = new Caminhao("vho2js", 2014, 4);

        v1.exibirDados();
        v2.exibirDados();
    }
}
