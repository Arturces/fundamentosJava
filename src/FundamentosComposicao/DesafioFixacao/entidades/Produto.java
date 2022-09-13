package FundamentosComposicao.DesafioFixacao.entidades;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoProduto() {
        return preco;
    }

    public void setPrecoProduto(double precoProduto) {
        this.preco = precoProduto;
    }


}
