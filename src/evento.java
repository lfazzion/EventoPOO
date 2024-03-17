public class evento {
    private String nomeEvento, dataHora;

    public evento(String nomeEvento, String dataHora) {
        this.nomeEvento = nomeEvento;
        this.dataHora = dataHora;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
}
