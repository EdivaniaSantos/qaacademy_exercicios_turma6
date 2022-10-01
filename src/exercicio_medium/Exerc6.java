//6-) Faça um algoritmo para ler um número inteiro, calcular e exibir o Fatorial do número digitado.
//        Ex.:Digitou 10. 10*(10-1)*(10-2)*(10-3).. *(10-1) = 3.628.800

package exercicio_medium;

import javax.swing.*;

public class Exerc6 {

    public void fatorial() {
        int fatorial = 1, numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite ou numero que deseja calcular o fatorial"));

        if (numero >= 0) {
            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial * i;
            }
            System.out.println("Fatorial de " + numero + " é " + fatorial);

        } else{
                System.out.println("informe um numero apartir de zero");
            }

        }
}

