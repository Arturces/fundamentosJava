package FundamentosComposicao.ExercComposicao.entidades;

import FundamentosComposicao.ExercComposicao.enums.NivelDeTrabalho;

import java.util.ArrayList;
import java.util.Calendar;

public class Trabalhador {
    private String nome;
    private NivelDeTrabalho nivel;
    private double baseSalario;

    private Departamento departamento;
    private ArrayList<ContratoPorHora> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, NivelDeTrabalho nivel, double baseSalario, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.baseSalario = baseSalario;
        this.departamento = departamento;
    }

    public void addContrato(ContratoPorHora contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(ContratoPorHora contrato) {
        contratos.remove(contrato);
    }

    public double renda(int ano, int mes) {
        double soma = baseSalario;
        Calendar cal = Calendar.getInstance();
        for (ContratoPorHora contrato : contratos) {
            //soma += contrato.valorTotal(); //retornar o valor total
            cal.setTime(contrato.getData());
            int contrato_ano = cal.get(Calendar.YEAR);
            int contrato_mes = 1 + cal.get(Calendar.MONTH);
            if (ano  == contrato_ano && mes == contrato_mes) {
                soma += contrato.valorTotal();
            }
            }
            return soma;
        }


        public String getNome () {
            return nome;
        }

        public void setNome (String nome){
            this.nome = nome;
        }

        public NivelDeTrabalho getNivel () {
            return nivel;
        }

        public void setNivel (NivelDeTrabalho nivel){
            this.nivel = nivel;
        }

        public double getBaseSalario () {
            return baseSalario;
        }

        public void setBaseSalario ( double baseSalario){
            this.baseSalario = baseSalario;
        }

        public Departamento getDepartamento () {
            return departamento;
        }

        public void setDepartamento (Departamento departamento){
            this.departamento = departamento;
        }

        public ArrayList<ContratoPorHora> getContratos () {
            return contratos;
        }

/*    public void setContratos(ArrayList<ContratoPorHora> contratos) {
        this.contratos = contratos;
    }*/
    }
