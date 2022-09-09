package FudamentosEstruturaCondicionais;

import java.util.Scanner;

//Fazer um programa para ler um valor inteiro de 1 a 7 representando um
//dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
//Escrever na tela o dia da semana correspondente, conforme exemplos.

public class ExemploIfeElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia da semana:");
        int x = sc.nextInt();
        String dia;

        if (x == 1) {
            dia = "domingo";
        }
        else if (x == 2) {
            dia = "segunda";
        }
        else if (x == 3) {
            dia = "terca";
        }
        else if (x == 4) {
            dia = "quarta";
        }
        else if (x == 5) {
            dia = "quinta";
        }
        else if (x == 6) {
            dia = "sexta";
        }
        else if (x == 7) {
            dia = "sabado";
        }
        else {
            dia = "valor invalido";
        }
        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}
