/**
 *
 * @author Vitória
 */
public class CamaroteSuperior extends Vip{
    private double adicionalSuperior;

    public CamaroteSuperior(double adSup, double val, double ad) {
        super(val, ad);
        this.adicionalSuperior = adSup;
    }
    public double imprimeValor(){
        return (this.valor + this.adicional + this.adicionalSuperior);
    }
    
@Override
    public String toString(){
        return ("| Valor do Ingresso VIP Camarote Superior: R$"+this.imprimeValor()+" |");
    }
}
