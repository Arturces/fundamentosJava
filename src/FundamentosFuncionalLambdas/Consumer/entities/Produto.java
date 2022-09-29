package FundamentosFuncionalLambdas.Consumer.entities;

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

    public static boolean staticProdutoPredicate(Produto p){ //expressao lambda com referece method com metodo static
        return p.getPrecoProduto() >= 100.0;
    }

    public boolean nonStaticProdutoPredicate(){//expressao lambda com referece method com metodo não static
        return preco >= 100.0;
    }

    public static void staticPrecoUpdate(Produto p){
        p.setPrecoProduto(p.getPrecoProduto() * 1.1);
    }

    public void nonStaticPrecoUpdate(){
        setPrecoProduto(getPrecoProduto() * 1.1);
    }

    @Override
    public String toString(){
        return nome + ", " + String.format("%.2f",preco);
    }
}
