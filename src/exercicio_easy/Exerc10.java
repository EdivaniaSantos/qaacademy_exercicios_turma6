package exercicio_easy;

import javax.swing.*;

public class Exerc10 {
    public double Investimento(double invest, double taxa, double valorJuros) {

        int i = 1;
        while (i <= 10) {
            valorJuros = (invest * taxa) + valorJuros;
            i = i + 1;
        }

        System.out.println("valor do juros " + valorJuros);
        System.out.println("valor investimento " + invest);
        System.out.println("valor total " + (valorJuros + invest));

        return invest;
    }

}


//    public static void main(String[] args) {
//        double investimento, taxa = 0.05, valorJuros = 0, valorTotal = 0;
//        int i = 1;
//        investimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o investimento"));
//        while (i <= 10) {
//            valorJuros = (investimento * taxa) + valorJuros;
//            i = i + 1;
//        }
//
//            System.out.println("valor do juros " + valorJuros);
//            System.out.println("valor investimento " + investimento);
//            System.out.println("valor total " + (valorJuros + investimento));
//        }
//    }
