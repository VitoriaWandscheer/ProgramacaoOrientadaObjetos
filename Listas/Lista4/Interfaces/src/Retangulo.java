public class Retangulo extends Figura{
    private double base, altura;

    public Retangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea(){
        return this.base * this.altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", área=" + this.calculaArea() +
                '}';
    }
}
