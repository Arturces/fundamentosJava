package FudamentosEstruturaRepetitiva;

import javax.swing.*;

public class ExercWhileMediaIdade {
    public static void main(String[] args) {

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero: "));

        int soma = 0;
        int cont = 0; // contador

        while (idade >= 0) {
            soma += idade;
            cont++;
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite um novo Numero: "));
        }
            if (cont > 0) {
                double media = (double) soma / cont; //cast para o valor nao sair inteiro
                System.out.printf("%.2f", media);
            } else {
                System.out.println("Impossivel Calcular");
            }

        }
    }
