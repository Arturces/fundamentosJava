package FundamentosInterface.ExercServicoAluguel.aplicacao;

import FundamentosInterface.ExercServicoAluguel.entidades.AluguelCarro;
import FundamentosInterface.ExercServicoAluguel.entidades.Veiculo;
import FundamentosInterface.ExercServicoAluguel.servicos.ServicoAluguel;
import FundamentosInterface.ExercServicoAluguel.servicos.TaxaServicoBrasileiro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Entre com a data de Aluguel: ");
        System.out.print("Modelo do Carro: ");
        String modeloCarro = entrada.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:ss): ");
        Date iniciar = sdf.parse(entrada.nextLine());
        System.out.print("Entrega (dd/MM/yyyy hh:ss): ");
        Date finalizar = sdf.parse(entrada.nextLine());

        AluguelCarro cr = new AluguelCarro(iniciar,finalizar, new Veiculo(modeloCarro));

        System.out.print("Entre com o preço por hora: ");
        double precoPorHora = entrada.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double precoPorDia = entrada.nextDouble();

        ServicoAluguel servicoAluguel = new ServicoAluguel(precoPorDia, precoPorHora, new TaxaServicoBrasileiro());

        servicoAluguel.processandoFaturamento(cr);

        System.out.println("FATURAMENTO: ");
        System.out.println("Pagamento basico: " + String.format("%.2f", cr.getFaturamento().getPagamentoBasico()));
        System.out.println("Taxa: " + String.format("%.2f", cr.getFaturamento().getTaxa()));
        System.out.println("Pagamento Total: " + String.format("%.2f", cr.getFaturamento().getPagamentoTotal()));

        entrada.close();
    }
}
