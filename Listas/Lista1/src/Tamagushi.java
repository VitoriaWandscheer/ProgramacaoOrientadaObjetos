/*
* Para meu Tamagushi, defini:
*
* FOME: valores de 0 a 5, sendo 0 sem fome e 5 muita fome.
* SAUDE: valores entre 0 e 5, sendo 0 muito doente e 5 saudável.
*
* HUMOR:
*
*   TRISTE =(
*      saude   =   1
*      fome    =   4 ou 5
*
*   APATICO =|
*      saude   =   2 ou 3
*      fome    =   2 ou 3
*
*   FELIZ =)
*      saude   =   4 ou 5
*      fome    =   1
* 
 */


/**
 *
 * @author Vitória
 */
public class Tamagushi {
    private String nome;
    private int fome, saude, idade;

    public Tamagushi(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String humor(){
        if ((this.saude < 2) || (this.fome > 3)){
            return "TRISTE :(";
        } else if ((this.saude < 4) || (this.fome > 1)){
            return "APÁTICO :|";
        } else {
            return "FELIZ :)";
        }
    }
}