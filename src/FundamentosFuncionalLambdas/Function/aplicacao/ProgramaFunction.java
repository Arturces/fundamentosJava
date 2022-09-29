package FundamentosFuncionalLambdas.Function.aplicacao;


import FundamentosFuncionalLambdas.Function.entities.Produto;
import FundamentosFuncionalLambdas.Function.util.UpperCaseNameFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgramaFunction {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Produto> list = new ArrayList<>();
        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));


        List<String> nomes = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());


        //List <String> nomes = list.stream().map(function).collect(Collectors.toList());
        // List <String> nomes = list.stream().map(Produto::staticUpperCaseName).collect(Collectors.toList());
        //List <String> nomes = list.stream().map(Produto::nonStaticUpperCaseName).collect(Collectors.toList());

        nomes.forEach(System.out::println);
    }
}
