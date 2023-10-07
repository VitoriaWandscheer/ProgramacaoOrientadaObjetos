/**
 *
 * @author Vitória
 */
public class Ingresso {
    protected double valor;

    public Ingresso(double val) {
        this.valor = val;
    }

    public double imprimeValor() {
        return this.valor;
    }
    
@Override
    public String toString(){
        return ("| Valor do Ingresso: R$"+this.valor+" |");
    }
}
