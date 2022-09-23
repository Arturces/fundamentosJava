package FundamentosException.TratamentoTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintStackTrace {

    public static void main(String[] args) {

        metodo1();

        System.out.println("Fim do programa!");
    }

    public static void metodo1() {
        System.out.println("*** METODO 1 START***");
        metodo2();

        System.out.println("*** METODO 2 FINAL***");

    }



        public static void metodo2() {
        System.out.println("*** METODO 2 START***");
        Scanner entrada = new Scanner(System.in);

        try {
            String[] vetor = entrada.nextLine().split(" ");
            int posicao = entrada.nextInt();
            System.out.println(vetor[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição invalida!");
            e.printStackTrace();
            entrada.next();
        } catch (InputMismatchException e) {
            System.out.println("Error Input!");
        }

        entrada.close();
        System.out.println("*** METODO 2 FINAL***");


    }
}

