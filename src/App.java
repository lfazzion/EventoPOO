import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int ConvertCapacidade, ConvertPreco, ConvertQntIngressos, ConvertExpVenda, ConvertCodigo, ConvertNumero;

        String Nomelocal = JOptionPane.showInputDialog(null, "Digite o nome do local");
        String Endereco = JOptionPane.showInputDialog(null, "Digite o endereço do local");
        String tipodeEstrutura = JOptionPane.showInputDialog(null, "Digite o tipo de estrutura do local");
        String Capacidade = JOptionPane.showInputDialog(null, "Digite a capacidade do local");
        String Genero = JOptionPane.showInputDialog(null, "Digite o genero do evento");
        String Artista = JOptionPane.showInputDialog(null, "Digite o artista do evento");
        String Duracao = JOptionPane.showInputDialog(null, "Digite a duracao do evento");
        String nomeevento = JOptionPane.showInputDialog(null, "Nome do evento");
        String datahora = JOptionPane.showInputDialog(null, "Digite a data e hora (HH:MM DD/MM/AAAA):");
        String Nomelote = JOptionPane.showInputDialog(null, "Digite o nome do lote");
        String DataInicio = JOptionPane.showInputDialog(null, "Digite a data de inicio do lote");
        String DataTermino = JOptionPane.showInputDialog(null, "Digite a data de termino do lote");
        String Preco = JOptionPane.showInputDialog(null, "Digite o preco do lote");
        String QntIngressos = JOptionPane.showInputDialog(null, "Digite a quantidade de ingressos do lote");
        String ExpVenda = JOptionPane.showInputDialog(null, "Digite a expectativa de venda: ");
        String Arte = JOptionPane.showInputDialog(null, "Digite a arte do ingresso");
        String Codigo = JOptionPane.showInputDialog(null, "Digite o codigo do ingresso");
        String Numero = JOptionPane.showInputDialog(null, "Digite o numero do ingresso");

        ConvertCapacidade = Integer.parseInt(Capacidade);
        local l1 = new local(Nomelocal, Endereco, tipodeEstrutura, ConvertCapacidade);

        tipoDeEvento t1 = new tipoDeEvento(Genero, Artista, Duracao);

        evento e1 = new evento(nomeevento, datahora);

        ConvertPreco = Integer.parseInt(Preco);
        ConvertQntIngressos = Integer.parseInt(QntIngressos);
        ConvertExpVenda = Integer.parseInt(ExpVenda);
        loteDeIngresso lote1 = new loteDeIngresso(Nomelote, DataInicio, DataTermino, ConvertPreco, ConvertQntIngressos, ConvertExpVenda);

        ConvertCodigo = Integer.parseInt(Codigo);
        ConvertNumero = Integer.parseInt(Numero);
        ingresso i1 = new ingresso(Arte, ConvertCodigo, ConvertNumero);

        JOptionPane.showMessageDialog(null, "Nome do local: " + l1.getNomeLocal() +
                "\nEndereço do local: " + l1.getEndereco() +
                "\nTipo de Estrutura: " + l1.getTipoDeEstrutura() +
                "\nCapacidade do local: " + l1.getCapacidade() +
                "\nGenero do evento: " + t1.getGenero() +
                "\nArtista: " + t1.getArtista() +
                "\nEvento vai durar: " + t1.getDuracao() +
                "\nNome do evento: " + e1.getNomeEvento() +
                "\nData e hora do evento: " + e1.getDataHora() +
                "\nNome do Lote: " + lote1.getNomeLote() +
                "\nData de Início do lote: " + lote1.getDataInicio() +
                "\nData de Término do lote: " + lote1.getDataTermino() +
                "\nPreço do lote: " + lote1.getPreco() +
                "\nQuantidade de Ingressos: " + lote1.getQntIngressos() +
                "\nExpectativa de Venda: " + lote1.getExpVenda() +
                "\nArte do ingresso: " + i1.getArte() +
                "\nCódigo do ingresso: " + i1.getCodigo() +
                "\nNúmero do ingresso: " + i1.getNumero());
    }
}