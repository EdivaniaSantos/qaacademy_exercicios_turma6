//5-)  Faça um algoritmo para ler 5 números, verificar e exibir, quais dos 5 números digitados, é o menor.

package exercicio_easy;

import javax.swing.*;

public class Exerc7 { //inicio da classe

    public static void main(String[]args) {
        //declarar variavel do tipo numerica
        double salario, inss;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Salário"));
      //  int media = ((nota1 + nota2) / 2);

        if (salario <= 1045.00) {
            inss = salario * 0.075;
            System.out.println("O valor da variavel será: " +inss);

        }
        if (salario >= 1045.01 && salario <= 2089.60) {
            inss = salario * 0.09;
            System.out.println("o valor do inss será: " + inss);
        }

        if (salario >= 2089.60 && salario <= 3134.40) {
            inss = salario * 0.12;
            System.out.println("o valor do inss será: " + inss);
        }

        if (salario >= 3134.41 && salario <= 6101.06) {
            inss = salario * 0.14;
            System.out.println("o valor do inss será: " + inss);
        }
        if (salario >= 6101.07 ) {
            inss = 854.15;
            System.out.println("o valor do inss será: " + inss);


        }

    }

}