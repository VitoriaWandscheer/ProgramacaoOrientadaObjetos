public class Caminhao extends Veiculos {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public void exibirDados() {
        System.out.println("Placa: "+super.getPlaca()+" | Ano: "+super.getAno()+" | Eixos: "+this.eixos);
    }
}
