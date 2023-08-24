/**
 *
 * @author Vitória
 */
public class Cachorro extends Animal{
    
    public Cachorro(String nome, String raca){
        super(nome, raca);
    }
    
    public String late(){
        return "Au Au";
    }

    @Override
    public String toString(){
        return ("| CACHORRO | Nome: "+this.nome+" | Raça: "+this.raca+" | Posição: "+this.position+" |");
    }
}
