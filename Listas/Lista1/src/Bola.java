/**
 *
 * @author Vitória
 */
public class Bola {
    private String cor, material;
    private double circunferencia;

    public Bola(String cor, String material, double circ) {
        this.cor = cor;
        this.material = material;
        this.circunferencia = circ;
    }

    public String mostraCor() {
        return cor;
    }

    public void trocaCor(String cor) {
        this.cor = cor;
    }
}
