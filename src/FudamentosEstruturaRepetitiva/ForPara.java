package FudamentosEstruturaRepetitiva;

import java.util.Scanner;

public class ForPara {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int N = entrada.nextInt();

        int soma = 0;
        for (int i=0; i<N; i++){
        int x = entrada.nextInt();
        soma = soma + x;
        }

        System.out.println(soma);

        entrada.close();
    }
}
