package FudamentosEstruturaRepetitiva;

import javax.swing.*;

public class ExercWhileCrescente {
    public static void main(String[] args) {

        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro numero"));
        int y;
        y = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo numero"));


        while (x != y) {
            if (x < y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }
            x = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro numero"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo numero"));

        }
    }
}
