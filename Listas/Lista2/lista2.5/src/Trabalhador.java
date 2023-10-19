/**
 *
 * @author Vitória
 */
public class Trabalhador extends Pessoa {
    private int tempoTrabalhado;
    private double salarioMinimo;

    public Trabalhador(String nome, int idade){
        super(nome, idade);
        this.tempoTrabalhado = 0;
        this.salarioMinimo = 1320.00;
    };

    public void produz(){
        this.tempoTrabalhado = this.tempoTrabalhado + (26 * 8); // 26 dias, 8h/dia
    };

    public String trabalha(){
        produz();
        return ("Trabalhei durante "+this.tempoTrabalhado+" horas esse mês e recebi R$"+this.salarioMinimo+".");
    };

    @Override
    public String toString(){
        double contasMensais = 1128.00;
        return "| Nome: "+this.nome+" | Idade: "+this.idade+" | Saldo: "+(salarioMinimo-contasMensais)+" |";
    }
}
