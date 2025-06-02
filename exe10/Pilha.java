package exe10;

public class Pilha<T extends Funcionario> {
    No<T> cabeca;
    private int tam;

    public Pilha() {
        this.cabeca = null;
        this.tam = 0;
    }

    public void enqueue(T chave) {
        if (tam == 0) {
            this.cabeca = new No<>(chave);
            tam++;
            return;
        }
        No<T> novo = new No<>(chave);
        novo.setProx(cabeca);
        cabeca = novo;
        tam++;
    }

    public void dequeue() {
        if (tam == 0) {
            return;
        }
        cabeca = cabeca.getProx();
        tam--;
        return;
    }

    public void percorrer() {
        No<T> atual = cabeca;
        for (int i = 0; i < tam; i++) {
            System.out.println("[ " + atual.getChave() + " ]");
            atual = atual.getProx();
        }
    }

    public void pagarSequencialmente(FundoEmpresarial f) {
        No<T> atual = cabeca;
        while (atual != null) {
            System.out.println("-------------");
            System.out.println("Pagando: " + atual.getChave().getNome());
            System.out.println("valor da bonificacao: " + atual.getChave().getBonificacao());
            if (atual.getChave().solicitarBonificacao(f) == false) {
                System.out.println("Pagamento falhou, falta de fundos...");
                System.out.println("------Finalizando pagamento geral------");
                return;
            }
            atual.getChave().setStatus(true);
            System.out.println("Status de pagamento: " + atual.getChave().getStatus());
            atual = atual.getProx();
            dequeue();
        }
    }

}
