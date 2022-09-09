package FudamentosEstruturaRepetitiva;

import java.util.Scanner;

public class ForTabuada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();


        for (int i=1; i <= 10; i++){
        int produto = i*n;
           // System.out.printf("%d x %d = %d\n", i,n,produto);
            System.out.println(i + " x " + n + " = " + produto);
    }
}
}
