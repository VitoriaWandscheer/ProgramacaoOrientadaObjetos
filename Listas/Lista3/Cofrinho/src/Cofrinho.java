import java.util.ArrayList;
/**
 *
 * @author Vitória
 */
public class Cofrinho {
    private ArrayList<Moeda> moedas;
    private String nome;

    public Cofrinho(String nome){
        this.moedas = new ArrayList<Moeda>();
        this.nome = nome;
    }

    public void addMoeda(Moeda moeda){
        this.moedas.add(moeda);
    }

    public String nMoedas(){
        if (this.moedas.size() == 0) {
            return "O cofrinho está vazio.";
        } else if (this.moedas.size() == 1) {
            return "Há "+this.moedas.size()+" moeda no cofrinho.";
        } else {
            return "Há "+this.moedas.size()+" moedas no cofrinho.";
        }
    }

    public String nMoedasValor(double valor){
        int cont = 0;
        String nomeMoeda = "";

        for (Moeda moeda : this.moedas) {
            if (moeda.getValor() == valor) {
                cont++;
                nomeMoeda = moeda.getNome();
            }
        }

        if (cont == 0) {
            return "Não há moedas de "+nomeMoeda;
        } else if (cont == 1) {
            return "Há "+cont+" moeda de "+nomeMoeda+" no cofrinho.";
        } else {
            return "Há "+cont+" moedas de "+nomeMoeda+" no cofrinho.";
        }
    }

    public String maiorValor() {
        double maior = 0;
        String nomeMoeda = "";

        for (Moeda moeda : this.moedas) {
            if (moeda.getValor() > maior) {
                maior++;
                nomeMoeda = moeda.getNome();
            }
        }

        if (maior == 0){
            return "O cofrinho está vazio.";
        } else {
            return "A moeda de maior valor é a de "+nomeMoeda+".";
        }
    }

    public ArrayList<Moeda> getMoedas() {
        return moedas;
    }

    @Override
    public String toString() {
        return this.nome+" possui as seguintes moedas: "+this.moedas;
    }
}
