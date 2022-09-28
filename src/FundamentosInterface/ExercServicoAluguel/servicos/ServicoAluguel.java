package FundamentosInterface.ExercServicoAluguel.servicos;

import FundamentosInterface.ExercServicoAluguel.entidades.AluguelCarro;
import FundamentosInterface.ExercServicoAluguel.entidades.Faturamento;

public class ServicoAluguel {

    private Double precoPorDia;
    private Double precoPorHora;

    private TaxaServico taxaServico;

    public ServicoAluguel(Double precoPorDia, Double precoPorHora, TaxaServico taxaServico) {
        this.precoPorDia = precoPorDia;
        this.precoPorHora = precoPorHora;
        this.taxaServico = taxaServico;
    }

    public void processandoFaturamento(AluguelCarro aluguelCarro){
        long t1 = aluguelCarro.getIniciar().getTime();
        long t2 = aluguelCarro.getFinalizar().getTime();
        double horas = (double)(t2 - t1) / 1000 / 60 / 60;

        double pagamentoBasico;
        if(horas <= 12.00){
            pagamentoBasico = Math.ceil(horas) * precoPorHora;
        } else {
            pagamentoBasico = Math.ceil(horas / 24) * precoPorDia;
        }

        double taxa = taxaServico.taxa(pagamentoBasico);

        aluguelCarro.setFaturamento(new Faturamento(pagamentoBasico,taxa));
    }
}
