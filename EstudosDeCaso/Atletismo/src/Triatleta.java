/**
 *
 * @author Alunos
 */
public class Triatleta extends Pessoa implements Atleta, Corredor, Ciclista, Nadador{

    public Triatleta(String nome, String cpf, double peso, double altura) {
        super(nome, cpf, peso, altura);
    }
    
    @Override
    public String toString(){
        return "- Informações do Atleta:\nNome: "+this.nome+"\nCPF: "+this.cpf+"\nPeso: "+this.peso+"\nAltura: "+this.altura;
    }
    
    @Override
    public void aquecer(){
        System.out.println("Aquecento...");
    }
    
    @Override
    public void correr(){
        System.out.println("Correndo...");
    }
    
    @Override
    public void pedalar(){
        System.out.println("Pedalando...");
    }
    
    @Override
    public void nadar(){
        System.out.println("Nadando...");
    }
}