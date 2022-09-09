package FudamentosEstruturaCondicionais;

import java.util.Scanner;

public class EstruturaIfElse {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("São que horas: ?");
        int horas = entrada.nextInt();

        if (horas < 12) {
            System.out.println("Bom dia");
        } else if ( horas < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        entrada.close();
    }
}
