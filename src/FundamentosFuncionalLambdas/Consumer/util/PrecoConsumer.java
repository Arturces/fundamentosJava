package FundamentosFuncionalLambdas.Consumer.util;

import FundamentosFuncionalLambdas.Consumer.entities.Produto;

import java.util.function.Consumer;

public class PrecoConsumer implements Consumer<Produto> {


    @Override
    public void accept(Produto p) {
        p.setPrecoProduto(p.getPrecoProduto() * 1.1);
    }
}
