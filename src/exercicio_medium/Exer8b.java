package exercicio_medium;

import javax.swing.*;

public class Exer8b {
    public static void main(String[] args) {

        String[] mes = new String[12];
        int i = 0, num = 0;

        mes[0] = "Janeiro";
        mes[1] = "Fevereiro";
        mes[2] = "Março";
        mes[3] = "Abril";
        mes[4] = "Maio";
        mes[5] = "Junho";
        mes[6] = "Julho";
        mes[7] = "Agosto";
        mes[8] = "Setembro";
        mes[9] = "Outubro";
        mes[10] = "Novembro";
        mes[11] = "Dezembro";

        //for (String meses : mes) {
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
                System.out.println("o mes é:" + mes[num-1]);


            }
        }

