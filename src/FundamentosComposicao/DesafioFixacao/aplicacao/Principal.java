package FundamentosComposicao.DesafioFixacao.aplicacao;

import FundamentosComposicao.DesafioFixacao.entidades.Cliente;
import FundamentosComposicao.DesafioFixacao.entidades.ItemPedido;
import FundamentosComposicao.DesafioFixacao.entidades.Pedido;
import FundamentosComposicao.DesafioFixacao.entidades.Produto;
import FundamentosComposicao.DesafioFixacao.enums.StatusPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Email: ");
        String email = entrada.nextLine();
        System.out.print("Data de aniversario dd/MM/yyyy : ");
        Date dataNascimento = sdf.parse(entrada.next());

        Cliente cliente = new Cliente(nome, email, dataNascimento);

        System.out.print("Insira o STATUS do pedido: ");
        StatusPedido statusPedido = StatusPedido.valueOf(entrada.next());

        Pedido pedido = new Pedido(new Date(), statusPedido, cliente);

        System.out.print("São quantos Itens para esse Pedido: ");
        int n = entrada.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Insira os dados do Item #:" + i);
            System.out.print("Nome Produto: ");
            entrada.nextLine();
            String nomeProduto = entrada.nextLine();
            System.out.print("Preco Produto: ");
            double precoProduto = entrada.nextDouble();

            Produto produto = new Produto(nomeProduto, precoProduto);

            System.out.print("Entre com a quantidade: ");
            int quantidade = entrada.nextInt();

            ItemPedido itemPedido = new ItemPedido(quantidade, precoProduto, produto);

            pedido.addItem(itemPedido);

        }

        System.out.println();
        System.out.println("RESUMO DO PEDIDO");
        System.out.println(pedido);

        entrada.close();
    }
}
