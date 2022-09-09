package FudamentosEstruturaCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaIfElseAtribuicao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite os minutos gastos: ");
        int minutos = entrada.nextInt();

        double conta = 50.0F;
        if ( minutos > 100){
            conta += (minutos - 100) * 2.0;
        }
        //System.out.println("valor da conta é R$ " + conta);
        System.out.printf("O valor da conta é R$ %.2f" , conta);

        entrada.close();
    }
}
