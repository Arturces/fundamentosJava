package FundamentosLista;

import java.util.ArrayList;
import java.util.List;

public class ExercList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Artur");
        list.add("César");
        list.add("Gonçalves");
        list.add("Moreira");
        list.add("Gabi");

        list.add(2, "Lopes"); //adicinando elementos na lista

        list.removeIf(x -> x.charAt(0) == 'M'); //remover por predicado, lambda

        System.out.println(list.size());

        list.remove("Gonçalves");
        list.remove(0);

        for(String x : list){
            System.out.println(x);
        }

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }
}
