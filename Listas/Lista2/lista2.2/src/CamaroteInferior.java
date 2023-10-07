/**
 *
 * @author Vitória
 */
public class CamaroteInferior extends Vip {
    private int poltrona;

    public CamaroteInferior(int polt, double val, double ad) {
        super(val, ad);
        this.poltrona = polt;
    }

    public int imprimePoltrona() {
        return poltrona;
    }

    public void alteraPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }
    
@Override
    public String toString(){
        return ("| Valor do Ingresso VIP Camarote Inferior: R$"+this.imprimeValor()+" | Poltrona: "+this.poltrona+" |");
    }
}