public class Circulo extends Figura{
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double calculaArea(){
        return 3.14 * (Math.pow(raio, 2));
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", área=" + this.calculaArea() +
                '}';
    }
}
