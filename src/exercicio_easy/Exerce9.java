package exercicio_easy;

import javax.swing.*;

public class Exerce9 {
    public int cont(int num1, int i) {
        while (i <= 10) {
            System.out.println(num1 + "X" + i + "=" + num1 * i);
            i = i + 1; // i++;

        }

        return num1;
    }
}

//       public static void main(String[] args) {
//        int num1 = 0, i =1;
//        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
//         while (i <= 10)   {
//             System.out.println(num1 + "X"+ i +"="+num1 *i);
//             i = i + 1; // i++;
//         }
//
//    }
//}
