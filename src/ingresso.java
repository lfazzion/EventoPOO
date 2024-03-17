public class ingresso {
    private String arte;
    private int codigo, numero;

    public ingresso(String arte, int codigo, int numero) {
        this.arte = arte;
        this.codigo = codigo;
        this.numero = numero;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
