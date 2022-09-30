package FundamentosStream.ExercStream.entidades;

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

    public static String staticUpperCaseName(Produto p) {
        return p.getNome().toUpperCase();
    }

    public String nonStaticUpperCaseName() {
        return nome.toUpperCase();
    }

    @Override
    public String toString() {
        return nome + ", " + String.format("%.2f", preco);
    }
}
