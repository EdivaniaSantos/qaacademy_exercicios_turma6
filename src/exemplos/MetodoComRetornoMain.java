package exemplos;

public class MetodoComRetornoMain {
    public static void main(String[] args) {
        System.out.println(saoPaulo());
        System.out.println(rioDeJaneiro());
        System.out.println(minasGerais());
        System.out.println(santaCatarina());
        System.out.println((bahia()));

       // String cidade1 = saoPaulo();  outra forma de fazer armazenando em uma variavel
       // System.out.println(cidade1);

    }
    public static String saoPaulo(){
        return "saoPaulo";
    }
    public static String rioDeJaneiro(){
        return "RioDeJaneiro";
    }
    public static String minasGerais(){
        return "MinasGerais";
    }
    public static String santaCatarina(){
        return "SantaCatarina";
    }
    public static String bahia(){
        return "Bahia";
    }
}
