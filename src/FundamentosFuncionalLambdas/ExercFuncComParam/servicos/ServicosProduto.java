package FundamentosFuncionalLambdas.ExercFuncComParam.servicos;

import FundamentosFuncionalLambdas.ExercFuncComParam.entities.Produto;

import java.util.List;
import java.util.function.Predicate;

public class ServicosProduto {

    public double filtrarSoma(List<Produto> list, Predicate<Produto> criterio){
        double soma = 0.0;
        for (Produto p : list){
            if(criterio.test(p)){
                soma += p.getPrecoProduto();
            }
        }
        return soma;
    }



}
