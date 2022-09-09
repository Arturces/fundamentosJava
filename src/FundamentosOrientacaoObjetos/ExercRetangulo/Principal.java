package FundamentosOrientacaoObjetos.ExercRetangulo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Retangulo r = new Retangulo();

        System.out.println("Entre com a altura: ");
        r.altura = entrada.nextDouble();
        System.out.println();

        System.out.println("entrega com a largura: ");
        r.largura = entrada.nextDouble();
        System.out.println();

        System.out.println(r.toString());

        System.out.println("a area é: " + r.area());
        System.out.println("a area é: " + r.perimetro());
        System.out.println("a area é: " + r.diagonal());


    }
}
