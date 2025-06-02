package exe6;

public class Main {
    public static void main(String[] args){
        System.out.println("");

        Par<String, Integer> dict = new Par<>();

        dict.setchave("Vinicius");
        dict.setValor(19);

        System.out.println("Teste de dicionário em java:");
        System.out.println("chave: " + dict.getchave() + " // valor: " + dict.getValor());
    }
}
