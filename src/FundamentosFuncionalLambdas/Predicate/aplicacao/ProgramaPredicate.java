package FundamentosFuncionalLambdas.Predicate.aplicacao;


import FundamentosFuncionalLambdas.Predicate.entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class ProgramaPredicate {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Produto> list = new ArrayList<>();
        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));

        double min = 100.0;

       // Predicate<Produto> predicate = p -> p.getPrecoProduto() >= min; expressa lambda declarada

        list.removeIf(p -> p.getPrecoProduto() >= min); //expressao lambda inline

        for(Produto p : list){ //pra cada produto p na minha lista 'list' imprima meu produto 'p' na tela.
            System.out.println(p);
        }

    }
}
