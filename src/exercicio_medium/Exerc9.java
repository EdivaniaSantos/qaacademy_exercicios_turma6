package exercicio_medium;

import javax.swing.*;

public class Exerc9 {

    public void NomeAluno() {
        int[] numero = new int[5];
        String[] nome = new String[5];
        int i = 0;

        while (i < 5) {

            nome[i] = JOptionPane.showInputDialog("Digite o nome do aluno");
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do aluno"));
            i++;
        }
        i=0;
        while (i < 5) {

            System.out.println("O nome do Aluno é " + nome[i] + " Numero: " + numero[i]);
            i++;
        }
    }
}