package exercicio_easy;

import javax.swing.*;

public class Exerc8 { //inicio da classe
    public static void main(String[] args) {
        double salario, ir=0;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Salário"));
        if (salario >= 00.00 && salario <= 1903.98) {
            System.out.println("insento do imposto de renda : ");
        }

        if (salario >= 1903.99 && salario <= 2826.65) {
            ir = (salario * 0.15) - 354.80;
        }

        if (salario >= 3751.06 && salario <= 24664.68) {
            ir = (salario * 0.275) - 636.13;
        }

        if (salario > 4664.68) {
            ir = (salario * 0.275) - 869.36;
        }
        System.out.println("salario bruto : " + salario );
        System.out.println("salario liquido : " + (salario - ir));
        System.out.println("imposto a pagar : " + ir);

    }
}


//    public static void main(String[]args) {
//        //declarar variavel do tipo numerica
//        double salario, salarioliquido, imposto1= 0, imposto2 = 142.8,
//                imposto3= 354.8, imposto4 =636.13, imposto5=869.36;
//
//        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Salário"));
//
//         ;
//        if (salario >= 00.00 && salario <= 1903.98) {
//            System.out.println("Salario : " +salario);
//            System.out.println("Salario liquido: " + salarioliquido = (salario-imposto1);
//            System.out.println("imposto de renda: " +imposto1);
//        }
//        if (salario >= 1903.99 && salario <= 2826.65) {
//            salarioLiquito = salario;
//            imposto2 = salario - 142.8;
//            System.out.println("Salario : " +salario);
//            System.out.println("Salario liquido: " +salarioLiquito);
//            System.out.println("imposto de renda: " +imposto);
//
//
//        if (salario >= 1045.01 && salario <= 2089.60) {
//            inss = salario * 0.09;
//            System.out.println("o valor do inss será: " + inss);
//        }
//
//        if (salario >= 2089.60 && salario <= 3134.40) {
//            inss = salario * 0.12;
//            System.out.println("o valor do inss será: " + inss);
//        }
//
//        if (salario >= 3134.41 && salario <= 6101.06) {
//            inss = salario * 0.14;
//            System.out.println("o valor do inss será: " + inss);
//        }
//        if (salario >= 6101.07 ) {
//            inss = 854.15;
//            System.out.println("o valor do inss será: " + inss);
//
//
//        }
//
//    }
//
//}