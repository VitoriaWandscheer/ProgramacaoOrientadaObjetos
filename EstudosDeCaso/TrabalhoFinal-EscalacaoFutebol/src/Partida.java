public class Partida {
    private int idPartida;
    private String dataHora, local;

    public Partida(int idPartida, String dataHora, String local) {
        this.idPartida = idPartida;
        this.dataHora = dataHora;
        this.local = local;
    }

    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Partida [idPartida = " + idPartida + ", dataHora = " + dataHora + ", local = " + local + "]";
    }

}
