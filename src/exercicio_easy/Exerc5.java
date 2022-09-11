package exercicio_easy;

import javax.swing.*;

public class Exerc5 { //inicio da classe

    public static void main(String[]args){
        //declarar variavel do tipo numerica
        int num1;
        int num2;
        int num3;

        // numero = ler ()
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));// imprimir na tela

        // numero = ler ()
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));// imprimir na tela
        // Exibir numero

        // numero = ler ()
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));// imprimir na tela
        // Exibir numero

        System.out.println("A soma é "+" " +(num1+num2+num3));
        System.out.println("A subtração "+" " +(num1-num2-num3));
        System.out.println("A mutiplicação é "+" " +(num1*num2*num3));
        System.out.println("A media é "+" " +((num1+num2+num3)/3));

    }
    }
