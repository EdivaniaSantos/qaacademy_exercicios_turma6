
//Declarar variável do tipo numerico: i=0, soma;
//        Enquanto(i<=1000 )
//        soma = i+soma;
//
//        Se(soma>= 1500)
//        break; //parar
//        Fim Se
//        Exibir(soma);
//        i++; //i = i+1;
//        Fim Enquanto


//3-) Faça um algoritmo para calcular e exibir a soma de todos os números de 0 a 1000.
//        E parar se caso a soma atingir 1500(Ou mais).EX: 0 +1, 1+2, 3+4.. 1500 | break ou parar

package exercicio_medium;

public class Exerc3 {

    public static void main(String[] args) {
        int soma = 0, i = 0;

        while (i <= 100 && soma <= 1500) {
            soma = i + soma;
            i++;
        }

        System.out.println("soma é igual a: " + soma);


    }

}

