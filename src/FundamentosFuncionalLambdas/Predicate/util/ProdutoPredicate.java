package FundamentosFuncionalLambdas.Predicate.util;

import FundamentosComposicao.DesafioFixacao.entidades.Produto;

import java.util.function.Predicate;

public class ProdutoPredicate implements Predicate<Produto> {

    @Override
    public boolean test(Produto produto) {
        return produto.getPrecoProduto() >= 100.0;
    }
}

//expressão lambda com implementação da interface