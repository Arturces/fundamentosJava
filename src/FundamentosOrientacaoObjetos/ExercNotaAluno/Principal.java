package FundamentosOrientacaoObjetos.ExercNotaAluno;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno a = new Aluno();
        a.nome = sc.nextLine();
        a.grade1 = sc.nextDouble();
        a.grade2 = sc.nextDouble();
        a.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", a.finalGrade());
        if (a.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", a.faltaPontos());
        } else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
