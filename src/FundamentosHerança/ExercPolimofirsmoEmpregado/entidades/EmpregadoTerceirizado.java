package FundamentosHerança.ExercPolimofirsmoEmpregado.entidades;

public class EmpregadoTerceirizado extends Empregado{

    private double cobrancaAdicional;

    public EmpregadoTerceirizado(double cobrancaAdicional) {
        super();
    }

    public EmpregadoTerceirizado(String nome, Integer horas, double valorPorHora, double cobrancaAdicional) {
        super(nome, horas, valorPorHora);
        this.cobrancaAdicional = cobrancaAdicional;
    }


    public double getCobrancaAdicional() {
        return cobrancaAdicional;
    }

    public void setCobrancaAdicional(double cobrancaAdicional) {
        this.cobrancaAdicional = cobrancaAdicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + cobrancaAdicional * 1.1 ;
    }
}

