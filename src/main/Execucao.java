package main;

import exemplos.MetodoSemMain;
import exemplos.MetodoSemMain2;

public class Execucao {
    public static void main(String[] args) {

          MetodoSemMain2 metodo2 = new MetodoSemMain2();
//        MetodoSemMain metodo = new MetodoSemMain();
//        metodo.printarCores();
//        System.out.println(metodo.multiplicaoDoisNumeros(2,4));
//        System.out.println(metodo.somaDoisNumeros(5,6));
          System.out.println(metodo2.imc(60,1.60));
          System.out.println(metodo2.nome("Edivania", "Pexoto"));


    }
}
