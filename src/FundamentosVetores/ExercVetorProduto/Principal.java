package FundamentosVetores.ExercVetorProduto;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        Produto[] vetor = new Produto[n];

        for (int i = 0; i < vetor.length; i++) {
            entrada.nextLine();
            String nome = entrada.nextLine();
            double preco = entrada.nextDouble();
            vetor[i] = new Produto(nome, preco);
        }

        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i].getPreco();
        }

        double media = soma / vetor.length;
        System.out.println("A media é: " + media);

        entrada.close();
    }
}
