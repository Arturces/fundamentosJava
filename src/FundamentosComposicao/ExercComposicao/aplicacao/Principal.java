package FundamentosComposicao.ExercComposicao.aplicacao;

import FundamentosComposicao.ExercComposicao.entidades.ContratoPorHora;
import FundamentosComposicao.ExercComposicao.entidades.Departamento;
import FundamentosComposicao.ExercComposicao.entidades.Trabalhador;
import FundamentosComposicao.ExercComposicao.enums.NivelDeTrabalho;

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

        System.out.print("Entre com o nome do departamento: ");
        String departamento = entrada.nextLine();

        System.out.println("Entre com os dados do trabalhador: ");
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Nivel: " );
        String nivel = entrada.nextLine();
        System.out.print("Base Salarial: ");
        double baseSalario = entrada.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nome, NivelDeTrabalho.valueOf(nivel), baseSalario, new Departamento(departamento));

        System.out.println("Quantos contratos o trabalhador tem: ");
        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Insira o numero do contrato #" + i);
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataDoContrato = sdf.parse(entrada.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = entrada.nextDouble();
            System.out.print("Duração do contrato (horas): ");
            int horas = entrada.nextInt();
            ContratoPorHora contrato = new ContratoPorHora(dataDoContrato, valorPorHora, horas);
            trabalhador.addContrato(contrato);
        }
        System.out.println();
        System.out.println("Entre com o mes e ano para calcula o salario (MM/YYYY): ");
        String mesEAno = entrada.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Renda para: " + mesEAno + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));

        entrada.close();
    }
}