package FundamentosFuncionalLambdas.Function.util;

import FundamentosFuncionalLambdas.Function.entities.Produto;

import java.util.function.Consumer;
import java.util.function.Function;

public class UpperCaseNameFunction implements Function<Produto, String> {


    @Override
    public String apply(Produto p) {
        return p.getNome().toUpperCase();
    }
}
