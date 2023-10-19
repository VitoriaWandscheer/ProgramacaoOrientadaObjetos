public abstract class Veiculos {
    private String placa;
    private int ano;

    public Veiculos(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public abstract void exibirDados();

    @Override
    public String toString() {
        return "Veiculos{" +
                "placa='" + placa + '\'' +
                ", ano=" + ano +
                '}';
    }
}
