/**
 *
 * @author Vitória
 */
public class Moeda {
    private double valor;
    private String nome;

    public Moeda(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
