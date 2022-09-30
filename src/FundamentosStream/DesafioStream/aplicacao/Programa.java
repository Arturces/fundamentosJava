package FundamentosStream.DesafioStream.aplicacao;

import FundamentosStream.DesafioStream.entidades.Produto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Produto> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Produto(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double media = list.stream()
                    .map(p -> p.getPrecoProduto())
                    .reduce(0.0, (x, y) -> x + y) / list.size();

            System.out.println("Media Preco: " + String.format("%.2f", media));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> nomes = list.stream()
                    .filter(p -> p.getPrecoProduto() < media)
                    .map(p -> p.getNome())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            nomes.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sc.close();
    }
}