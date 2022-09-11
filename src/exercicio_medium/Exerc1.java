//1-) Faça um algoritmo para verificar e exibir de 0 a 100, quais são os números Pares e ímpares.

package exercicio_medium;

public class Exerc1 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) { ///resto d divição de par é sempre 0 e impar é diferente de 0
                System.out.println("o numero é :" + i + " é par");
            } else {
                System.out.println("o numero é :" + i + " é impar");
            }
            i++;
        }
    }
}






















