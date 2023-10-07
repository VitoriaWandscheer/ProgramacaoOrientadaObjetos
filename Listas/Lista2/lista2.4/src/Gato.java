/**
 *
 * @author Vitória
 */
public class Gato extends Animal {
    
    public Gato(String nome, String raca){
        super(nome, raca);
    }
    
    public String mia(){
        return "Miau";
    }

    @Override
    public String toString(){
        return ("| GATO | Nome: "+this.nome+" | Raça: "+this.raca+" | Posição: "+this.position+" |");
    }
}
