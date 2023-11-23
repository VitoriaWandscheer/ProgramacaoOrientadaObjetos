public class Partida {
    private String dataHora, local;
    private Escalacao escalacao1, escalacao2;

    public Partida(String dataHora, String local, Escalacao escalacao1, Escalacao escalacao2) {
        this.dataHora = dataHora;
        this.local = local;
        this.escalacao1 = escalacao1;
        this.escalacao2 = escalacao2;
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

    public Escalacao getEscalacao1() {
        return escalacao1;
    }

    public void setEscalacao1(Escalacao escalacao1) {
        this.escalacao1 = escalacao1;
    }

    public Escalacao getEscalacao2() {
        return escalacao2;
    }

    public void setEscalacao2(Escalacao escalacao2) {
        this.escalacao2 = escalacao2;
    }

    @Override
    public String toString() {
        System.out.println("--------------------------------");
        System.out.println("----------- Partida ------------");
        System.out.println("--------------------------------");
        System.out.println(this.escalacao1.getTime().getNome() +" X " + this.escalacao2.getTime().getNome());
        System.out.println("--------------------------------");
        System.out.println("Data e Hora: " + this.dataHora);
        System.out.println("--------------------------------");
        System.out.println("Local:" + this.local);
        System.out.println("--------------------------------");
        System.out.println("---------- Escalações ----------");
        System.out.println("--------------------------------");
        System.out.println(this.escalacao1);
        System.out.println("--------------------------------");
        System.out.println(this.escalacao2);

        return "--------------------------------";
    }

}
