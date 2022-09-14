package FundamentosHerança.ExercPolimofirsmoEmpregado.aplicacao;

import FundamentosHerança.ExercPolimofirsmoEmpregado.entidades.Empregado;
import FundamentosHerança.ExercPolimofirsmoEmpregado.entidades.EmpregadoTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com a quantidade de funcionarios: ");
        int n = entrada.nextInt();

        List<Empregado> empregados = new ArrayList<>();

        for (int i = 1; i <=n; i++) {
            System.out.println("Funcionario #" + i + " Dados: ");
            System.out.print("Terceirizado (y/n)? ");
            char ch = entrada.next().charAt(0);
            System.out.print("Nome Completo: ");
            entrada.nextLine();
            String nome = entrada.nextLine();
            System.out.print("Quantidade de Horas: ");
            int horas = entrada.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = entrada.nextDouble();

            if (ch == 'y'){
                System.out.println("Cobrança adicional: ");
                double cobrancaAdicional = entrada.nextDouble();
                //Empregado emp = new EmpregadoTerceirizado(nome, horas, valorPorHora, cobrancaAdicional);
                empregados.add(new EmpregadoTerceirizado(nome, horas, valorPorHora, cobrancaAdicional));;
            }
            else {
               // Empregado emp = new Empregado(nome, horas, valorPorHora);
                empregados.add(new Empregado(nome, horas, valorPorHora));
            }

        }

        System.out.println();
        System.out.println("PAGAMENTOS:");
        for(Empregado emp : empregados){
            System.out.println(emp.getNome() + " - R$ " + String.format("%.2f", emp.pagamento()));
        }


        entrada.close();
    }
}
