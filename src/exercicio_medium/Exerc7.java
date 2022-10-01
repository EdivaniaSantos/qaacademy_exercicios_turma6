//7-) Faça um algoritmo para ler todos os meses do ano, armazene em um vetor.

package exercicio_medium;

public class Exerc7 {
    public void mesesAno() {

        String [] mes = new String[12];

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
        mes[10] ="Novembro";
        mes[11] ="Dezembro";

        for (String meses: mes) {

            System.out.println("O mes é " + meses);
          //System.out.println(mes[10]); ----vai imprimir apenas um mes
        }
    }
}
