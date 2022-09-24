package exemplos;

public class MetodosComParemetroMain {

    public static void main(String[] args) {
        texto ("nome ", "Edivania");
        texto1 (2, 4);
        soma (4, 4);
        soma1 (3,2, 5);
        divisao(4,4, 2);
        soma8(4,2);
      //  endereco(rua,alpes);
    }
    public static void texto (String a, String b){
            System.out.println("o texto é " + a + b);
        }
    public static void texto1 (int a, int b){
        System.out.println("o texto é " + a + b);
    }

    public static void soma (int num1, int num2){
        System.out.println("a soma é " + ( num1 + num2));
    }

    public static void soma1 (int a, int b, int c){
        System.out.println("a soma é " + (a + b + c));
    }

    public static void divisao (int a, int b, int c){
        System.out.println("o resultado é " + ((a + b)/c));
    }

        public static  String endereco (String a, String b){
            return a + b;
        }

        public static String texto6 (String a, String b){
            return a + b;
        }

        public static String texto7 (String a, String b){
        return a + b;
    }

    public static int soma8 (int a, int b){
        return (a + b);
    }

    public static String texto9 (String a, String b){
        return a + b;
    }
    public static String texto10 (String a, String b){
        return a + b;
    }

}
