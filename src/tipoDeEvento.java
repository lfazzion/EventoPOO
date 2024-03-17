public class tipoDeEvento {
    private String genero, artista, duracao;

    public tipoDeEvento(String genero, String artista, String duracao) {
        this.genero = genero;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
