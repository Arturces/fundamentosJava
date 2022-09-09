package FudamentosEstruturaRepetitiva;
import javax.swing.*;

/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        exemplo.*/

public class ExercEscolhaGasolina {
    public static void main(String[] args) {

        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha o combustivel"));

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (escolha !=4 ) {
            if (escolha == 1) {
                alcool ++;

            } else if (escolha == 2) {
                gasolina ++;

            } else if (escolha == 3) {
                diesel ++;
            }
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha o combustivel"));
        }

        System.out.println("Alcool " + alcool);
        System.out.println("Gasolina " + gasolina);
        System.out.println("Diesel " + diesel);
        System.out.println("Muito Obrigado");

    }
}