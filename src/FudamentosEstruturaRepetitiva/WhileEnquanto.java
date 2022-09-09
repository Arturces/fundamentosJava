package FudamentosEstruturaRepetitiva;

import javax.swing.*;

public class WhileEnquanto {

    public static void main(String[] args) {


       int x;

       x = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero"));

        int soma = 0;
        while (x !=0 ) {
         soma += x;
         x = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente"));
        }

        System.out.println(soma);

     }
    }
