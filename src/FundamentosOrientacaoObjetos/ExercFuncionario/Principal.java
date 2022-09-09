package FundamentosOrientacaoObjetos.ExercFuncionario;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Funcionario f = new Funcionario();

        System.out.print("digite o seu nome: ");
        f.setNome(entrada.nextLine());
        System.out.print("digite seu salario bruto: ");
        f.setSalarioBruto(entrada.nextDouble());
        System.out.print("digite o imposto: ");
        f.setImposto(entrada.nextDouble());
        System.out.println();

        System.out.println("Dados Funcionario: " + f.toString() );

        System.out.println();
        System.out.println("Atualizado com imposto: " + f.netSalario());
        System.out.println();

        System.out.print("Qual percentual de aumento: ");
        double porcentagem = entrada.nextDouble();
        f.aumentarSalario(porcentagem);
        System.out.println();

        System.out.println("Atualizado com Aumento: " + f.netSalario());
    }
}
