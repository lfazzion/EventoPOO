public class loteDeIngresso {
    private String nomeLote, dataInicio, dataTermino;
    private int preco, qntIngressos, expVenda;

    public loteDeIngresso(String nomeLote, String dataInicio, String dataTermino, int preco, int qntIngressos, int expVenda) {
        this.nomeLote = nomeLote;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.preco = preco;
        this.qntIngressos = qntIngressos;
        this.expVenda = expVenda;
    }

    public String getNomeLote() {
        return nomeLote;
    }

    public void setNomeLote(String nomeLote) {
        this.nomeLote = nomeLote;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQntIngressos() {
        return qntIngressos;
    }

    public void setQntIngressos(int qntIngressos) {
        this.qntIngressos = qntIngressos;
    }

    public int getExpVenda() {
        return expVenda;
    }

    public void setExpVenda(int expVenda) {
        this.expVenda = expVenda;
    }
}
