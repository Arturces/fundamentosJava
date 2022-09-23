package FundamentosHerança.ExercClassesAbstratasFormas.aplicacao;

import FundamentosHerança.ExercClassesAbstratasFormas.entidades.Circulo;
import FundamentosHerança.ExercClassesAbstratasFormas.entidades.Forma;
import FundamentosHerança.ExercClassesAbstratasFormas.entidades.Retangulo;
import FundamentosHerança.ExercClassesAbstratasFormas.enums.Cores;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        List<Forma> formas = new ArrayList<>();

        System.out.print("Entre com o numero de formas: ");
        int n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Figura #" + i + " Dados: ");
            System.out.print("Retangulo ou Circulo (r/c)? ");
            char ch = entrada.next().charAt(0);
            System.out.print("Cor (PRETO/AZUL/VERMELHO: ");
            Cores cores = Cores.valueOf(entrada.next());

            if (ch == 'r') {
                System.out.print("Largura: ");
                double largura = entrada.nextDouble();
                System.out.print("Altura: ");
                double altura = entrada.nextDouble();
                formas.add(new Retangulo(cores, largura, altura));
            } else {
                System.out.print("Raio: ");
                double radio = entrada.nextDouble();
                formas.add(new Circulo(cores, radio));
            }

        }

        System.out.println();
        System.out.println("Formas das Areas: ");
        for (Forma forma : formas) {
            System.out.println(String.format("%.2f", forma.area()));
            entrada.close();
        }
    }
}
