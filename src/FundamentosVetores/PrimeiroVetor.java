package FundamentosVetores;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro N e a altura de N
        pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
        altura média dessas pessoas.*/

public class PrimeiroVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // pergunto a quantidade de vetores

        double[] vetor = new double[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
        }

        double soma = 0.0; 
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }
        double avg = soma / n;
        System.out.printf("Altura Media: %.2f%n", avg);


        sc.close();
    }
}