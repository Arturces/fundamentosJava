package FundamentosOrientacaoObjetos.ExercTriangulo;

import java.util.Locale;
import java.util.Scanner;

public class ExercAreaTrianguloSemOrientacaoObjetos{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com as areas do triangulo X: ");
        x.a = entrada.nextDouble();
        x.b = entrada.nextDouble();
        x.c = entrada.nextDouble();
        System.out.println("Entre com as areas do triangulo Y: ");
        y.a = entrada.nextDouble();
        y.b = entrada.nextDouble();
        y.c = entrada.nextDouble();

        double areaX = x.area();
        double areaY = x.area();

        System.out.printf("Triangulo X area: %.4f\n", areaX);
        System.out.printf("Triangulo Y area: %.4f\n", areaY);

        if (areaX > areaY){
            System.out.println("Maior area é do X");
        } else
            System.out.println("Maior area é do Y");

        entrada.close();
    }
}
