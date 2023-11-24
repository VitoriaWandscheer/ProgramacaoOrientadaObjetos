public class Time {
    private String nome, estadio;
    private Treinador treinador;
    
    public Time(String nome, String estadio, Treinador treinador) {
        this.nome = nome;
        this.estadio = estadio;
        this.treinador = treinador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    @Override
    public String toString() {
        return "Time [ nome = " + this.nome + ", estadio = " + this.estadio + ", treinador = " + this.treinador + "]";
    }

}
