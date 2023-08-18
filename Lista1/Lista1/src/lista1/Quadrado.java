
package lista1;

/**
 *
 * @author Vitória
 */
public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double mostraLado() {
        return lado;
    }

    public void trocaLado(double lado) {
        this.lado = lado;
    }
    
    public double calculaArea() {
        return (this.lado*this.lado);
    }
    
}
