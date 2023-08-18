
package lista1;

/**
 *
 * @author Vitória
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double peso, altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public void envelhecer() {
        this.idade = this.idade+1;
        if (this.idade < 21){
            crescer(0.5);
        }
    }
    
    public void crescer(double cent) {
        this.altura = this.altura+cent;
    }
    
    public void engordar(double quilos){
        this.peso = this.peso+quilos;
    }
    
    public void emagrecer(double quilos){
        this.peso = this.peso-quilos;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    } 
}
