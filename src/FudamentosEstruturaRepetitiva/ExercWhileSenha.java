package FudamentosEstruturaRepetitiva;

import javax.swing.*;
//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//        incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//        impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

public class ExercWhileSenha {
    public static void main(String[] args) {

        int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a Senha: "));

        while (senha != 2022){
            System.out.println("Senha Invalida");
            senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a Senha: "));
        }
            System.out.println("Acesso permitido");
        }
    }

