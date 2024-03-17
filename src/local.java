public class local {
    private String nomeLocal, endereco, tipoDeEstrutura; //Ex: Arena, Teatro, Estádio.
    private int capacidade;

    public local(String nomeLocal, String endereco, String tipoDeEstrutura, int capacidade) {
        this.nomeLocal = nomeLocal;
        this.endereco = endereco;
        this.tipoDeEstrutura = tipoDeEstrutura;
        this.capacidade = capacidade;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipoDeEstrutura() {
        return tipoDeEstrutura;
    }

    public void setTipoDeEstrutura(String tipoDeEstrutura) {
        this.tipoDeEstrutura = tipoDeEstrutura;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

}
