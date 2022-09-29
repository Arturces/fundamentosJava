package FundamentosFuncionalLambdas.Consumer.aplicacao;


import FundamentosFuncionalLambdas.Consumer.entities.Produto;
import FundamentosFuncionalLambdas.Consumer.util.PrecoConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ProgramaConsumer {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Produto> list = new ArrayList<>();
        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));

        double fator = 1.1;

        //Consumer<Produto> consumer = produto -> produto.setPrecoProduto(produto.getPrecoProduto() * fator);

        list.forEach(produto -> produto.setPrecoProduto(produto.getPrecoProduto() * fator));

       //list.forEach(Produto::nonStaticPrecoUpdate);
      // list.forEach(consumer);

       list.forEach(System.out::println);

    }
}
