/**
 *
 * @author Vitória
 */
public class Animal {
    protected String nome, raca;
    protected int position;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.position = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getPosition() {
        return position;
    }

    public int caminha(int passos){
        this.position = this.position+passos;
        return this.position;
    }

    @Override
    public String toString(){
        return ("| Nome: "+this.nome+" | Raça: "+this.raca+" | Posição: "+this.position+" |");
    }
    
}
