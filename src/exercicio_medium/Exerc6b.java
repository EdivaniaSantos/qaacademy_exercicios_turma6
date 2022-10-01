package exercicio_medium;

import javax.swing.*;

public class Exerc6b {


    public void fatorialB() {
        int fatorial = 1, i;

        fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite ou numero que deseja calcular o fatorial"));
        i= fatorial;

       while (i>1){
           fatorial = fatorial * (i-1);
           i--;

            }
            System.out.println("Fatorial de é: " + fatorial);
        }

    }



