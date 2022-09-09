package FundamentosOrientacaoObjetos.ExercProdutoFundamentosPOO;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);


        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        String nome = (entrada.nextLine());
        System.out.print("Preço: ");
        double preco = (entrada.nextDouble());
        System.out.print("Quantidade em estoque: ");
        int quantidade = (entrada.nextInt());

        Produto produto = new Produto(nome,preco, quantidade);

        System.out.println();
        System.out.println("Dados do produto: " + produto);
        System.out.println();

        System.out.println("Entre com o numero de produto para ser add no estoque: ");
        quantidade = entrada.nextInt();
        produto.addProduto(quantidade);

        System.out.println();
        System.out.println("Dados do atualizados: " + produto);
        System.out.println();

        System.out.println("Entre com o numero de produto para ser removidos no estoque: ");
        quantidade = entrada.nextInt();
        produto.removerProduto(quantidade);

        System.out.println();
        System.out.println("Dados do atualizados: " + produto);

        entrada.close();
    }
}
