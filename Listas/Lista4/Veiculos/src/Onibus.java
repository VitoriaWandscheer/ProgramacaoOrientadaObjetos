public class Onibus extends Veiculos {
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }
    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void exibirDados() {
        System.out.println("Placa: "+super.getPlaca()+" | Ano: "+super.getAno()+" | Assentos: "+this.assentos);
    }
}
