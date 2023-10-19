public class Quadrado extends Figura{
    private double lado;

    public Quadrado(String cor, double lado) {
        super(cor);
        this.lado = lado;
    }

    @Override
    public double calculaArea(){
        return this.lado * this.lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                ", área=" + this.calculaArea() +
                '}';
    }
}
