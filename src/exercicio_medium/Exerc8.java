package exercicio_medium;

public class Exerc8 {
    public void mesesDoAno() {

        String[] mes = new String[12];
        int i = 0;

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

// while(i<meses.length)

        while (i <= 11) {
            System.out.println("O mes é " + mes[i]);
            i++;
        }
    }

}