package FundamentosInterface.modelos.entidades;

import java.util.Date;

public class AluguelCarro {

    private Date iniciar;
    private Date finalizar;

    private Veiculo veiculo;
    private Faturamento faturamento;

    public AluguelCarro(){

    }

    public AluguelCarro(Date iniciar, Date finalizar, Veiculo veiculo) {
        this.iniciar = iniciar;
        this.finalizar = finalizar;
        this.veiculo = veiculo;
    }

    public Date getIniciar() {
        return iniciar;
    }

    public void setIniciar(Date iniciar) {
        this.iniciar = iniciar;
    }

    public Date getFinalizar() {
        return finalizar;
    }

    public void setFinalizar(Date finalizar) {
        this.finalizar = finalizar;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Faturamento getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Faturamento faturamento) {
        this.faturamento = faturamento;
    }
}
