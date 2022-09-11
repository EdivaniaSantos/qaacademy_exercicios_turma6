package exercicio_easy;

import javax.swing.*;

public class Exerc6 { //inicio da classe

    public static void main(String[]args) {
        //declarar variavel do tipo numerica
        int nota1;
        int nota2;


        // numero = ler ()
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));// imprimir na tela

        // numero = ler ()
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));// imprimir na tela
        // Exibir numero


        int media = ((nota1 + nota2) / 2);

        if (media == 5) {
            System.out.println(media);
            System.out.println("exame");
        }
            if (media > 5){
                System.out.println(media);
            System.out.println("Aprovado");

        }
        //  else  System.out.println("Reprovado");

        if (media < 5) {
            System.out.println(media);
            System.out.println("Reprovado");

        }

    }

    }