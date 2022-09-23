package FundamentosException.TratamentoTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalTryCatch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            String[] vetor = entrada.nextLine().split(" ");
            int posicao = entrada.nextInt();
            System.out.println(vetor[posicao]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição invalida!");
        }
        catch (InputMismatchException e){
            System.out.println("Error Input!");
        }

        System.out.println("Fim do programa!");

        entrada.close();
    }
}
