package FundamentosFuncionalLambdas.ExercFuncComParam.aplicacao;


import FundamentosFuncionalLambdas.ExercFuncComParam.entities.Produto;
import FundamentosFuncionalLambdas.ExercFuncComParam.servicos.ServicosProduto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Produto> list = new ArrayList<>();
        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));

        ServicosProduto sp = new ServicosProduto();

        double soma = sp.filtrarSoma(list, produto -> produto.getNome().charAt(0) == 'M');
        //double soma = sp.filtrarSoma(list, produto -> produto.getPrecoProduto() < 100.0);

        System.out.println("Sum = " + String.format("%.2f", soma));
    }
}
