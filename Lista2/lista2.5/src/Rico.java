public class Rico extends Pessoa{
    private double dinheiro;

    public Rico(String nome, int idade, double dinheiro) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }

    public String fazCompras(double valor){
        this.dinheiro = this.dinheiro-valor;
        return "A vendedora que me atendeu ganha comissão e ainda quer ter licença maternidade, esses \"trabalhadores tem que escolher entre ter direitos ou emprego\"!";
    }

    public void recebeDinheiro(double valor){
        this.dinheiro = this.dinheiro + valor;
    }
    
    @Override
    public String toString(){
        return "| Nome: "+this.nome+" | Idade: "+this.idade+" | Saldo: "+dinheiro+" |";
    }
}
