package exercicio_medium;

import javax.swing.*;

public class Exerc5 {
    public void menorNumero() {
        int numeroDigitado, menor = 0;

        for (int i = 0; i < 5; i++) {
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));

            if (i==0){
                menor = numeroDigitado;
            }

            if (numeroDigitado < menor) {
                menor = numeroDigitado;
            }
        }
        System.out.println("O menor numero é: "+ menor);
    }

}
