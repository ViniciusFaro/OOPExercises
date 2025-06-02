package exe10;

// criar uma pilha de pagamentos pra funcionarios que paga sequencialmente os mesmos

public class Main {
    public static void main(String[] args) {
        Pilha<Secretario> ps = new Pilha<>();

        FundoEmpresarial f = new FundoEmpresarial(180);

        ps.enqueue(new Secretario("Yuri", 30));
        ps.enqueue(new Secretario("Alan", 72));
        ps.enqueue(new Secretario("Ana", 100));

        ps.pagarSequencialmente(f);
    }
}
