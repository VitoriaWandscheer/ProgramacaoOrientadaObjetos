
package lista1;

/**
 *
 * @author Vitória
 */
public class bombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro, quantidadeCombustivel;

    public bombaCombustivel(String tipoComb, double valLitro, double qtdComb) {
        this.tipoCombustivel = tipoComb;
        this.valorLitro = valLitro;
        this.quantidadeCombustivel = qtdComb;
    }
    
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
    
    private void abastecimento(double totalLitros) {
        this.quantidadeCombustivel = this.quantidadeCombustivel - totalLitros;
    }
    
    public void abastecerPorValor(double valor) {
        double totalLitros = valor / this.valorLitro;
        if (this.quantidadeCombustivel < totalLitros) {
            System.out.println("Não há combustível suficiente na bomba para abastecer "+totalLitros+" litros.");
        } else {
            abastecimento(totalLitros);
            System.out.println("Foram abastecidos "+totalLitros+" litros de combustivel "+this.tipoCombustivel+".");
        }
    }
    
    public void abastecerPorLitro(double totalLitros) {
        double valor = totalLitros * this.valorLitro;
        if (this.quantidadeCombustivel < totalLitros) {
            System.out.println("Não há combustível suficiente na bomba para abastecer "+totalLitros+" litros.");
        } else {
            abastecimento(totalLitros);
            System.out.println("Foram abastecidos R$"+valor+" de combustivel "+this.tipoCombustivel+".");
        }
    }
}
