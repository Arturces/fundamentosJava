package FudamentosEstruturaRepetitiva;

import java.util.Scanner;

public class ExercForSomaMinMaxValoresImpares {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();
        int y = entrada.nextInt();

        int min, max;
        if (x < y) {
            min = x;
            max = y;
        } else {
            min = y;
            max = x;
        }
        int soma = 0;
        for (int i = min + 1; i < max; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);
    }
}