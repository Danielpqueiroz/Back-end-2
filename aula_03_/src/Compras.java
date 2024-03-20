public class Compras {
    String descricao;
    Double valor;
    Integer quantidade;

    // Construtor da classe
    public Compras(String descricao, Double valor, Integer quantidade) {
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;

    }

    // Método para calcular o valor total da compra
    public Double valorTotal() {
        return valor * quantidade;
    }
}
