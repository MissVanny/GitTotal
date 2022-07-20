package A3PSC;

public class Romaneio {
    //Atributos
private int IdRomaneio, quantidade;
private String titulo,tamanho, observacao;
private String dataPedido;
    
    //Construtores
    
    public Romaneio() {
    }

    public Romaneio(String titulo, String tamanho, int quantidade, String DataPedido) {
        this.titulo = titulo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.dataPedido = DataPedido;
    }

    //Métodos

    public int getIdRomaneio() {
        return IdRomaneio;
    }

    public void setIdRomaneio(int IdRomaneio) {
        this.IdRomaneio = IdRomaneio;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String DataPedido) {
        this.dataPedido = DataPedido;
    }
    
    public void imprimirromaneio(){
        System.out.println("==========Romaneio==========");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Data: " + this.dataPedido);
        System.out.println("============================");
    }
    
}