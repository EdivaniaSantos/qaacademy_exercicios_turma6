package exercicio_medium;

public class Exer3b {

    public void calculos() {
        int soma = 0, i = 0;

        while (i <= 100) {
            soma = i + soma;


            if (soma >= 1500) {
                break;
            }
            System.out.println("soma é igual a: " + soma);
            i++;
        }
    }

}

