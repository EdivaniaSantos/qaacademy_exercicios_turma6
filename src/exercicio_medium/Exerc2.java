//2-) Faça um algoritmo para ler um valor de investimento, com uma taxa de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido,
//        valor dos juros, e o total. Considerando que a remuneração será no regime de juros compostos.

        package exercicio_medium;

import javax.swing.*;

public class Exerc2 {
    public static void main(String[] args) {

        double investimento, valorTotal =0, valorJuros=0, i = 1,taxaJuros = 0.05;


        investimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o investimento"));

        while (i <= 10) {

            valorJuros = ((investimento+valorJuros)* taxaJuros)+ valorJuros;
            valorTotal = investimento + valorJuros;
            i++;

        }
            System.out.println("você investiu: " + investimento);
            System.out.println("Rendeu o valor: " + valorJuros + " de juros");
            System.out.println("O valor total é: " + valorTotal);

        }
    }
